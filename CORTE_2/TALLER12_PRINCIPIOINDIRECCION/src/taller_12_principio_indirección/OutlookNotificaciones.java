package src.taller_12_principio_indirección;

public class OutlookNotificaciones implements ServicioNotificaciones {
    @Override
    public Correo crear(Usuario usuario) {
        return new Correo("Outlook", usuario.getNombre(), usuario.getIdentificacion());
    }
}