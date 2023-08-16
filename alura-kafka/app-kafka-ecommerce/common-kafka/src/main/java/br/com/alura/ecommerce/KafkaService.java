package br.com.alura.ecommerce;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.io.Closeable;
import java.io.IOException;
import java.time.Duration;
import java.util.Collections;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import java.util.regex.Pattern;

public class KafkaService<T> implements Closeable {

    private final KafkaConsumer<String, T> consumer;
    private final ConsumerFunction parse;

    public KafkaService(String groupId, String topic, ConsumerFunction parse, Class<T> clazz, Map<String,String > properties) {
        this.parse = parse;
        this.consumer = new KafkaConsumer<>(getProperties(groupId, clazz, properties));
        consumer.subscribe(Collections.singletonList(topic));
    }

    public KafkaService(String groupId, Pattern topic, ConsumerFunction parse, Class<T> clazz, Map<String,String > properties) {
        this.parse = parse;
        this.consumer = new KafkaConsumer<>(getProperties(groupId, clazz, properties));
        consumer.subscribe(topic);
    }


    private Properties getProperties(String groupId, Class<T> clazz, Map<String,String > properties) {
        var configs = new Properties();
        configs.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        configs.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        configs.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class.getName());
        configs.setProperty(ConsumerConfig.GROUP_ID_CONFIG, groupId);
        configs.setProperty(ConsumerConfig.CLIENT_ID_CONFIG, UUID.randomUUID().toString());
        //Control commit config
        //properties.setProperty(ConsumerConfig.MAX_POLL_RECORDS_CONFIG, "1");
        configs.setProperty(JsonDeserializer.TYPE_CONFIG, clazz.getName());
        configs.putAll(properties);
        return configs;
    }


    public void run() throws InterruptedException {
        while (true){
            Thread.sleep(2000);
            var records = consumer.poll(Duration.ofMillis(100));
            if(!records.isEmpty()){
                System.out.println("Found " + records.count() + " records");
                //como estáva antes
                    //records.forEach(record -> parse.consume(record));
                //como ficou usando reference method (ficou o cremeeee)
                    records.forEach(parse::consume);
            }



        }
    }

    @Override
    public void close() {
        consumer.close();
    }
}
