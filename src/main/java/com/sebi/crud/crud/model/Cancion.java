package com.sebi.crud.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Cancion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cancion;
    private String titulo;
    private Long duracion;

    //private List<Genero> generos;
    //private List<Album> albumes;
    //private List<Comentario> comentarios;


    public Cancion() {
    }

    public Long getId() {
        return id_cancion;
    }

    public void setId(Long id) {
        this.id_cancion = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getDuracion() {
        return duracion;
    }

    public void setDuracion(Long duracion) {
        this.duracion = duracion;
    }


}
