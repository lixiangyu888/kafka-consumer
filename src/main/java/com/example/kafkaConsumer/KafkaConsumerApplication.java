package com.example.kafkaConsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaConsumerApplication {

    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumerApplication.class);

    public static void main(String[] args) {
        System.out.println();
        logger.info("***************************************************");
        logger.info("******** Kafka Consumer BOOT Sunning Start ********");
        logger.info("***************************************************");
        SpringApplication.run(KafkaConsumerApplication.class, args);
        System.out.println();
        logger.info("***************************************************");
        logger.info("***** Kafka Consumer BOOT Start Successfully ******");
        logger.info("***************************************************");
    }

}
