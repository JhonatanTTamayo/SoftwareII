/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_16_patron_prototype;

/**
 *
 * @author jhonatan
 */
public class Taller_16_Patron_Prototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Crear una instancia de Producto
        Producto productoOriginal = new Producto("Computador", 2.500.000, "Electronica");

        // Clonar el producto
        Producto productoClonado = productoOriginal.clone();

        // Modificar el producto clonado para demostrar que es una copia independiente
        if (productoClonado != null) {
            productoClonado.setNombre("Tablet");
            productoClonado.setPrecio(900.000);
        }

        // Imprimir los productos para verificar la clonación
        System.out.println("Producto Original: " + productoOriginal);
        System.out.println("Producto Clonado: " + productoClonado);
    }
    
}
