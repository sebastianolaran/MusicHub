/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sebi.crud.crud.service.implementations;

import java.util.List;
import java.util.Optional;

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
        albumRepository.save(album);
        
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
