/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pregunta2;

/**
 *
 * @author jhona
 */
public class Main {
    public static void main(String[] args) {
     
        Hamburguesa hamburguesa = new HamburguesaBuilder()
            .conTomate("Tomate Rojo")
            .conCarne("Carne de Res")
            .conQueso("Queso Cheddar")
            .conPan("Pan Integral")
            .build();

        System.out.println(hamburguesa);

        Hamburguesa hamburguesa2 = new HamburguesaBuilder()
            .conTomate("Tomate Cherry")
            .conCarne("Carne de Pollo")
            .conQueso("Queso Mozzarella")
            .conPan("Pan de Ajo")
            .build();

        System.out.println(hamburguesa2);
    }
}

