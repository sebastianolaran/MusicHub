package com.sebi.crud.crud.repository;

import org.springframework.data.repository.CrudRepository;

import com.sebi.crud.crud.model.Cancion;

public interface CancionRepository extends CrudRepository<Cancion, Long> {
}
