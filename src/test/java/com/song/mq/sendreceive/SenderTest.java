package com.song.mq.sendreceive;

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
        this.sender.send("msg-Queue");
    }
}