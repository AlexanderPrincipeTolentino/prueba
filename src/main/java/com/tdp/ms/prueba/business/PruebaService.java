package com.tdp.ms.prueba.business;

import com.tdp.ms.prueba.model.PruebaResponse;

public interface PruebaService {
    PruebaResponse get();

    PruebaResponse put(String name);
}
