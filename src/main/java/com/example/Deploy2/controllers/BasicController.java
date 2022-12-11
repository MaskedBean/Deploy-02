package com.example.Deploy2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class BasicController {

    @GetMapping("/")
    public int getSum(){
        Random random = new Random();
        int a = random.nextInt(0, 10);
        System.out.println("First random number: " + a);
        int b = random.nextInt(0, 10);
        System.out.println("Second random number: " + b);
        int sum = a + b;
        return sum;
    }
}
