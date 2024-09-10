package Actividad;

public abstract class Email {
    protected String from;
    protected String subject;
    protected String body;

    public Email(String from, String subject, String body) {
        this.from = from;
        this.subject = subject;
        this.body = body;
    }

    public abstract void sendEmail(String to);
}
