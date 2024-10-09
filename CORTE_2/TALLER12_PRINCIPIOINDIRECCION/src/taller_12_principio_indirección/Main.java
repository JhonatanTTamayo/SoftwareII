package src.taller_12_principio_indirección;

public class Main {
    public static void main(String[] args) {
        ServicioNotificaciones gmailService = new GmailNotificaciones();
        Usuario usuario = new Usuario("JuanM", "123456", gmailService);
        usuario.generarCorreo();
        
        ServicioNotificaciones outlookService = new OutlookNotificaciones();
        Usuario otroUsuario = new Usuario("Valeria", "654321", outlookService);
        otroUsuario.generarCorreo();
    }
}
