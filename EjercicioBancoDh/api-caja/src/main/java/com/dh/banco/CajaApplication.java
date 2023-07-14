package com.dh.banco;

import com.dh.banco.repository.CajaRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class CajaApplication {
    public static void main(String[] args) {
        SpringApplication.run(CajaApplication.class, args);
    }

    CajaRepository.Caja nuevaCaja = new CajaRepository.Caja("5", "COP", 100000);


}