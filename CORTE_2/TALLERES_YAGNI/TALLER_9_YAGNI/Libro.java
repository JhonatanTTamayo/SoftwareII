public class Libro {
    String titulo;
    boolean disponible;
    
    public Libro(String titulo) {
        this.titulo = titulo;
        this.disponible = true;
    }

    public void prestar() {
        this.disponible = false;
    }

    public void devolver() {
        this.disponible = true;
    }

    public boolean estaDisponible() {
        return disponible;
    }
}
