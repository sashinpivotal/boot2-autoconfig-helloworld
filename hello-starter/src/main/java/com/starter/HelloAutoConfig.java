package com.starter;

import com.lib.HelloService;
import com.lib.TypicalHelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// TODO-11: Note that hello-starter has its own configuration class
@Configuration
// TODO-15a: Add @ConditionalOnClass(HelloService.class)
@ConditionalOnClass(HelloService.class)
public class HelloAutoConfig {

    // TODO-15b: Add @ConditionalOnMissingBean(HelloService.class)
    @ConditionalOnMissingBean(HelloService.class)
    @Bean
    HelloService helloService() {
        return new TypicalHelloService();
    }

}
