package Act_12;

import java.io.IOException;
import java.util.Scanner;

public class Act_12 { //Asdruds

    public static void main(String[] args) throws IOException {

        AddressBook contactos = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------------");
        System.out.println("  a)Guardar un nuevo contacto\n  b)Eliminar un contacto\n  c)Mostrar todos los contactos\n  d)Guardar archivo\n  e)Aregar de un archivo\n  f)Salir");
        System.out.println("---------------------------------");
        System.out.print("Ingresa una opción: ");
        String respuesta = scanner.nextLine();

        do {

            switch (respuesta){
                case "a":
                case "A":
                    contactos.create();
                    break;
                case "b":
                case "B":
                    contactos.delete();
                    break;
                case "c":
                case "C":
                    contactos.list();
                    break;
                case "d":
                case "D":
                    contactos.save();
                    break;
                case "e":
                case "E":
                    contactos.load();
                    break;
                case "f":
                case "F":
                    break;
                default:
                    System.out.println("Opción no válida");
            }

            System.out.println("---------------------------------");
            System.out.print("  a)Guardar\n  b)Eliminar\n  c)Mostrar\n  d)Guardar\n  e)Cargar al archivo\n\nQue deseas realizar: ");
            respuesta = scanner.nextLine();

        }while(!respuesta.equals("f") && !respuesta.equals("F"));

        contactos.save();
        System.out.println("Hasta luego :)");

    }

}
