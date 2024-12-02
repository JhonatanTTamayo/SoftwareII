/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta3;

/**
 *
 * @author jhona
 */

public class SistemaPagoCliente implements NuevoSistemaPago {
    private String nombre;
    private String identificacion;
    private String correo;

    public SistemaPagoCliente(String nombre, String identificacion, String correo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correo = correo;
    }

    @Override
    public void realizarPago(double monto, String tipoDePago) {
        System.out.println("Pagando con " + tipoDePago + " por el monto de: $" + monto);
    }

    @Override
    public String getCorreo() {
        return correo;
    }
    
    @Override
    public String getNombre(){
        return nombre;
    }
    
    @Override
    public String getIdentificacion(){
        return identificacion;
    }
}

