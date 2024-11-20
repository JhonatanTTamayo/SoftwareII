/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_17_patron_singleton;

/**
 *
 * @author jhonatan
 */
public class Taller_17_Patron_Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Obtener la instancia única de Settings
        Settings settings = Settings.getInstance();

        // Obtener configuraciones iniciales
        System.out.println("Tema actual: " + settings.getConfiguracion("theme"));
        System.out.println("Idioma actual: " + settings.getConfiguracion("language"));

        // Modificar configuraciones
        settings.setConfiguracion("theme", "dark");
        settings.setConfiguracion("language", "es");

        // Verificar cambios en las configuraciones
        System.out.println("Nuevo tema: " + settings.getConfiguracion("theme"));
        System.out.println("Nuevo idioma: " + settings.getConfiguracion("language"));

    }
    
}
