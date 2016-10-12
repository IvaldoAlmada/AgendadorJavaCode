package com.agendador.controller;

import com.agendador.entity.Facilitador;
import com.agendador.facade.AgendadorFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}
