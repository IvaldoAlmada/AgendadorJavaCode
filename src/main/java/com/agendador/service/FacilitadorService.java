package com.agendador.service;

import com.agendador.entity.Facilitador;

import java.util.List;

/**
 * Created by Ivaldo on 12/10/2016.
 */
public interface FacilitadorService {

    Facilitador createFacilitador(Facilitador facilitador);

    Facilitador getById(String id);

    List<Facilitador> getAll();

    void delete(Facilitador facilitador);

    Facilitador updateFacilitador(Facilitador facilitador);
}
