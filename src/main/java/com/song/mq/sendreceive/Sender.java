package com.song.mq.sendreceive;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

/**
 * @author: SongXianYang
 * @create: 2020-11-06 10:34
 **/
@Component
public class Sender {

    AmqpTemplate rabbitmqTemplate;

    public Sender(AmqpTemplate rabbitmqTemplate) {
        this.rabbitmqTemplate = rabbitmqTemplate;
    }

    public void send(String msg) {
        this.rabbitmqTemplate.convertAndSend("create-queue", msg);
    }
}
