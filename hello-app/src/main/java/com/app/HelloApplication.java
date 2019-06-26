package com.app;

import com.lib.HelloService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

// TODO-15: Run the application and you will experience a
//          failure of "'HelloService' that could not be found"
// TODO-16: Fix the problem (add @Bean definition of "HelloService"
//          with Bean id "helloService") and run it again,
//          verify it works.
//
//          Once this step is done, go to TO-DO-20 below

// TODO-20: Now we are ready to leverage "hello-starter" project.
//          First, we want to configure "TypicalHelloService" bean
//          via "hello-starter" project instead of directly from
//          "hello-lib" project.
//
// TODO-21: Comment out the explicit @Bean configuration you just
//          added in the previous step
//
// TODO-25: Import the configuration class of "hello-starter"
//          - Add the following statement
//            @Import({HelloAutoConfig.class})
//            just below @SpringBootApplication statement
//          - Run the application
//          - Note that The "HelloService" bean ("TypicalHelloService") is
//            now contributed by the "hello-starter".
//            At this point, "hello-starter" is nothing more than
//            a library. It does not perform any auto-configuration yet.
//
// TODO-26: Now we are going to define application provided HelloService bean
//          - Create "MyOwnHelloService" Bean under "com.app" directory
//          - Create new configuration class called
//            "HelloAppConfig" under "com.config" package
//          - Configure "MyOwnHelloService" bean using @Bean method.
//          - Import "HelloAppConfig" configuration class by replacing
//            existing @Import statement with
//            @Import({HelloAppConfig.class, HelloAutoConfig.class})
//          - Run the application and observe that "TypicalHelloService"
//            always wins.
//
//          At this point, Spring picks up a bean that is loaded
//          last, in this case, "TypicalHelloService" bean from the
//          "HelloAutoConfig" class always wins because beans defined
//          in the "HelloAutoConfig" are loaded last.
//
//          - Change the order of bean loading by switching the
//            two configuration classes like
//            @Import({HelloAutoConfig.class, HelloAppConfig.class})
//          - Run the application. This time, you will always see
//            "MyOwnHelloService" bean always wins.

//          - Once this step is done, go to TO-DO-30 below

// TODO-30: Now we would like to change the behavior through
//          auto-configuration so that the
//          "TypicalHelloService" gets configured only when the
//          application did not provide its "MyOwnHelloService" bean.
//
// TODO-31: Remove "HelloAutoConfig.class" from @Import statement
//          So now the import statement should look like
//          @Import({HelloAppConfig.class})
//


// TODO-35: Run the application again and see which one wins
//          This time, "MyOwnHelloService" bean should win.
//
// TODO-36: In the console, search for "HelloAutoConfig" and
//          see how auto-configuration is performed.
//          You should see the one positive match and one negative match.
//
// TODO-37: Comment out @Import statement and run the application
//          and observe that "TypicalHelloService" bean wins.
//
// TODO-38: In the console, search for "HelloAutoConfig" and
//          see how auto-configuration is performed.
//          This time, you should see the two positive matches.

@SpringBootApplication

public class HelloApplication {

  public static void main(String[] args) {
    SpringApplication.run(HelloApplication.class, args);
  }

  // TODO-14: Review CommandLineRunner code below
  //          in which you are going to say greeting via
  //          injected HelloService
  @Bean
  public CommandLineRunner commandLineRunner(HelloService helloService){

    return args -> helloService.greet();

  }

}

