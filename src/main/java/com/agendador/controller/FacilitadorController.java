package com.agendador.controller;

import com.agendador.entity.Facilitador;
import com.agendador.facade.AgendadorFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Ivaldo on 12/10/2016.
 */
@RestController
@RequestMapping("facilitador")
public class FacilitadorController {

    @Autowired
    private AgendadorFacade agendadorFacade;

    final static Logger logger = LoggerFactory.getLogger(FacilitadorController.class);

    @RequestMapping(method = RequestMethod.POST, headers = "Accept=application/json; charset=utf-8")
    public ResponseEntity createFacilitador(@RequestBody Facilitador facilitador) {
        Facilitador facilitadorToReturn = agendadorFacade.createFacilitador(facilitador);
        return new ResponseEntity(facilitadorToReturn, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "id/{id:.+}", headers = "Accept=application/json; charset=utf-8")
    public ResponseEntity getById(@PathVariable("id") String id) {
        Facilitador facilitador = agendadorFacade.getFacilitadorById(id);
        return new ResponseEntity(facilitador, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "all", headers = "Accept=application/json; charset=utf-8")
    public ResponseEntity getAll() {
        List<Facilitador> facilitadores = agendadorFacade.getAllFacilitadores();
        return new ResponseEntity(facilitadores, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, headers = "Accept=application/json; charset=utf-8")
    public ResponseEntity delete(@RequestBody Facilitador facilitador) {
        agendadorFacade.delete(facilitador);
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, headers = "Accept=application/json; charset=utf-8")
    public ResponseEntity update(@RequestBody Facilitador facilitador) {
        Facilitador updatedFacilitador = agendadorFacade.update(facilitador);
        return new ResponseEntity(updatedFacilitador, HttpStatus.OK);
    }
}
