package Act_7;
import javax.swing.*;

public class Act_7 {
    public static void main(String[] args) { //Asdruds

       String opcion = JOptionPane.showInputDialog("Elige una opción:\n    a)Números primos\n    b)Sucesión fibonacci\n    c)Ambos\n    d)Salir");

       int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Tamaño de la serie: "));
       Suce Serie = new Suce(tamaño);

        int[] primo = Serie.S_primo(tamaño);
        int[] fibo = Serie.S_fibo(tamaño);

        switch(opcion){
           case "a":

               System.out.println("Serie de números primos: ");
               for(int x = 0; x < primo.length; x++){
                   System.out.print(primo[x] + ", ");
               }
               break;
           case "b":

               System.out.println("Serie de fibonacci: ");
               for(int x = 0; x < fibo.length; x++){
                   System.out.print(fibo[x] + ", ");
               }
               break;
           case "c":

                System.out.println("Serie de números primos: ");
                for(int x = 0; x < primo.length; x++){
                    System.out.print(primo[x] + ", ");
                }
                System.out.println("\nSerie de fibonacci: ");
                for(int x = 0; x < fibo.length; x++){
                    System.out.print(fibo[x] + ", ");
                }
                break;
           case "d":
                System.out.println("Adiós :)");
                break;
            default:
                System.out.println("Opción no válida");
        }

    }
}
