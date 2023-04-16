package Act_10;
import java.lang.Math;
public class Hexagon implements interface_shape { //Asdruds

    public double lado;

    public Hexagon(double lado){
        this.lado = lado;
    }


    public double calcularArea() {
        return (3 * Math.sqrt(3) * (lado * lado)) / 2;
    }

    public double calcularPerimetro() {
        return lado * 6;
    }

}
