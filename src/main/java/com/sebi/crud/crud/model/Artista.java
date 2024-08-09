package com.sebi.crud.crud.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_artista;
    private String nombre;
    private String biografia;

    @ManyToMany
    @JoinTable(
            name = "albumes_artistas",
            joinColumns = @JoinColumn(name = "id_artista"),
            inverseJoinColumns = @JoinColumn(name = "id_album")
    )
    private List<Album> albumes;

    @ManyToMany
    @JoinTable(
            name = "artistas_genero",
            joinColumns = @JoinColumn(name = "id_artista"),
            inverseJoinColumns = @JoinColumn(name = "id_genero")
    )
    private List<Genero> generos;


    public Artista() {
    }

    public Long getId() {
        return id_artista;
    }

    public void setId(Long id) {
        this.id_artista = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public List<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(List<Album> albumes) {
        this.albumes = albumes;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }
}
