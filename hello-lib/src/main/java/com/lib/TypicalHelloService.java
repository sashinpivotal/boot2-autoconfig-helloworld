package com.lib;

// TODO-02: Review "hello-lib" project - it is just
//          a library that contains "TypicalHelloService"
//          as shown below.
public class TypicalHelloService implements HelloService {
    @Override
    public void greet() {
        System.out.println("Hello, Typical!");
    }
}
