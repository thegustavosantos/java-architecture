package br.com.alura.ecommerce;

import org.apache.kafka.clients.consumer.ConsumerRecord;

import java.util.Map;

public class EmailService {

    public static void main(String[] args) throws InterruptedException {

        var emailService = new EmailService();
        try(var service = new KafkaService(
                EmailService.class.getSimpleName(),
                "ECOMMERCE_SEND_EMAIL",
                emailService::parse,
                Email.class,
                Map.of())){
            service.run();
        };


    }

    private void parse(ConsumerRecord<String, Email> record) {
        System.out.println("-------------------------------------------------------------");
        System.out.println("Sending email");
        System.out.println("Key: : " + record.key());
        System.out.println("Value: " + record.value());
        System.out.println("Partition : " + record.partition());
        System.out.println("Offset : " + record.offset());
        System.out.println("Sent email");
        System.out.println("-------------------------------------------------------------");
    }
}
