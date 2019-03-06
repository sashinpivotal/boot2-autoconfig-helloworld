package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// TODO-15: Run the application and you will experience a
//          failure of "'HelloService' that could not be found"
// TODO-16: Fix the problem (add @Bean definition of "HelloService")
//          and run it again and verify it works

// TODO-20: Now we are ready to leverage "hello-starter" project.
//          First, we want to configure "TypicalHelloService" bean
//          via "hello-starter" project instead of directly from
//          "hello-lib" project.

// TODO-21: Comment out the explicit @Bean configuration you just
//          added in Step 06 above
//
// TODO-25: Import the configuration class of "hello-starter"
//          - Add the following statement
//            @Import({HelloAutoConfig.class})
//            just below @SpringBootApplication statement
//          - Rebuild the whole application and then run it.
//            Note that The "HelloService" bean ("TypicalHelloService") is
//            now contributed by the "hello-starter".
//            At this point, "hello-starter" is nothing more than
//            a library. It does not perform any auto-configuration.
//
// TODO-26: Now we are going to define application provided HelloService  bean
//          - Create "MyOwnHelloService" Bean under "com.app" directory
//          - Create new configuration class called
//            "HelloAppConfig" under "com.config" directory
//          - Configure "MyOwnHelloService" bean using @Bean method.
//          - Import "HelloAppConfig" configuration class by adding
//            @Import({HelloAppConfig.class, HelloAutoConfig.class})
//            just below @SpringBootApplication.
//          - Run the application and observe that "TypicalHelloService"
//            always wins.
//
//          At this point, Spring picks up a bean that is loaded
//          last, in this case, "TypicalHelloService" bean from the
//          "HelloAutoConfig" class.
//
//          You can change the order of bean loading by switching the
//          two configuration classes lie
//          @Import({HelloAutoConfig.class, HelloAppConfig.class})
//          then run the application. This time, you will always see
//          "MyOwnHelloService" bean always wins.
//
// TODO-30: Now we would like to change the behavior through
//          auto-configuration so that the
//          "TypicalHelloService" gets configured only when the
//          application did not provide its own "HelloService" bean.
//
// TODO-31: Remove "HelloAutoConfig.class" from @Import statement
//          So the the import statement should look like following
//          @Import({HelloAppConfig.class})
//
// TODO-35: Run the application again and see which one wins
//          This time, "MyOwnHelloService" bean should win.

// TODO-36: In the console, search for "HelloAutoConfig" and
//          see how auto-configuration is performed
//
// TODO-37: Comment out @Import statement and run the application
//          and observe that "TypicalHelloService" bean wins.
//
// TODO-38: In the console, search for "HelloAutoConfig" and
//          see how auto-configuration is performed

@SpringBootApplication

public class HelloApplication {

  public static void main(String[] args) {
    SpringApplication.run(HelloApplication.class, args);
  }

}

