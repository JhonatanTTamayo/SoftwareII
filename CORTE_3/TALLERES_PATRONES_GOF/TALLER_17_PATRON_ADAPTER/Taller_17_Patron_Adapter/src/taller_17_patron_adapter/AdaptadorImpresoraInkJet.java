/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_17_patron_adapter;

/**
 *
 * @author jhonatan
 */
public class AdaptadorImpresoraInkJet implements Impresora {
    private ImpresoraInkJet impresoraInkJet;

    public AdaptadorImpresoraInkJet(ImpresoraInkJet impresoraInkJet) {
        this.impresoraInkJet = impresoraInkJet;
    }

    @Override
    public void imprimir() {
        impresoraInkJet.imprimirConTinta();
    }
}

