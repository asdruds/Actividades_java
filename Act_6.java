package Act_6;
import javax.swing.*;
public class Act_6 {

    public static void main(String[] args) { //Asdruds

        String nombreA;
        int [] calificaciones = new int [5];
        int num = 1;
        float promedio;
        char calificaciónF;

        nombreA = JOptionPane.showInputDialog("Ingresa nombre del alumno: ");
        for(int x = 0; x < 5; x++){
            int calif = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la calificación " + num + ": (0 - 100)"));

            if (calif < 0 || calif > 100) {
                do {
                    calif = Integer.parseInt(JOptionPane.showInputDialog("Calificación ingresada inválida, vuelva a ingresar la calificación: " + num));
                } while (calif < 0 || calif > 100);
            }
            calificaciones[x] = calif;
            num++;
        }

        Alumno Asdru = new Alumno(nombreA,calificaciones);

        promedio = Asdru.calcularPromedio(calificaciones);
        calificaciónF = Asdru.calificaciónF(Asdru.calcularPromedio(calificaciones));

        Asdru.resultados(Asdru.nombre,promedio,calificaciónF);

        /*
        Otra forma de declarar el metodo de resultados

        Asdru.resultados(Asdru.nombre,Asdru.calcularPromedio(calificaciones),Asdru.calificaciónF(Asdru.calcularPromedio(calificaciones)));
        */
    }
}
