import java.sql.Connection;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do{
            System.out.println("_________________");
            System.out.println("Aplicación de mensajes");
            System.out.println("1. Crear mensajes");
            System.out.println("2. Listar mensajes");
            System.out.println("3. Editar mensajes");
            System.out.println("4. Eliminar mensajes");
            System.out.println("5. Salir");

            //se lee la opcion del usuario
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    MensajesServices.crearMensajes();
                    break;
                case 2:
                    MensajesServices.listarMensajes();
                    break;
                case 3:
                    MensajesServices.borrarMensajes();
                    break;
                case 4:
                    MensajesServices.editarMensajes();
                    break;
                default:
                    break;
            }

        }while(opcion !=5);

    }
}
