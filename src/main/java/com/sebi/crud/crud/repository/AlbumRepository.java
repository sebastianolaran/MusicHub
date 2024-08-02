package com.sebi.crud.crud.repository;

import org.springframework.data.repository.CrudRepository;

import com.sebi.crud.crud.model.Album;


public interface AlbumRepository extends CrudRepository<Album,Long> {

    void eliminar(Album album);

}
