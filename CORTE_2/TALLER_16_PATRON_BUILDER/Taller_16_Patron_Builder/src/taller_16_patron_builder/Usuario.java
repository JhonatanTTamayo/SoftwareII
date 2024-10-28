/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_16_patron_builder;
import java.util.Set;
/**
 *
 * @author juanm
 */

public class Usuario {
    private String nombre;
    private int edad;
    private String correo;
    private Set<String> intereses;

    // Constructor privado para asegurar que solo el Builder pueda crear instancias
    private Usuario(Builder builder) {
        this.nombre = builder.nombre;
        this.edad = builder.edad;
        this.correo = builder.correo;
        this.intereses = builder.intereses;
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getCorreo() { return correo; }
    public Set<String> getIntereses() { return intereses; }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", correo='" + correo + '\'' +
                ", intereses=" + intereses +
                '}';
    }
}