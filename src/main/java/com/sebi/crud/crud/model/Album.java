package com.sebi.crud.crud.model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Objects;


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
            joinColumns = @JoinColumn(name = "id_album"),
            inverseJoinColumns = @JoinColumn(name = "id_cancion")
    )
    private List<Cancion> canciones;

    @ManyToMany
    @JoinTable(
            name = "albumes_artistas",
            joinColumns = @JoinColumn(name = "id_album"),
           inverseJoinColumns = @JoinColumn(name = "id_artista")
    )
   private List<Artista> artistas;


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

    public List<Cancion> getCanciones() {
        return canciones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return Objects.equals(titulo, album.titulo) && Objects.equals(fecha_lanzamiento, album.fecha_lanzamiento) && Objects.equals(precio, album.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, fecha_lanzamiento, precio);
    }
}
