package com.example.redisqueue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableRedisRepositories
@EnableWebMvc
public class RedisQueueApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisQueueApplication.class, args);
    }

}
