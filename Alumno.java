package Act_6;

public class Alumno { //Asdruds

    public String nombre;
    public int [] calificaciones;

    public Alumno (String nombre, int[]calificaciones){
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public float calcularPromedio(int[] calificaciones) {

        float suma = 0;

        for (int x = 0; x < calificaciones.length; x++) {
            suma = suma + calificaciones[x];
        }
        float prom = suma / calificaciones.length;
        return prom;
    }

    public char calificaciónF(float prom) {

        char calF = 'Z';

        if (prom > 90) {
            calF = 'A';
        } else if (prom > 80) {
            calF = 'B';
        } else if (prom > 70) {
            calF = 'C';
        } else if (prom > 60) {
            calF = 'D';
        } else if (prom > 50) {
            calF = 'E';
        } else if (prom <= 50) {
            calF = 'F';
        }
        return calF;
    }

    public void resultados (String nombre, float promedio, char calificación){

        System.out.println("Nombre del estudiante: " + nombre);
        int cont = 1;
        for (int x = 0; x < calificaciones.length; x++){
            System.out.println("Calificación " + cont + " : " + calificaciones[x]);
            cont++;
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificación);

    }

}
