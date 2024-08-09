/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sebi.crud.crud.service.contracts;

import java.util.List;
import java.util.Optional;

import com.sebi.crud.crud.model.Album;
import com.sebi.crud.crud.model.Cancion;


public interface CancionService {

    void eliminarCancion(Cancion cancion);


    void agregarCancion(Cancion cancion);

    void asociarCancion(Cancion cancion, Album album);


    List<Cancion> listarCancion();


    Optional<Cancion> buscarCancionPorId(Long id);


    List<Cancion> buscarCancionPorNombre(String nombre);

}
