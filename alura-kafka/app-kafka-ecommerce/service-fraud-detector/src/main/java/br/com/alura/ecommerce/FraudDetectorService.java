package br.com.alura.ecommerce;


import org.apache.kafka.clients.consumer.ConsumerRecord;

import java.util.Map;

public class FraudDetectorService {

    public static void main(String[] args) throws InterruptedException {

        var fraudService = new FraudDetectorService();
        try(var service = new KafkaService<Order>(FraudDetectorService.class.getSimpleName(),
                "ECOMMERCE_NEW_ORDER" ,
                fraudService::parse,
                Order.class,
                Map.of())){
            service.run();
        }


    }

    private void parse(ConsumerRecord<String, Order> record) {
        System.out.println("-------------------------------------------------------------");
        System.out.println("Processing new order ");
        System.out.println("Key: : " + record.key());
        System.out.println("Value: " + record.value());
        System.out.println("Partition : " + record.partition());
        System.out.println("Offset : " + record.offset());
        System.out.println("-------------------------------------------------------------");
    }


}
