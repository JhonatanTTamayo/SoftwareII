package Actividad;

public class GmailEmail extends Email {

    public GmailEmail(String from, String subject, String body) {
        super(from, subject, body);
    }

    @Override
    public void sendEmail(String to) {
        System.out.println("Enviando correo desde Gmail a " + to);
    }
}
