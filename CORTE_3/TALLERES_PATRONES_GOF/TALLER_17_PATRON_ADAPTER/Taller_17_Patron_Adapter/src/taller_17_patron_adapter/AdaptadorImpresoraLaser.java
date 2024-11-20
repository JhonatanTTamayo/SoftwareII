/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_17_patron_adapter;

/**
 *
 * @author jhonatan
 */
public class AdaptadorImpresoraLaser implements Impresora {
    private ImpresoraLaser impresoraLaser;

    public AdaptadorImpresoraLaser(ImpresoraLaser impresoraLaser) {
        this.impresoraLaser = impresoraLaser;
    }

    @Override
    public void imprimir() {
        impresoraLaser.imprimirConLaser();
    }
}

