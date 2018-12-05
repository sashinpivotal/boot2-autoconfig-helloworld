package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// TODO-04: Run the application and you will experience a
//          failure of "'com.example.HelloService' that could not be found"
// TODO-05: Fix the problem and run it again
// TODO-06: Review the following:
// When we use a Spring Boot starter, we often start out without
// configuring any beans. The starter sets them up for us.
// For example, spring-boot-starter-data-jpa can automatically
// configure a DataSource bean.
//
// We’d like to do the same: let’s have the hello-starter
// dependency automatically contribute the HelloService bean
// so that we don’t have to in hello-app.
// TODO-07: Comment out the explicit @Bean configuration you just
//          added in Step 05 above from HelloAppApplication.java
// TODO-13: Run the application. Note that The HelloService bean is
//          now contributed by the starter.
// TODO-14: Create MyOwnHelloService Bean and use it and run
//          the application again and see which
//          one (MyOwnHelloService or TypicalHelloService)
//          wins. Observe that TypicalHelloService wins.
//          We will fix it in step 15
// TODO-15c: Run the application again and see which one wins
// TODO-15d: Using browser, go to http://localhost:8080/actuator/conditions
//          and search for "HelloAutoConfig"
@SpringBootApplication
public class HelloApplication {

  public static void main(String[] args) {
    SpringApplication.run(HelloApplication.class, args);
  }

}

