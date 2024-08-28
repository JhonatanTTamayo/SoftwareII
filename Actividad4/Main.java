package Actividad4;

abstract class Calculo {
    protected double monto;

    public Calculo(double monto) {
        this.monto = monto;
    }

    public abstract double calcular();
}

class CalculoImpuestoIva extends Calculo {
    private static final double IVA = 0.19;

    public CalculoImpuestoIva(double monto) {
        super(monto);
    }

    @Override
    public double calcular() {
        return monto * IVA;
    }
}

class CalculoImpuestoRetIva extends Calculo {
    private static final double RET_IVA = 0.10;

    public CalculoImpuestoRetIva(double monto) {
        super(monto);
    }

    @Override
    public double calcular() {
        return monto * RET_IVA;
    }
}

class CalculoImpuestoSaludable extends Calculo {
    private static final double SALUD = 0.05;

    public CalculoImpuestoSaludable(double monto) {
        super(monto);
    }

    @Override
    public double calcular() {
        return monto * SALUD;
    }
}

class Factura {
    private Calculo calculo;

    public Factura(Calculo calculo) {
        this.calculo = calculo;
    }

    public double calcularImpuesto() {
        return calculo.calcular();
    }
}

public class Main {
    public static void main(String[] args) {
        double valor = 100.0;

        Factura facturaIva = new Factura(new CalculoImpuestoIva(valor));
        System.out.println("IVA: " + facturaIva.calcularImpuesto());

        Factura facturaRetIva = new Factura(new CalculoImpuestoRetIva(valor));
        System.out.println("Retención IVA: " + facturaRetIva.calcularImpuesto());

        Factura facturaSalud = new Factura(new CalculoImpuestoSaludable(valor));
        System.out.println("Salud: " + facturaSalud.calcularImpuesto());
    }
}
