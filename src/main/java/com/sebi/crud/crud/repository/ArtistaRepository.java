package com.sebi.crud.crud.repository;

import com.sebi.crud.crud.model.Cancion;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import com.sebi.crud.crud.model.Artista;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArtistaRepository extends CrudRepository<Artista, Long> {

    @Query("SELECT a FROM Artista a WHERE a.nombre LIKE %:nombre%")
    List<Artista> findByNombre(@Param("nombre") String nombre);


}
