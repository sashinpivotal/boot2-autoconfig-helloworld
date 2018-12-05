package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// TODO-03: Finish MyCommandLineRunner code in which
//          you are going to say greeting via
//          injected HelloService
@Component
public class MyCommandLineRunner implements CommandLineRunner {

    private final HelloService service;

    public MyCommandLineRunner(HelloService service) {
        this.service = service;
    }

    @Override
    public void run(String... args) {
        service.greet();
    }
}
