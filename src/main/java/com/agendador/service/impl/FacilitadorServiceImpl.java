package com.agendador.service.impl;

import com.agendador.entity.Facilitador;
import com.agendador.repository.FacilitadorRepository;
import com.agendador.service.FacilitadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ivaldo on 12/10/2016.
 */
@Service
public class FacilitadorServiceImpl implements FacilitadorService {

    @Autowired
    FacilitadorRepository facilitadorRepository;

    public Facilitador createFacilitador(Facilitador facilitador) {
        Facilitador facilitadorToReturn = facilitadorRepository.save(facilitador);
        return facilitadorToReturn;
    }
}
