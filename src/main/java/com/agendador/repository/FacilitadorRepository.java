package com.agendador.repository;

import com.agendador.entity.Facilitador;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Ivaldo on 12/10/2016.
 */
public interface FacilitadorRepository extends MongoRepository<Facilitador, String> {
}
