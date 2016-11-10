package com.agendador.facade;

import com.agendador.entity.Facilitador;

import java.util.List;

/**
 * Created by Ivaldo on 12/10/2016.
 */
public interface AgendadorFacade {

    Facilitador createFacilitador(Facilitador facilitador);

    Facilitador getFacilitadorById(String id);

    List<Facilitador> getAllFacilitadores();

    void delete(Facilitador facilitador);

    Facilitador update(Facilitador facilitador);
}
