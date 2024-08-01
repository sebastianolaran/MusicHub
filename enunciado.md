Desarrolla una aplicación Java que gestione una plataforma de comercio electrónico de música en línea, llamada "MusicHub". La aplicación debe permitir a los usuarios crear, leer, actualizar y eliminar (CRUD) álbumes, canciones, artistas, géneros, etiquetas y comentarios. Además, la aplicación debe tener las siguientes características:

Un álbum puede tener varias canciones y una canción puede pertenecer a varios álbumes (asociación many-to-many).
Un artista puede tener varios álbumes y un álbum puede tener varios artistas (asociación many-to-many).
Un género puede tener varias canciones y una canción puede pertenecer a varios géneros (asociación many-to-many).
Una etiqueta puede tener varias canciones y una canción puede tener varias etiquetas (asociación many-to-many).
Un usuario puede dejar comentarios en una canción o álbum.
La aplicación debe permitir buscar álbumes por título, canciones por título o artista, y artistas por nombre.
La aplicación debe tener una función para calcular el precio total de todos los álbumes de un artista.
La aplicación debe tener una función para obtener las canciones más populares (las que más se han vendido).
La aplicación debe tener una función para obtener los álbumes más vendidos que tenga en cuenta la cantidad de veces que se han vendido cada álbum.
La aplicación debe tener una función para obtener los artistas más populares que tenga en cuenta la cantidad de veces que se han vendido sus álbumes.
La aplicación debe tener una función para obtener las canciones más compartidas en redes sociales.
La aplicación debe tener una función para obtener los álbumes más valorados por los usuarios.

Requisitos:

Crear un proyecto Java que utilice Hibernate como proveedor de JPA.
Definir las entidades Álbum, Canción, Artista, Género, Etiqueta, Comentario y Usuario con sus respectivas asociaciones.
Crear un repositorio para cada entidad que permita realizar operaciones CRUD.
Crear un servicio que utilice los repositorios para realizar las operaciones CRUD y las funciones adicionales (buscar, calcular precio total, obtener canciones más populares, etc.).
Crear una interfaz de usuario que permita a los usuarios interactuar con la aplicación.
Implementar autenticación y autorización para que solo los usuarios registrados puedan dejar comentarios y realizar compras.
Implementar un sistema de pago para que los usuarios puedan comprar álbumes y canciones.
Implementar un sistema de notificaciones para que los usuarios reciban notificaciones cuando un artista nuevo se une a la plataforma o cuando un álbum nuevo es lanzado.


Desafíos adicionales:

Implementar un sistema de recomendaciones que sugiera álbumes y canciones a los usuarios basadas en sus preferencias y comportamiento.
Implementar un sistema de análisis de tendencias que permita a los administradores ver las canciones y álbumes más populares en tiempo real.
Implementar un sistema de integración con redes sociales que permita a los usuarios compartir canciones y álbumes en sus redes sociales favoritas.