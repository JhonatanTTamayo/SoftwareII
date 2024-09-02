abstract class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public abstract double calcularCostoTotal();
}

class ProductoFisico extends Producto {
    private double peso;

    public ProductoFisico(String nombre, double precio, int cantidad, double peso) {
        super(nombre, precio, cantidad);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public double calcularCostoTotal() {
        return getPrecio() * getCantidad();
    }
}

class ProductoDigital extends Producto {
    private double tamanoArchivo;

    public ProductoDigital(String nombre, double precio, int cantidad, double tamanoArchivo) {
        super(nombre, precio, cantidad);
        this.tamanoArchivo = tamanoArchivo;
    }

    public double getTamanoArchivo() {
        return tamanoArchivo;
    }

    @Override
    public double calcularCostoTotal() {
        return getPrecio() * getCantidad();
    }
}

class ProductoMixto extends Producto {
    private double peso;
    private double tamanoArchivo;

    public ProductoMixto(String nombre, double precio, int cantidad, double peso, double tamanoArchivo) {
        super(nombre, precio, cantidad);
        this.peso = peso;
        this.tamanoArchivo = tamanoArchivo;
    }

    public double getPeso() {
        return peso;
    }

    public double getTamanoArchivo() {
        return tamanoArchivo;
    }

    @Override
    public double calcularCostoTotal() {
        return getPrecio() * getCantidad();
    }
}

interface EnviablePorCorreo {
    void enviarPorCorreo();
}

class EnviadorPorCorreo {
    public void enviar(EnviablePorCorreo producto) {
        producto.enviarPorCorreo();
    }
}

class ProductoFisicoEnviable extends ProductoFisico implements EnviablePorCorreo {
    public ProductoFisicoEnviable(String nombre, double precio, int cantidad, double peso) {
        super(nombre, precio, cantidad, peso);
    }

    @Override
    public void enviarPorCorreo() {
        System.out.println("\nEnviando por correo el producto físico: " + getNombre());
    }
}

class ProductoMixtoEnviable extends ProductoMixto implements EnviablePorCorreo {
    public ProductoMixtoEnviable(String nombre, double precio, int cantidad, double peso, double tamanoArchivo) {
        super(nombre, precio, cantidad, peso, tamanoArchivo);
    }

    @Override
    public void enviarPorCorreo() {
        System.out.println("Enviando por correo el producto mixto: " + getNombre());
    }
}

public class Actividad5 {
    public static void main(String[] args) {
        ProductoFisicoEnviable libro = new ProductoFisicoEnviable("Libro", 100, 1, 0.5);
        ProductoMixtoEnviable combo = new ProductoMixtoEnviable("Combo", 200, 1, 0.5, 2.0);
        ProductoDigital curso = new ProductoDigital("Curso Online", 500, 1, 1.5);

        EnviadorPorCorreo enviador = new EnviadorPorCorreo();
        enviador.enviar(libro);
        enviador.enviar(combo);

        System.out.printf("Costo total del libro: %.2f%n", libro.calcularCostoTotal());
        System.out.printf("Costo total del combo: %.2f%n", combo.calcularCostoTotal());
        System.out.printf("Costo total del curso online: %.2f%n", curso.calcularCostoTotal());
    }
}
