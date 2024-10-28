/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_16_patron_builder;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author juanm
 */
public class Taller_16_Patron_Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un conjunto de intereses
        Set<String> intereses = new HashSet<>();
        intereses.add("Programación");
        intereses.add("Lectura");
        intereses.add("Música");

        // Crear un objeto Usuario usando el Builder
        Usuario usuario = new Usuario.Builder()
                .nombre("Juan Pérez")
                .edad(25)
                .correo("juan.perez@example.com")
                .intereses(intereses)
                .build();

        // Imprimir el objeto Usuario
        System.out.println(usuario);
    }
    
}
