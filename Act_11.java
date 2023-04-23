package Act_11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Act_11 {

    public static void main(String[] args) throws Exception { //Asdruds

        int respuesta;

        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        System.out.println("Iniciar nuevo juego de Poker: \n  1) Si \n  2) No");

        try {

            respuesta = new Scanner(System.in).nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Opción no válida.");

            System.out.println("Vuelve a ingresar una opción.");

            respuesta = new Scanner(System.in).nextInt();

        }

        if (respuesta == 1) {

            System.out.println("Inicia el juego");

        } else if (respuesta == 2) {

            System.out.println("Hasta luego :)");
            System.exit(0);

        } else {

            System.out.println("No se seleccionó ninguna respusta correcta");
            System.exit(0);
        }

        Deck deck = new Deck();

        int juego = menu.showMenu();

        do {
            switch (juego) {
                case 1:
                    deck.shuffle();
                    break;
                case 2:
                    deck.head();
                    break;
                case 3:
                    deck.pick();
                    break;
                case 4:
                    deck.hand();
                    break;
                case 5:
                    System.out.println("¿Cuántas cartas deseas cambiar? 0 - 5");
                    int numC = scanner.nextInt();
                    if (numC < 0 || numC > 5) {
                        do {
                            System.out.println("Cantidad no disponible, deben ser entre 0 - 5");
                            numC = scanner.nextInt();
                        } while (numC < 0 || numC > 5);
                    }
                    deck.cambiar(numC);
                    break;
                case 6:
                    System.out.println("Juego finalizado. ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
            }

            juego = menu.showMenu();

        } while (juego != 6);

    }

}
