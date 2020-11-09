package com.song.mq.sendreceive;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 通过监听这个消息队列,获取消息
 * @author: SongXianYang
 * @create: 2020-11-06 10:37
 **/
@Component
public class Receive {

    @RabbitListener(queues = "create-queue")
    public void accept(String msg) {
        System.out.println("接收到的消息："+msg);
    }
}
