package com.dh.banco.repository;

import lombok.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.Optional;

@Repository
public interface CajaRepository extends MongoRepository<String, CajaRepository.Caja> {

    Optional<Caja> findDenominaciones(String denominaciones);

    int findEfectivoMaximo (Integer efectivoMaximo);

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    @Builder
    public  class Caja {
        @Id
        private String id;
        private String denominaciones;
        private Integer efectivoMaximo;
    }
}
