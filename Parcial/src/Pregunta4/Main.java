/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pregunta4;

/**
 *
 * @author jhona
 */

public class Main {
    public static void main(String[] args) {
        
        Configuracion config = Configuracion.getInstancia();

        System.out.println("URL: " + config.getUrl());
        System.out.println("Usuario: " + config.getUsuario());
        System.out.println("Password: " + config.getPassword());

        config.setUrl("http://nueva.url");
        config.setUsuario("nuevoUsuario");
        config.setPassword("nuevoPassword");

        System.out.println("\nConfiguracion despues de cambios:");
        System.out.println("URL: " + config.getUrl());
        System.out.println("Usuario: " + config.getUsuario());
        System.out.println("Password: " + config.getPassword());

        Configuracion config2 = Configuracion.getInstancia();
        System.out.println("\nSon las dos instancias iguales? " + (config == config2));
    }
}

