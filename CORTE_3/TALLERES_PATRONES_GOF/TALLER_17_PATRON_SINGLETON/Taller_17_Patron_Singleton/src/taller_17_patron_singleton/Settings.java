/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_17_patron_singleton;

/**
 *
 * @author jhonatan
 */
import java.util.HashMap;
import java.util.Map;

public class Settings {
    // Instancia única de la clase
    private static Settings instancia;
    
    // Mapa para almacenar las configuraciones
    private Map<String, String> configuraciones;

    // Constructor privado para evitar instanciación desde fuera
    private Settings() {
        configuraciones = new HashMap<>();
        // Cargar configuraciones predeterminadas
        configuraciones.put("theme", "light");
        configuraciones.put("language", "en");
    }

    // Método público para obtener la instancia única
    public static Settings getInstance() {
        if (instancia == null) {
            instancia = new Settings();
        }
        return instancia;
    }

    // Método para obtener una configuración
    public String getConfiguracion(String clave) {
        return configuraciones.getOrDefault(clave, "Valor no encontrado");
    }

    // Método para establecer o actualizar una configuración
    public void setConfiguracion(String clave, String valor) {
        configuraciones.put(clave, valor);
    }
}

