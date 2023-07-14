package com.dh.banco.controller;

import com.dh.banco.service.CajaService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CajaController {

    private final CajaService cajaService;

    public CajaController(CajaService cajaService) {
        this.cajaService = cajaService;
    }

    public String getConfig(@RequestParam("denominaciones") String denominaciones,
                            @RequestParam("efectivoMaximo") Integer efectivoMaximo) {
        return cajaService.getConfig(denominaciones, efectivoMaximo);
    }
}
