package com.dh.banco.service;

import com.dh.banco.repository.CajaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Service
public class CajaService {

    private final CajaRepository cajaRepository;

    public CajaService(CajaRepository cajaRepository) {
        this.cajaRepository = cajaRepository;
    }

    @GetMapping
    public String getConfig(String findDenominaciones, Integer findEfectivoMaximo) {
            String demoninacionesConfig = cajaRepository.findDenominaciones(findDenominaciones) + " , ";
            int efectivoMaximoConfig = cajaRepository.findEfectivoMaximo(findEfectivoMaximo);

            return "Denominaciones de billetes: " + demoninacionesConfig +
                    "Efectivo máximo: " + efectivoMaximoConfig;
    }
}
