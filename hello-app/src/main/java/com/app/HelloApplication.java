package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// TODO-05: Run the application and you will experience a
//          failure of "'HelloService' that could not be found"
// TODO-06: Fix the problem (add @Bean definition of "HelloService")
//          and run it again and verify it works

// TODO-07: Now we are ready to leverage spring Boot starter. Review the following:
// When we use a Spring Boot starter, we often start out without
// configuring any beans. The starter sets them up for us.
// For example, "spring-boot-starter-jdbc" can automatically
// configure a "JdbcTemplate" bean.
//
// We’d like to do the same: let’s have the "hello-starter"
// automatically contribute the "HelloService" bean
// so that we don’t have to in "hello-app".
// TODO-08: Comment out the explicit @Bean configuration you just
//          added in Step 06 above
//
// TODO-12: Rebuild the whole application and then run the application.
//          Note that The "HelloService" bean is
//          now contributed by the "hello-starter".
// TODO-13: Create "MyOwnHelloService" Bean and use it and run
//          the application again and see which
//          one ("MyOwnHelloService" or "TypicalHelloService")
//          wins. Observe that TypicalHelloService wins.
//          We will fix it in later steps.
// TODO-16: Run the application again and see which one wins
//          This time, MyOwnHelloService should win

@SpringBootApplication
public class HelloApplication {

  public static void main(String[] args) {
    SpringApplication.run(HelloApplication.class, args);
  }

}

