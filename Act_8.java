package Act_8;
import javax.swing.*;

public class Act_8 { //Asdruds

    public static void main(String[] args) {

        String op = JOptionPane.showInputDialog("Iniciar nuevo juego de Poker: \na) Si \nb) No");

        if (op.equals("Si")){

            Deck NDeck = new Deck();

            String poker = JOptionPane.showInputDialog("Elige una opción:\n  a) Mezclar\n  b) Mostrar primer carta\n  c) Seleccionar carta al azar\n  d) Sacar 5 cartas\n  e) Salir");

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
                    case "e":
                    case "E":
                        break;
                    default:
                        System.out.println("Opción no válida");
                }

                poker = JOptionPane.showInputDialog("Elige otra opción:\n  a) Mezclar\n  b) Mostrar primer carta\n  c) Seleccionar carta al azar\n  d) Sacar 5 cartas\n  e) Salir");

            } while (!poker.equals("e"));

            System.out.println("Juego finalizado. ");

        } else if (op.equals("No")) {

            System.out.println("Hasta pronto :)");

        }

    }
}
