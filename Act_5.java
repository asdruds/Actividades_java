import javax.swing.JOptionPane;
public class Act_5 {
    public static void main(String[] args) { //Asdruds

        int num1, num2;
        float suma, resta, mult, div, mod;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo número: "));

        suma = (num1 + num2);
        resta = (num1 - num2);
        mult = (num1 * num2);
        div = (num1 / num2);
        mod = (num1 % num2);

        System.out.println("X = " + num1);
        System.out.println("Y = " + num2);
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + mult);
        System.out.println("División: " + div);
        System.out.println("Módulo: " + mod);
    }
}