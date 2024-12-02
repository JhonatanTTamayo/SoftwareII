/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta1;

/**
 *
 * @author jhona
 */
interface ServicioEnvio {
    void enviarPaquete(String paquete);
}

class ServicioEnvioExpress implements ServicioEnvio {
    @Override
    public void enviarPaquete(String paquete) {
        System.out.println("ENVIANDO PAQUETE DE FORMA EXPRESS: " + paquete);
    }
}

class ServicioEnvioRegular implements ServicioEnvio {
    @Override
    public void enviarPaquete(String paquete) {
        System.out.println("ENVIANDO PAQUETE DE FORMA REGULAR: " + paquete);
    }
}

interface FabricaEnvio {
    ServicioEnvio crearServicio();
}


class FabricaEnvioExpress implements FabricaEnvio {
    @Override
    public ServicioEnvio crearServicio() {
        return new ServicioEnvioExpress();
    }
}

class FabricaEnvioRegular implements FabricaEnvio {
    @Override
    public ServicioEnvio crearServicio() {
        return new ServicioEnvioRegular();
    }
}

public class Servicios {
    public static void main(String[] args) {
        
        FabricaEnvio fabricaExpress = new FabricaEnvioExpress();
        ServicioEnvio servicioExpress = fabricaExpress.crearServicio();
        servicioExpress.enviarPaquete("Documentos Urgentes");

        FabricaEnvio fabricaRegular = new FabricaEnvioRegular();
        ServicioEnvio servicioRegular = fabricaRegular.crearServicio();
        servicioRegular.enviarPaquete("Paquete Normal");
    }
}
  
