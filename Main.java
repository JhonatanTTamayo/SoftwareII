import java.util.Scanner;

class Usuario {
    String nombre;
    String email;
    String contraseña;

    Usuario(String nombre, String email, String contraseña) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
    }

    static Usuario informacionUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su email: ");
        String email = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String contraseña = scanner.nextLine();

        return new Usuario(nombre, email, contraseña);
    }
}

class CorreoUsuario {
    
    void enviarCorreo(String destinatario, String asunto, String mensaje) {
        System.out.println("Enviando correo a: " + destinatario);
        System.out.println("Asunto: " + asunto);
        System.out.println("Mensaje: " + mensaje);
    }
}

class ValidarContraseña {
    
    boolean contraseñaValidar(String contraseña) {
        return contraseña.length() >= 8;
    }
}

class CalcularSalario {
    
    double calcularSalario(double salarioBase, double bonificaciones, double deducciones) {
        return salarioBase + bonificaciones - deducciones;
    }
}

public class Main {
    public static void main(String[] args) {
        Usuario usuario = Usuario.informacionUsuario();

        ValidarContraseña validar = new ValidarContraseña();
        boolean esValida = validar.contraseñaValidar(usuario.contraseña);

        if (esValida) {
            System.out.println("Contraseña cumple para " + usuario.nombre);

            CorreoUsuario servicioCorreo = new CorreoUsuario();
            servicioCorreo.enviarCorreo(usuario.email, "Bienvenidos", "Funciona para " + usuario.nombre + ", ¡bienvenido a nuestro sistema!");

            CalcularSalario calculadora = new CalcularSalario();
            double salario = calculadora.calcularSalario(3000, 500.0, 200.0);
            System.out.println("El salario que se va a ganar es: " + salario);
        } else {
            System.out.println("Contraseña invalida.");
        }
    }
}
