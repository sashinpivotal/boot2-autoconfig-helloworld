package com.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// TODO-10: Study the following
// Note that hello-starter has a transitive dependency on
// hello-lib. This is similar to the way that many Spring Boot
// starters have dependencies on the library (or libraries)
// that they configure.
// TODO-11: Review this code
// TODO-12: Note that hello-starter has spring.factories file
//          under src/main/resources/META-INF directory.
//          Add the full path if this configuration to the right
//          of equal(=) sign
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
