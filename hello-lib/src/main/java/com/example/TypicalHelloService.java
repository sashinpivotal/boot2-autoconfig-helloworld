package com.example;

// TODO-01: Review hello-lib project - it is just
//          a library that contains TypicalHelloService
public class TypicalHelloService implements HelloService {
    @Override
    public void greet() {
        System.out.println("Hello, Typical!");
    }
}
