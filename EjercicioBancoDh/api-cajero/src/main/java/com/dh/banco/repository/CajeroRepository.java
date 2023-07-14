package com.dh.banco.repository;

import lombok.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface CajeroRepository extends MongoRepository<String, CajeroRepository.Cajero> {



    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    @Builder
    public class Cajero {
        @Id
        private String id;
        private Integer billetes;
        private Integer monedas;
    }
}
