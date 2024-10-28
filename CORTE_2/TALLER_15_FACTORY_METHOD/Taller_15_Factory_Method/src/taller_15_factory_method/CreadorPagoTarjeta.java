/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_15_factory_method;

/**
 *
 * @author juanm
 */
public class CreadorPagoTarjeta extends CreadorMetodoPago {
    @Override
    public MetodoPago crearMetodoPago() {
        return new PagoTarjeta();
    }
}
