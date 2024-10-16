package SistemaGestionBiblioteca;

import java.util.Comparator;

public class Comparadores {
    public static Comparator<Libro> porTitulo() {
        return Comparator.comparing(Libro::getTitulo);
    }

    public static Comparator<Libro> porAnoPublicacion() {
        return Comparator.comparingInt(Libro::getAnoPublicacion);
    }
}
