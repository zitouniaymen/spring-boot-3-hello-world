package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

    public static void main(String[] args) {
        System.out.prinln("hellon");
        SpringApplication.run(HelloWorldApplication.class, args);
    }

}
