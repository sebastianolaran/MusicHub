

package com.sebi.crud.crud.service.contracts;

import java.util.List;
import java.util.Optional;

import com.sebi.crud.crud.model.Album;

public interface AlbumService {

    void eliminarAlbum(Album album);

    
    void agregarAlbum(Album album);


    List<Album>  listarAlbum();


    Optional<Album> buscarAlbumPorId(Long id);

    List<Album> buscarAlbumPorNombre(String nombre);

}
