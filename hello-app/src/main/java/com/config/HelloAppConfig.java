package com.config;

import com.app.MyOwnHelloService;
import com.lib.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloAppConfig {

    @Bean
    public HelloService helloService(){
        return new MyOwnHelloService();
    }
}
