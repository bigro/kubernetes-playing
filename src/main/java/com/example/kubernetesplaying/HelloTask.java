package com.example.kubernetesplaying;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HelloTask implements CommandLineRunner {
    @Value("${hello.user.name}")
    String name;

    @Value("${hello.user.password}")
    String password;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello!! World!!");
        System.out.println("User:" + name);
        System.out.println("Password:" + password);
    }
}
