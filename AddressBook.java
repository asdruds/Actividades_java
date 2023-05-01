package Act_12;

import java.util.HashMap;
import java.util.Scanner;
import java.io.*;
public class AddressBook { //Asdruds

    public HashMap<String, String> Contactos = new HashMap<String, String>();
    String archivo = "Contactos.csv";
    Scanner scanner = new Scanner(System.in);

    public void create(){

        System.out.print("Nombre del contacto:");
        String nombre = scanner.nextLine();

        System.out.print("Número del contacto:");
        String telefono = scanner.nextLine();

        Contactos.put(telefono, nombre);
        System.out.println("Contacto agregado.");

    }

    public void delete(){

        System.out.println("Ingresa el número telefonico que deseas eliminar: ");
        String telefono = scanner.nextLine();

        if (Contactos.containsKey(telefono)){

            Contactos.remove(telefono);
            System.out.println("El número fue eliminado.");

        }else {

            System.out.println("No se encotró el número.");

        }
    }

    public void list(){

        System.out.println("Contactos: ");
        for (String numT : Contactos.keySet()){

            String nombre = Contactos.get(numT);
            System.out.println(numT + " : " + nombre);

        }

    }

    public void save () throws IOException{

        BufferedWriter writer = new BufferedWriter(new FileWriter(archivo));
        for (String numT : Contactos.keySet()) {
            String nombre = Contactos.get(numT);
            String line = "{" + numT + "},{" + nombre + "}";
            writer.write(line);
            writer.newLine();
        }
        writer.close();

        System.out.println("Se agregaron los contactos.");

    }

    public void load(){

        System.out.print("Ingresa el path del archivo: ");
        String csv = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(csv))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] contacto = line.split(",");
                String num = contacto[0];
                String nombre = contacto[1];
                Contactos.put(num, nombre);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
