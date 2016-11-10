package com.agendador.service.impl;

import com.agendador.entity.Facilitador;
import com.agendador.repository.FacilitadorRepository;
import com.agendador.service.FacilitadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public Facilitador getById(String id) {
        Facilitador facilitadorToReturn = facilitadorRepository.findOne(id);
        return facilitadorToReturn;
    }

    public List<Facilitador> getAll() {
        List<Facilitador> facilitadores = facilitadorRepository.findAll();
        return facilitadores;
    }

    public void delete(Facilitador facilitador) {
        facilitadorRepository.delete(facilitador);
    }

    public Facilitador updateFacilitador(Facilitador facilitador) {
        Facilitador updatedFacilitador = facilitadorRepository.save(facilitador);
        return updatedFacilitador;
    }
}
