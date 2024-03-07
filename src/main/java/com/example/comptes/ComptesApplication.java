package com.example.comptes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class ComptesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComptesApplication.class, args);
    }

}
