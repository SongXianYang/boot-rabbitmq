package com.mq.producer.sendreceive;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SenderTest {
    @Autowired
    Sender sender;

    @Test
    void send() {
        this.sender.send("广播模式不指定路由键，消息消费者直接全部订阅消费。（就是都可以所有服务只要配置指定交换器都可接收到消息）");
    }
}