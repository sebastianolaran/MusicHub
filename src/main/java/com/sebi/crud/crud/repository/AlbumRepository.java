package com.sebi.crud.crud.repository;

import com.sebi.crud.crud.model.Artista;
import jakarta.transaction.Transactional;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import com.sebi.crud.crud.model.Album;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface AlbumRepository extends CrudRepository<Album,Long> {


    @Query("SELECT a FROM Album a WHERE a.titulo LIKE %:titulo%")
    List<Album> findByTitulo(@Param("titulo") String titulo);



}
