/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sebi.crud.crud.service.contracts;

import java.util.List;
import java.util.Optional;
import com.sebi.crud.crud.model.Album;
import com.sebi.crud.crud.model.Cancion;

/**
 *
 * @author sebastian2703
 */
public interface CancionService {

    void eliminarCancion(Cancion cancion);

    
    void agregarAlbum(Album album);


    List<Album> listarAlbum();


    Optional<Album> buscarAlbumPorId(Long id);

}
