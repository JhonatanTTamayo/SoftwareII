package src.taller_12_principio_indirección;

public class GmailNotificaciones implements ServicioNotificaciones {
    @Override
    public Correo crear(Usuario usuario) {
        return new Correo("Gmail", usuario.getNombre(), usuario.getIdentificacion());
    }
}