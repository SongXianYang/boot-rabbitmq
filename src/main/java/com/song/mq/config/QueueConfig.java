package com.song.mq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: SongXianYang
 * @create: 2020-11-06 10:02
 * 1、在项目启动时就被初始化
 **/

@Configuration
public class QueueConfig {
    /**
    *@Description: 创建一个消息队列
    *@Param: []
    *@return: org.springframework.amqp.core.Queue
    *@Author: SongXianYang
    *@date: 2020/11/6
    */
    @Bean
    public Queue createQueue() {
        //返回一个队列，然后交给spring-ioc管理
        return new Queue("create-queue");
    }
}
