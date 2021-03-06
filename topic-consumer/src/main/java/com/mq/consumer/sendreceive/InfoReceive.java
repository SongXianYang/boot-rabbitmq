package com.mq.consumer.sendreceive;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

/**
 * info消息接收者
 * @RabbitListener -->bindings绑定队列
 * @QueueBinding -->value  绑定队列名称
 * ---> exchange 绑定交换器
 * ---> key 配置路由键
 * @Queue value-->配置队列名称
 *        autoDelete-->是否是一个可删除的临时队列
 * @Exchange value-->配置交换器名称
 *           type-->指定具体的交换器类型
 * 通过监听这个消息队列,获取消息
 * @author: SongXianYang
 * @create: 2020-11-06 10:37
 **/
@Component
@RabbitListener(bindings = @QueueBinding(
        value = @Queue(value = "${mq.config.queue.info}", autoDelete = "true"),
        exchange = @Exchange(value = "${mq.config.exchange}", type = ExchangeTypes.TOPIC),
        key = "*.log.info"
))
public class InfoReceive {

    @RabbitHandler
    public void accept(String msg) {
        System.out.println("Info（主题）接收到的消息："+msg);
    }
}
