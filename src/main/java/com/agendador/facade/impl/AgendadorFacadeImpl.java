package com.agendador.facade.impl;

import com.agendador.entity.Facilitador;
import com.agendador.facade.AgendadorFacade;
import com.agendador.service.FacilitadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Ivaldo on 12/10/2016.
 */
@Component
public class AgendadorFacadeImpl implements AgendadorFacade {

    @Autowired
    FacilitadorService facilitadorService;

    public Facilitador createFacilitador(Facilitador facilitador) {
        Facilitador facilitadorToReturn = facilitadorService.createFacilitador(facilitador);
        return facilitadorToReturn;
    }
}
