package com.app;

import com.lib.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// TODO-04: Review "MyCommandLineRunner" code of hello-app project below
//          in which you are going to say greeting via
//          injected HelloService
@Component
public class MyCommandLineRunner implements CommandLineRunner {

    private final HelloService service;

    @Autowired
    public MyCommandLineRunner(HelloService service) {
        this.service = service;
    }

    @Override
    public void run(String... args) {
        service.greet();
    }
}
