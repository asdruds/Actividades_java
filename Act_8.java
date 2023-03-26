package Act_8;
import javax.swing.*;
import java.util.Scanner;

public class Act_8 { //Asdruds

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String op = JOptionPane.showInputDialog("Iniciar nuevo juego de Poker: \n Si \n No");

        if (op.equals("Si")){

            Deck NDeck = new Deck();

            String poker = JOptionPane.showInputDialog("Elige una opción:\n  a) Mezclar\n  b) Mostrar primer carta\n  c) Seleccionar carta al azar\n  d) Sacar 5 cartas\n  e) Cambiar\n  f) Salir");

            do {
                switch (poker) {
                    case "a":
                    case "A":
                        NDeck.shuffle();
                        break;
                    case "b":
                    case "B":
                        NDeck.head();
                        break;
                    case "c":
                    case "C":
                        NDeck.pick();
                        break;
                    case "d":
                    case "D":
                        NDeck.hand();
                        break;
                    case "e":  //Asdruds
                    case "E":
                            System.out.println("¿Cuántas cartas deseas cambiar? 0 - 5");
                            int numC = scanner.nextInt();
                            if (numC < 0 || numC > 5){
                                do{
                                    System.out.println("Cantidad no disponible, deben ser entre 0 - 5");
                                    numC = scanner.nextInt();
                                }while(numC < 0 || numC > 5);
                            }
                            NDeck.cambiar(numC);
                    case "f":
                    case "F":
                        break;
                    default:
                        System.out.println("Opción no válida");
                }

                poker = JOptionPane.showInputDialog("Elige otra opción:\n  a) Mezclar\n  b) Mostrar primer carta\n  c) Seleccionar carta al azar\n  d) Sacar 5 cartas\n  e) Cambiar\n  f) Salir");

            } while (!poker.equals("f") && !poker.equals("F"));

            System.out.println("Juego finalizado. ");

        } else if (op.equals("No")) {

            System.out.println("Hasta pronto :)");

        }

    }
}
