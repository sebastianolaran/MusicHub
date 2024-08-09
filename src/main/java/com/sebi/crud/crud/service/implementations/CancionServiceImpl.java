package com.sebi.crud.crud.service.implementations;

import com.sebi.crud.crud.model.Album;
import com.sebi.crud.crud.model.Cancion;
import com.sebi.crud.crud.repository.CancionRepository;
import com.sebi.crud.crud.service.contracts.CancionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CancionServiceImpl implements CancionService {


    @Autowired
    private CancionRepository cancionRepository;

    @Override
    public void eliminarCancion(Cancion cancion) {
        cancionRepository.delete(cancion);
    }

    @Override
    public void agregarCancion(Cancion cancion) {
        cancionRepository.save(cancion);
    }

    @Override
    public void asociarCancion(Cancion cancion, Album album) {
        //cancionRepository.asociar(cancion.getId(),album.getId());
    }

    @Override
    public List<Cancion> listarCancion() {
        return (List<Cancion>) cancionRepository.findAll();
    }

    @Override
    public Optional<Cancion> buscarCancionPorId(Long id) {
        return cancionRepository.findById(id);
    }

    @Override
    public List<Cancion> buscarCancionPorNombre(String titulo) {
        return cancionRepository.findByTitulo(titulo);
    }
}
