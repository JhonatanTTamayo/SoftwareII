package taller_13_principio_variaciones_protegidas;

public class TALLER_13_PRINCIPIO_VARIACIONES_PROTEGIDAS {

    public static void main(String[] args) {
        Notificacion notificacion = new Notificacion("Título de Prueba", "Cuerpo de la notificación");
        
        CanalCorreoElectronico canalCorreo = new CanalCorreoElectronico();
        CanalSMS canalSMS = new CanalSMS();
        CanalWhatsapp canalWhatsapp = new CanalWhatsapp();

        // Aquí puedes usar los canales para enviar la notificación
        System.out.println("Notificación creada: " + notificacion.getTitulo());
    }
}
