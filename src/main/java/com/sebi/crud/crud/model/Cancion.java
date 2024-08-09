package com.sebi.crud.crud.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cancion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cancion;
    private String titulo;
    private Long duracion;

    @ManyToMany
    @JoinTable(
            name = "canciones_genero",
            joinColumns = @JoinColumn(name = "id_cancion"),
            inverseJoinColumns = @JoinColumn(name = "id_genero")
    )

    private List<Genero> generos;

    @ManyToMany
    @JoinTable(
            name = "albumes_artistas",
            joinColumns = @JoinColumn(name = "id_cancion"),
            inverseJoinColumns = @JoinColumn(name = "id_album")
    )
    private List<Album> albumes;


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
