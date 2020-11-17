package com.tdp.ms.prueba.business.impl;

import com.tdp.ms.prueba.business.PruebaService;
import com.tdp.ms.prueba.model.PruebaResponse;
import org.springframework.stereotype.Service;

@Service
public class PruebaServiceImpl implements PruebaService {

    @Override
    public PruebaResponse get() {
        return new PruebaResponse("Hello world!");
    }

    @Override
    public PruebaResponse put(String name) {
        return new PruebaResponse(name + " created!");
    }

}
