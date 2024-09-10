package Actividad;

public class OutlookEmail extends Email {

    public OutlookEmail(String from, String subject, String body) {
        super(from, subject, body);
    }

    @Override
    public void sendEmail(String to) {
        System.out.println("Enviando correo desde Outlook a " + to);
    }
}
