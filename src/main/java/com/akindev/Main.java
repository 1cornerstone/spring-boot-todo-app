package com.akindev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Main {
//    @RequestMapping("/")
//    String home() {
//        return "lets perform magic with spring boot";
//    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}

