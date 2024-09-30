public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // invertir cadena
        String cadena = "Hola Mundo";
        String cadenaInvertida = invertircadena.invertirCadena(cadena);
        System.out.println("Cadena invertida: " + cadenaInvertida);

        // encontrar el mayor en un arreglo
        int[] numeros = {16, 3, 27, 15, 8, 10, 77};
        int mayor = Encontrarmayor.encontrarMayor(numeros);
        System.out.println("Numero mayor: " + mayor);

    }

}