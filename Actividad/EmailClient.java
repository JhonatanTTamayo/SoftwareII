package Actividad;

public class EmailClient {

    private EmailService emailService;

    public EmailClient(EmailService emailService) {
        this.emailService = emailService;
    }

    public void sendEmail(String to, String from, String subject, String body) {
        System.out.println("=====================================");
        System.out.println("De: " + from);
        System.out.println("Para: " + to);
        System.out.println("Asunto: " + subject);
        System.out.println("Cuerpo del mensaje: ");
        System.out.println(body);
        System.out.println("=====================================\n");

        emailService.sendEmail(to, from, subject, body);
    }

    public static void main(String[] args) {
        Email outlookEmail = new OutlookEmail("jhonatan@example.com", "Prueba", "Este es un correo de prueba.");
        EmailService emailService = new EmailServiceImpl(outlookEmail);
        EmailClient client = new EmailClient(emailService);
        client.sendEmail("tamayo@example.com", "jhonatan@example.com", "Prueba", "Este es un correo de prueba enviado desde Outlook.");

        Email gmailEmail = new GmailEmail("yo@gmail.com", "Prueba", "Este es un correo de prueba.");
        emailService = new EmailServiceImpl(gmailEmail);
        client = new EmailClient(emailService);
        client.sendEmail("tu@gmail.com", "jhonatan@example.com", "Prueba", "Este es un correo de prueba enviado desde Gmail.");

        Email yahooEmail = new YahooEmail("jhonatan@example.com", "Prueba", "Este es un correo de prueba.");
        emailService = new EmailServiceImpl(yahooEmail);
        client = new EmailClient(emailService);
        client.sendEmail("jhonatan@yahoo.com", "jhonatan@example.com", "Prueba", "Este es un correo de prueba enviado desde Yahoo.");
    }
}
