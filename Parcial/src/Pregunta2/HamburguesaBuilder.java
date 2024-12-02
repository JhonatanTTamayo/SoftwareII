/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta2;

/**
 *
 * @author jhona
 */
public class HamburguesaBuilder {
    private final Hamburguesa hamburguesa;


    public HamburguesaBuilder() {
        hamburguesa = new Hamburguesa();
    }

    public HamburguesaBuilder conTomate(String tipoTomate) {
        hamburguesa.setTipoTomate(tipoTomate);
        return this;
    }

    public HamburguesaBuilder conCarne(String tipoCarne) {
        hamburguesa.setTipoCarne(tipoCarne);
        return this;
    }

    public HamburguesaBuilder conQueso(String tipoQueso) {
        hamburguesa.setTipoQueso(tipoQueso);
        return this;
    }

    public HamburguesaBuilder conPan(String tipoPan) {
        hamburguesa.setTipoPan(tipoPan);
        return this;
    }

    public Hamburguesa build() {
        return hamburguesa;
    }
}

