/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta3;

/**
 *
 * @author jhona
 */

public class NuevoSistemaPagoOperacion {

    // Método para crear sesión (pago)
    public void crearSistema(NuevoSistemaPago nuevoSistemaPago) {
        System.out.println("CREANDO LA SESION PARA: " + nuevoSistemaPago.getNombre());
    }

    // Método para validar correo
    public void validarCorreo(NuevoSistemaPago nuevoSistemaPago) {
        System.out.println("VALIDANDO CORREO PARA: " + nuevoSistemaPago.getCorreo());
    }

    // Método de autorización
    public void validarAutorizacion() {
        System.out.println("VALIDACION DE AUTORIZACION...");
    }

    // Método para realizar el pago
    public void realizarPago() {
        System.out.println("REALIZANDO EL PAGO...");
    }
}
