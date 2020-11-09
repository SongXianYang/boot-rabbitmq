package com.mq.producer.sendreceive;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SenderTest {
    @Autowired
    UserSender userSender;

    @Autowired
    ProductSender productSender;

    @Autowired
    OrderSender orderSender;

    @Test
    void send() {
        this.userSender.send("User发送.....日志");
        productSender.send("product发送.....日志");
        orderSender.send("order发送......日志");
    }
}