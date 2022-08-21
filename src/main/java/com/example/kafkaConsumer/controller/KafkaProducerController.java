package com.example.kafkaConsumer.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @description: kafka生产者
 * @author: Li Xiangyu
 * @date: 2022/8/12 20:51
 **/
@Api(tags = "kafka生产者")
@EnableSwagger2
@RestController
@RequestMapping("/producer")
public class KafkaProducerController {

    public static final Logger logger = LoggerFactory.getLogger(KafkaProducerController.class);

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @GetMapping("/sendByKafka")
    @ApiOperation(value = "发消息", notes = "向kafka发消息")
    public void send(String topic,String message){
        // send ( topic , 消息信息 )
        kafkaTemplate.send(topic,message);
        logger.info(topic+" : "+message);
    }
}
