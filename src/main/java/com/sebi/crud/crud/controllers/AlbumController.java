package com.sebi.crud.crud.controllers;

import java.util.Collections;
import java.util.List;
import java.util.Optional;


import com.sebi.crud.crud.model.Artista;
import com.sebi.crud.crud.model.Cancion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import com.sebi.crud.crud.model.Album;
import com.sebi.crud.crud.service.contracts.AlbumService;

@RestController
@RequestMapping("/api/album")
public class AlbumController {


    @Autowired
    private AlbumService albumService;

    @Transactional(readOnly = true)
    @GetMapping
    public List<Album> obtenerAlbumes() {
        return albumService.listarAlbum();
    }


    @GetMapping("/id")
    public Optional<Album> obtenerAlbumporId(@RequestParam Long id) {
        return albumService.buscarAlbumPorId(id);
    }

    @PostMapping("/guardar")
    public void guardar(@RequestBody Album album) {
        albumService.agregarAlbum(album);
    }


    @PostMapping("/eliminar")
    public void eliminar(@RequestBody Album album) {
        albumService.eliminarAlbum(album);
    }

    @GetMapping("/titulo")
    public List<Album> obtenerAlbumporNombre(@RequestParam String titulo) {
        return albumService.buscarAlbumPorNombre(titulo);
    }



    @GetMapping("/canciones")
    public List<Cancion> obtenerCancionesDeAlbum(@RequestParam Long id) {
        Optional<Album> album = albumService.buscarAlbumPorId(id);
        return album.map(Album::getCanciones).orElse(Collections.emptyList());
    }

}
