/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta2;

/**
 *
 * @author jhona
 */
public class Hamburguesa {
    private String tipoTomate;
    private String tipoCarne;
    private String tipoQueso;
    private String tipoPan;

    // Constructor privado para evitar instanciación directa
    Hamburguesa() {}

    // Métodos para mostrar los ingredientes de la hamburguesa
    @Override
    public String toString() {
        return "Hamburguesa con: " + tipoTomate + ", " + tipoCarne + ", " + tipoQueso + ", " + tipoPan;
    }

    // Getters y Setters
    public void setTipoTomate(String tipoTomate) {
        this.tipoTomate = tipoTomate;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    public void setTipoPan(String tipoPan) {
        this.tipoPan = tipoPan;
    }
}

