// Interfaz para productos
public interface IProducto {
    int getId();
    String getNombre();
    double getPrecio();
}

// Implementación de Producto
public class Producto implements IProducto {
    private int id;
    private String nombre;
    private double precio;

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
}

// Interfaz para clientes
public interface ICliente {
    int getId();
    String getNombre();
    String getDireccion();
}

// Implementación de Cliente
public class Cliente implements ICliente {
    private int id;
    private String nombre;
    private String direccion;

    public Cliente(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
}

// Interfaz para la persistencia de la factura
public interface IFacturaRepository {
    void guardarFactura(Factura factura);
}

// Implementación del repositorio de facturas
public class FacturaRepository implements IFacturaRepository {
    @Override
    public void guardarFactura(Factura factura) {
        // Lógica para guardar la factura en la base de datos
        System.out.println("Factura guardada con número: " + factura.getNumeroFactura());
    }
}

// Clase Factura
public class Factura {
    private int id;
    private ICliente cliente;
    private List<IProducto> productos;
    private double total;
    private double descuento;
    private String numeroFactura;
    private Date fechaFactura;

    private IFacturaRepository facturaRepository;

    public Factura(int id, ICliente cliente, List<IProducto> productos, double descuento, IFacturaRepository facturaRepository) {
        this.id = id;
        this.cliente = cliente;
        this.productos = productos;
        this.descuento = descuento;
        this.fechaFactura = new Date();
        this.numeroFactura = generarNumeroFactura();
        this.total = calcularTotal();
        this.facturaRepository = facturaRepository;
    }

    private double calcularTotal() {
        double total = productos.stream().mapToDouble(IProducto::getPrecio).sum();
        return total - (total * descuento);
    }

    private String generarNumeroFactura() {
        return "FAC-" + id + "-" + System.currentTimeMillis();
    }

    public void procesarFactura() {
        // Lógica para procesar la factura (guardar en base de datos, etc.)
        facturaRepository.guardarFactura(this);
    }

    public String getNumeroFactura() { return numeroFactura; }
    public double getTotal() { return total; }
}

// Clase Main para probar el sistema
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ICliente cliente = new Cliente(1, "Paula", "Calle 123");
        IProducto prod1 = new Producto(1, "Laptop", 1000.0);
        IProducto prod2 = new Producto(2, "Mouse", 50.0);

        IFacturaRepository facturaRepository = new FacturaRepository();
        Factura factura = new Factura(1, cliente, Arrays.asList(prod1, prod2), 0.10, facturaRepository); // 10% de descuento
        factura.procesarFactura();

        System.out.println("Total: " + factura.getTotal());
        System.out.println("Número de factura: " + factura.getNumeroFactura());
    }
}
