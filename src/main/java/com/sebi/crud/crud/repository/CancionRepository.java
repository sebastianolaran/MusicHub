package com.sebi.crud.crud.repository;

import com.sebi.crud.crud.model.Album;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import com.sebi.crud.crud.model.Cancion;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CancionRepository extends CrudRepository<Cancion, Long> {

    @Query("SELECT c FROM Cancion c WHERE c.titulo LIKE %:titulo%")
    List<Cancion> findByTitulo(@Param("titulo") String titulo);

    //@Query("INSERT INTO albumes_canciones (`id_cancion`, `id_album`) VALUES (:id_cancion, :id_album);")
    //void asociar(@Param("id_cancion") Long id_cancion, @Param("id_album") Long id_album);

}
