/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_17_patron_adapter;

/**
 *
 * @author jhonatan
 */
public class Taller_17_Patron_Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear instancias de impresoras específicas
        ImpresoraLaser impresoraLaser = new ImpresoraLaser();
        ImpresoraInkJet impresoraInkJet = new ImpresoraInkJet();

        // Adaptar las impresoras a la interfaz común
        Impresora adaptadorLaser = new AdaptadorImpresoraLaser(impresoraLaser);
        Impresora adaptadorInkJet = new AdaptadorImpresoraInkJet(impresoraInkJet);

        // Usar las impresoras a través de la interfaz común
        System.out.println("Usando el adaptador:");
        adaptadorLaser.imprimir();
        adaptadorInkJet.imprimir();
    }
}
