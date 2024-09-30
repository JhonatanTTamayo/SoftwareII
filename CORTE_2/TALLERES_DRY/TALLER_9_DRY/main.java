public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Validando emails
        ValidadorEmail validador = new ValidadorEmail();

        String email1 = "usuario1@gmail.com";
        String email2 = "usuario2gmail.com";  // Email inválido (falta '@')

        validador.validarEmail(email1);
        validador.validarEmail(email2);
    }

}
