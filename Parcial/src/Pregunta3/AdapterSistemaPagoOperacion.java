/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta3;

/**
 *
 * @author jhona
 */


public class AdapterSistemaPagoOperacion implements NuevoSistemaPago {

    private final NuevoSistemaPagoOperacion nuevoSistemaPagoOperacion;
    private final NuevoSistemaPago nuevoSistemaPago;

    public AdapterSistemaPagoOperacion(NuevoSistemaPagoOperacion nuevoSistemaPagoOperacion, NuevoSistemaPago nuevoSistemaPago) {
        this.nuevoSistemaPagoOperacion = nuevoSistemaPagoOperacion;
        this.nuevoSistemaPago = nuevoSistemaPago;
    }

    @Override
    public void realizarPago(double monto, String tipoDePago) {
        // Adaptamos la lógica del nuevo sistema a la interfaz requerida
        nuevoSistemaPagoOperacion.crearSistema(nuevoSistemaPago);
        nuevoSistemaPagoOperacion.validarCorreo(nuevoSistemaPago);
        nuevoSistemaPagoOperacion.validarAutorizacion();
        nuevoSistemaPagoOperacion.realizarPago();
        System.out.println("Pago realizado con exito: $" + monto + " por " + tipoDePago);
    }

    @Override
    public String getCorreo() {
        return nuevoSistemaPago.getCorreo();
    }
    
    public String getNombre() {
        return nuevoSistemaPago.getNombre();
    }
    
    public String getIdentificacion(){
        return nuevoSistemaPago.getIdentificacion();
    }
}

