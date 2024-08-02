package com.sebi.crud.crud.repository.contracts;

import com.sebi.crud.crud.model.Cancion;
import org.springframework.data.repository.CrudRepository;

public interface CancionRepository extends CrudRepository<Cancion, Long> {
}
