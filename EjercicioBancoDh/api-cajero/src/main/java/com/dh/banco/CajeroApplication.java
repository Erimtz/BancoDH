package com.dh.banco;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class CajeroApplication {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}