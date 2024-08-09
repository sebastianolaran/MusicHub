package com.sebi.crud.crud.service.contracts;

import com.sebi.crud.crud.model.Album;
import com.sebi.crud.crud.model.Artista;

import java.util.List;
import java.util.Optional;

public interface ArtistaService {


    void eliminarArtista(Artista artista);

    void guardarArtista(Artista artista);

    List<Artista> listarArtistas();

    Optional<Artista> buscarArtistaPorId(Long id);

    List<Artista> buscarArtistasPorNombre(String nombre);

}
