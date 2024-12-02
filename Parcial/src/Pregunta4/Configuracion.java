/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta4;

/**
 *
 * @author jhona
 */

public class Configuracion {

    private static Configuracion instancia;
    private String url;
    private String usuario;
    private String password;

    private Configuracion() {
        
        this.url = "http://default.url";
        this.usuario = "admin";
        this.password = "password123";
    }

    public static Configuracion getInstancia() {
        if (instancia == null) {
            // Si la instancia no existe, se crea
            instancia = new Configuracion();
        }
        return instancia;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

