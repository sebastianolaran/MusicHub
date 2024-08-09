/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sebi.crud.crud.service.implementations;

import java.util.List;
import java.util.Optional;

import com.sebi.crud.crud.excepciones.AlbumDuplicadoException;
import com.sebi.crud.crud.model.Artista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sebi.crud.crud.model.Album;
import com.sebi.crud.crud.repository.AlbumRepository;
import com.sebi.crud.crud.service.contracts.AlbumService;

@Service
public class AlbumServiceImpl implements AlbumService{


    @Autowired
    private AlbumRepository albumRepository;

    @Override
    public void agregarAlbum(Album album) {
        List<Album> optionalAlbum = this.buscarAlbumPorNombre(album.getTitulo());
        boolean existe = false;
        for (Album a : optionalAlbum) {
            System.out.println(a.getTitulo());
            if (a.equals(album)) {
                existe = true;
                break;
            }
        }
        if (existe) {
            throw new AlbumDuplicadoException("El álbum ya existe");
        } else {
            albumRepository.save(album);
        }
    }

    @Override
    public Optional<Album> actualizarAlbum(Album album) {
        Optional<Album> albumOptional = albumRepository.findById(album.getId());
        if (albumOptional.isPresent()) {
            Album albumDb = albumOptional.orElseThrow();

            albumDb.setPrecio(album.getPrecio());
            albumDb.setFecha_lanzamiento(album.getFecha_lanzamiento());
            albumDb.setTitulo(album.getTitulo());
            return Optional.of(albumRepository.save(albumDb));

        }
        return albumOptional;
    }

    @Override
    public Optional<Album> buscarAlbumPorId(Long id) {
        return albumRepository.findById(id);
    }

    @Override
    public void eliminarAlbum(Album album) {
        albumRepository.delete(album);
    }

    @Override
    public List<Album> listarAlbum() {
        return (List<Album>)  albumRepository.findAll();
    }

    @Override
    public List<Album> buscarAlbumPorNombre(String titulo) {
        return albumRepository.findByTitulo(titulo);
    }




}
