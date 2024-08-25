public class Main {
    // Clase abstracta para representar un envío
    abstract static class Envio {
        public abstract double calcularCosto(double peso, double distancia);
    }

    // Implementación para envío estándar
    static class EnvioEstandar extends Envio {
        @Override
        public double calcularCosto(double peso, double distancia) {
            return peso * 0.5 + distancia * 0.1;
        }
    }

    // Implementación para envío express
    static class EnvioExpress extends Envio {
        @Override
        public double calcularCosto(double peso, double distancia) {
            return peso * 1.0 + distancia * 0.2;
        }
    }

    // Implementación para envío internacional
    static class EnvioInternacional extends Envio {
        @Override
        public double calcularCosto(double peso, double distancia) {
            return peso * 2.0 + distancia * 0.5;
        }
    }

    public static void main(String[] args) {
        Envio envioEstandar = new EnvioEstandar();
        Envio envioExpress = new EnvioExpress();
        Envio envioInternacional = new EnvioInternacional();

        System.out.println("Costo Envío Estándar: " + envioEstandar.calcularCosto(10, 100));
        System.out.println("Costo Envío Express: " + envioExpress.calcularCosto(10, 100));
        System.out.println("Costo Envío Internacional: " + envioInternacional.calcularCosto(10, 100));
    }
}
