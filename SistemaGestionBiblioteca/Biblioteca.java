package SistemaGestionBiblioteca;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Biblioteca {
    private Libro libro;
    private Set<Libro> libros;

    public Biblioteca() {
        this.libros = new HashSet<>();
    }

    public void agregarLibro(Libro libro) {
        if (libros.add(libro)) {
            System.out.println("Libro agregado: " + libro);
        } else {
            System.out.println("El libro ya existe en la colección.");
        }
    }

    public void eliminarLibro(String isbn) {
        Iterator<Libro> iterator = libros.iterator();
        while (iterator.hasNext()) {
            Libro libro = iterator.next();
            if (libro.getIsbn().equals(isbn)) {
                iterator.remove();
                System.out.println("Libro eliminado: " + libro);
                return;
            }
        }
        System.out.println("No se encontró el libro con ISBN: " + isbn);
    }

    public void buscarLibro(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                System.out.println("Libro encontrado: " + libro);
                return;
            }
        }
        System.out.println("No se encontró el libro con ISBN: " + isbn);
    }

    public void mostrarTodosLosLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }
};