<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
  <h1>Sistema de Gestión de Bibliotecas</h1>

  <p>Este proyecto es una implementación básica de un sistema de gestión para bibliotecas en Java. Permite agregar, eliminar y buscar libros en una colección, así como mostrar todos los libros almacenados.</p>

  <h2>Estructura del Proyecto</h2>

  <p>El proyecto se organiza en varias clases que cumplen con distintas funcionalidades:</p>

  <h3>Clases principales:</h3>
  <ul>
      <li><strong>Main</strong>: Clase principal que contiene el método <code>main()</code> y simula el flujo de trabajo del sistema de gestión de bibliotecas, como agregar, eliminar y buscar libros.</li>
      <li><strong>Biblioteca</strong>: Representa una biblioteca y contiene los métodos para agregar, eliminar, buscar y mostrar libros.</li>
      <li><strong>Libro</strong>: Representa un libro con atributos como el título, autor, año de publicación y ISBN. También implementa la interfaz <code>Comparable</code> para permitir la comparación entre libros.</li>
      <li><strong>Comparadores</strong>: Contiene métodos estáticos para comparar libros, por ejemplo, por título o por año de publicación.</li>
  </ul>

  <h3>Funcionalidades del Sistema</h3>
  <ul>
      <li><strong>Agregar un libro</strong>: Permite agregar un nuevo libro a la colección si no existe ya un libro con el mismo ISBN.</li>
      <li><strong>Eliminar un libro</strong>: Permite eliminar un libro de la colección utilizando el ISBN como identificador.</li>
      <li><strong>Buscar un libro</strong>: Permite buscar un libro en la colección por su ISBN y mostrarlo si se encuentra.</li>
      <li><strong>Mostrar todos los libros</strong>: Muestra todos los libros almacenados en la biblioteca.</li>
  </ul>

  <h3>Dependencias</h3>
  <p><strong>Java 8 o superior</strong>: El código hace uso de características de Java 8, como las expresiones lambda y la API de Streams.</p>

  <h2>Uso</h2>

  <h3>Ejemplo de uso del sistema</h3>
  <ol>
      <li>Crear una instancia de la clase <code>Biblioteca</code>:
          <pre><code>Biblioteca biblioteca = new Biblioteca();</code></pre>
      </li>
      <li>Agregar libros a la biblioteca:
          <pre><code>Libro libro1 = new Libro("Piedra", "José", 2024, "isi");
Libro libro2 = new Libro("Isla", "Juan", 2014, "ise");
biblioteca.agregarLibro(libro1);
biblioteca.agregarLibro(libro2);</code></pre>
      </li>
      <li>Mostrar todos los libros en la biblioteca:
          <pre><code>biblioteca.mostrarTodosLosLibros();</code></pre>
      </li>
      <li>Eliminar un libro de la biblioteca por su ISBN:
          <pre><code>biblioteca.eliminarLibro("isi");</code></pre>
      </li>
      <li>Buscar un libro por su ISBN:
          <pre><code>biblioteca.buscarLibro("ise");</code></pre>
      </li>
  </ol>

  <h3>Ejemplo de salida:</h3>
  <pre><code>Libro agregado:
