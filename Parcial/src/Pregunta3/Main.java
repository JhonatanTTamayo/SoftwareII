/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pregunta3;

/**
 *
 * @author jhona
 */


public class Main {
    public static void main(String[] args) {
        
        NuevoSistemaPago cliente = new SistemaPagoCliente("Jhonatan Tamayo", "12345", "jhonatan.tamayos@correo.com");

        NuevoSistemaPagoOperacion nuevoSistemaPagoOperacion = new NuevoSistemaPagoOperacion();

        AdapterSistemaPagoOperacion adapter = new AdapterSistemaPagoOperacion(nuevoSistemaPagoOperacion, cliente);

        adapter.realizarPago(100.0, "tarjeta");  
    }
}
