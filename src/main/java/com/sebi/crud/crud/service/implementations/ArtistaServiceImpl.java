package com.sebi.crud.crud.service.implementations;

import com.sebi.crud.crud.model.Artista;
import com.sebi.crud.crud.repository.ArtistaRepository;
import com.sebi.crud.crud.service.contracts.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistaServiceImpl implements ArtistaService {


    @Autowired
    private ArtistaRepository artistaRepository;

    @Override
    public void eliminarArtista(Artista artista) {
        artistaRepository.delete(artista);
    }

    @Override
    public void guardarArtista(Artista artista) {
        artistaRepository.save(artista);
    }

    @Override
    public List<Artista> listarArtistas() {
        return (List<Artista>) artistaRepository.findAll();
    }

    @Override
    public Optional<Artista> buscarArtistaPorId(Long id) {
        return artistaRepository.findById(id);
    }

    @Override
    public List<Artista> buscarArtistasPorNombre(String nombre) {
        return artistaRepository.findByNombre(nombre);
    }
}
