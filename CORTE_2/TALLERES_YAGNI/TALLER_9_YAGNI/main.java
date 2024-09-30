public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Validando emails
        ValidadorEmail validador = new ValidadorEmail();

        String email1 = "usuario1@ejemplo.com";
        String email2 = "usuario2ejemplo.com";  // Email inválido (falta '@')

        validador.validarEmail(email1);
        validador.validarEmail(email2);

        // invertir cadena
        String cadena = "Hola Mundo";
        String cadenaInvertida = invertircadena.invertirCadena(cadena);
        System.out.println("Cadena invertida: " + cadenaInvertida);

        // encontrar el mayor en un arreglo
        int[] numeros = {16, 3, 27, 15, 8, 10, 77};
        int mayor = Encontrarmayor.encontrarMayor(numeros);
        System.out.println("Numero mayor: " + mayor);

        // Libros y biblioteca
        Biblioteca biblioteca = new Biblioteca();


        Libro libro1 = new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", 1997);
        Libro libro2 = new Libro("Los juegos del hambre", "Suzanne Collins", 2008);
        Libro libro3= new Libro("El corredor del laberinto", "James Dashner", 2009);

   
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        
        biblioteca.mostrarLibros();
    }

}

