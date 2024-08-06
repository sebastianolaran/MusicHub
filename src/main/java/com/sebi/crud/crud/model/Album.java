package com.sebi.crud.crud.model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.List;


@Entity
@Table(name = "album", schema = "db_musichub")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_album;
    private String titulo;
    private String fecha_lanzamiento;
    private Long precio;

    @ManyToMany
    @JoinTable(
            name = "albumes_canciones",
            joinColumns = @JoinColumn(name = "album_id"),
            inverseJoinColumns = @JoinColumn(name = "cancion_id")
    )
    private List<Cancion> canciones;

//    @ManyToMany
//    @JoinTable(
//            name = "albumes_artistas",
//            joinColumns = @JoinColumn(name = "album_id"),
//            inverseJoinColumns = @JoinColumn(name = "artista_id")
//    )
//    private List<Artista> artistas;


    public Album() {
    }

    public Long getId() {
        return id_album;
    }

    public void setId(Long id) {
        this.id_album = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha_lanzamiento() {
        return fecha_lanzamiento;
    }

    public void setFecha_lanzamiento(String fecha_lanzamiento) {
        this.fecha_lanzamiento = fecha_lanzamiento;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }




}
