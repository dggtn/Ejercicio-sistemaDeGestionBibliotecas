package SistemaGestionBiblioteca;


import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("piedra", "Jose", 2024, "isi");
        Libro libro1 = new Libro("isla", "Juan", 2014, "ise");
        Libro libro2 = new Libro("mar", "Julian", 1994, "isa");
        Libro libro3 = new Libro("arena", "Jimena", 2004, "iso");
        Libro libro4 = new Libro("nieve", "Antonia", 1884, "isu");
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(libro);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);

        biblioteca.mostrarTodosLosLibros();
        biblioteca.eliminarLibro("iso");
        biblioteca.eliminarLibro("isu");
        biblioteca.buscarLibro("isi");
        biblioteca.mostrarTodosLosLibros();

    }
};