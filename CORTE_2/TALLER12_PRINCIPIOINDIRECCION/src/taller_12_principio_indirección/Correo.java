package src.taller_12_principio_indirección;

public class Correo {
    private String servicio;
    private String idUsuario;

    public Correo(String servicio, String idUsuario) {
        this.servicio = servicio;
        this.idUsuario = idUsuario;
    }

    public String getServicio() {
        return servicio;
    }

    public String getIdUsuario() {
        return idUsuario; // Puedes usar esta variable si es necesaria
    }
}
