package Act_11;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu { //Asdruds

    //public Deck deck;

    Scanner scanner = new Scanner(System.in);

    public Menu(){

    }

    public int showMenu() throws Exception {

        int respuesta;
        System.out.println("Elige una opción:\n  1) Mezclar\n  2) Mostrar primer carta\n  3) Seleccionar carta al azar\n  4) Sacar 5 cartas\n  5) Cambiar\n  6) Salir");

        try {
            respuesta = new Scanner(System.in).nextInt();
        } catch (InputMismatchException e){
            System.out.println("Opción no válida.");
            System.out.println("Vuelve a ingresar una opción.");

            respuesta = new Scanner(System.in).nextInt();
        }
        if (respuesta < 0 || respuesta >6){
            System.out.println("No se seleccionó ninguna respusta correcta");
            System.exit(0);
        }
        return respuesta;
    }


}
