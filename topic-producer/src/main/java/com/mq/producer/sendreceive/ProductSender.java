package com.mq.producer.sendreceive;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: SongXianYang
 * @create: 2020-11-06 10:34
 **/
@Component
public class ProductSender {

    AmqpTemplate rabbitmqTemplate;

    public ProductSender(AmqpTemplate rabbitmqTemplate) {
        this.rabbitmqTemplate = rabbitmqTemplate;
    }

    /**
     * 交换器名称
     */
    @Value("${mq.config.exchange}")
    private String exchange;
    public void send(String msg) {
        /**
         * 参数1：交换器
         * 参数2：路由键
         * 参数3：消息
         */
        this.rabbitmqTemplate.convertAndSend(this.exchange,"product.log.debug","商品debug="+msg);
        this.rabbitmqTemplate.convertAndSend(this.exchange,"product.log.info","商品info="+msg);
        this.rabbitmqTemplate.convertAndSend(this.exchange,"product.log.warn","商品warn="+msg);
        this.rabbitmqTemplate.convertAndSend(this.exchange,"product.log.error","商品error="+msg);
    }
}
