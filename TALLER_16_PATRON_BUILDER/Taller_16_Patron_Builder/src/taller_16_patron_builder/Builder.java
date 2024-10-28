/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_16_patron_builder;

/**
 *
 * @author juanm
 */
public static class Builder {
        private String nombre;
        private int edad;
        private String correo;
        private Set<String> intereses;

        public Builder() {
            // Constructor vacío para inicializar el Builder
        }

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder edad(int edad) {
            this.edad = edad;
            return this;
        }

        public Builder correo(String correo) {
            this.correo = correo;
            return this;
        }

        public Builder intereses(Set<String> intereses) {
            this.intereses = intereses;
            return this;
        }

        public Usuario build() {
            return new Usuario(this);
        }
    }

