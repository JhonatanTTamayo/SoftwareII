public class ValidadorEmail {
    public void validarEmail(String email) {
         if (!email.contains("@") || !email.contains(".")) {
             System.out.println("Email inválido: " + email);
         } else {
             System.out.println("Email válido: " + email);
         }
     }
 }