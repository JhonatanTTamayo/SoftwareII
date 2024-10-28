/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_15_factory_method;

/**
 *
 * @author juanm
 */
public class TALLER_15_FACTORY_METHOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear creador para pago con tarjeta
        CreadorMetodoPago creadorTarjeta = new CreadorPagoTarjeta();
        MetodoPago pagoConTarjeta = creadorTarjeta.crearMetodoPago();
        pagoConTarjeta.procesarPago(100.00);

        // Crear creador para pago con PayPal
        CreadorMetodoPago creadorPayPal = new CreadorPagoPayPal();
        MetodoPago pagoConPayPal = creadorPayPal.crearMetodoPago();
        pagoConPayPal.procesarPago(200.00);
    }
}
