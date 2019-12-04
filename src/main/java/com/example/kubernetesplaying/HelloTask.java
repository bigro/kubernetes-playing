package com.example.kubernetesplaying;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HelloTask implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello!! World!!");
    }
}