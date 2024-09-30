public class Biblioteca {
    List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public Libro buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.titulo.equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public void prestarLibro(String titulo) {
        Libro libro = buscarLibro(titulo);
        if (libro != null && libro.estaDisponible()) {
            libro.prestar();
        }
    }
}
