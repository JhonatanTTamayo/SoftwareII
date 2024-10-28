/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_15_factory_method;

/**
 *
 * @author juanm
 */
public class PagoTarjeta implements MetodoPago {
    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Procesando pago de " + cantidad + " con tarjeta.");
    }
}