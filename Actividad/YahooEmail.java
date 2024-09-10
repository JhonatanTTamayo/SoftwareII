package Actividad;

public class YahooEmail extends Email {

    public YahooEmail(String from, String subject, String body) {
        super(from, subject, body);
    }

    @Override
    public void sendEmail(String to) {
        System.out.println("Enviando correo desde Yahoo a " + to);
    }
}
