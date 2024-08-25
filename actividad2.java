public class Main {

    public static class Factura {
        private int numero;
        private double monto;

        public Factura(int numero, double monto) {
            this.numero = numero;
            this.monto = monto;
        }

        public void guardarFactura() {
            System.out.println("Guardando factura " + numero + " en la base de datos.");
        }

        public int getNumero() {
            return numero;
        }

        public double getMonto() {
            return monto;
        }
    }

    public static class Cliente {
        private String nombre;
        private String email;

        public Cliente(String nombre, String email) {
            this.nombre = nombre;
            this.email = email;
        }

        public void guardarCliente() {
            System.out.println("Guardando cliente " + nombre + " en la base de datos.");
        }

        public String getEmail() {
            return email;
        }
    }

    public static class EmailService {
        public void enviarEmailFactura(Factura factura, Cliente cliente) {
            System.out.println("Enviando email a " + cliente.getEmail() + " con la factura " + factura.getNumero() + ".");
        }

        public void enviarFacturaDian(Factura factura) {
            System.out.println("Enviando factura " + factura.getNumero() + " a la DIAN.");
        }
    }

    public static class FacturaReporte {
        public void generarReporteFacturas() {
            System.out.println("Generando reporte de todas las facturas del mes.");
        }
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan Pérez", "juan.perez@example.com");
        cliente.guardarCliente();

        Factura factura = new Factura(123, 1000);
        factura.guardarFactura();

        EmailService emailService = new EmailService();
        emailService.enviarEmailFactura(factura, cliente);
        emailService.enviarFacturaDian(factura);

        FacturaReporte reporte = new FacturaReporte();
        reporte.generarReporteFacturas();
    }
}
