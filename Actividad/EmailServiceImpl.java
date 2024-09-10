package Actividad;

public class EmailServiceImpl implements EmailService {

    private Email email;

    public EmailServiceImpl(Email email) {
        this.email = email;
    }

    @Override
    public void sendEmail(String to, String from, String subject, String body) {
        System.out.println("Enviando correo ---> Cargando...");
        email.sendEmail(to);
    }
}
