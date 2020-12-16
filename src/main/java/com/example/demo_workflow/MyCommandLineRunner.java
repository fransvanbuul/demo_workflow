package com.example.demo_workflow;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Executing " + Arrays.asList(args));
        Runtime.getRuntime().exec(args).waitFor();
    }
}
