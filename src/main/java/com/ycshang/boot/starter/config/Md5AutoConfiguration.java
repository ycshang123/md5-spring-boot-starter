package com.ycshang.boot.starter.config;

import com.ycshang.boot.starter.service.Md5Service;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: spring-boot-learning
 * @description:
 * @author: ycshang
 * @create: 2022-03-08 20:15
 **/

@Configuration
@EnableConfigurationProperties({RabbitProperties.class})
public class Md5AutoConfiguration {
    @Bean
    Md5Service md5Service() {
        return new Md5Service();
    }
}