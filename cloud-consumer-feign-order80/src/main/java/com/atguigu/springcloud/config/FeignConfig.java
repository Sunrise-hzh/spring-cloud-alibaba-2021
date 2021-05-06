package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author huangzihua
 * @date 2021-04-23
 */
@Configuration
public class FeignConfig {
    /**
     * NONE、BASIC、HEADERS、FULL
     * @return
     */
    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
