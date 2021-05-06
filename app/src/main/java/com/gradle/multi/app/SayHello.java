package com.gradle.multi;

import java.io.IOException;

public class SayHello {
    public static void main(String[] args) throws IOException {
        SayServiceImpl sayServiceImpl = new SayServiceImpl();
        System.out.println(sayServiceImpl.greeting(args[0]));
    }
}