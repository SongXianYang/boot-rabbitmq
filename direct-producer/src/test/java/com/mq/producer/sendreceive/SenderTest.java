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
    void send() throws InterruptedException {
        while (true) {
            Thread.sleep(1000);
            this.sender.send("转换器的发布订阅（Info）");
        }
    }
}