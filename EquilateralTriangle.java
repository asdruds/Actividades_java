package Act_10;

import java.lang.Math;

public class EquilateralTriangle implements interface_shape { //Asdruds

    private double sideLength;   // cm
    private double heightLength; // cm

    public EquilateralTriangle(double sideLength) {
        this.sideLength = sideLength;
        this.heightLength = calculateHeightLength();
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
        this.heightLength = calculateHeightLength();
    }

    public double getSideLength() {
        return sideLength;
    }

    public double getHeightLength() {
        return heightLength;
    }

    public double calcularArea() {
        return (sideLength * heightLength) / 2.0;
    }

    public double calcularPerimetro() {
        return sideLength * 3.0;
    }

    private double calculateHeightLength() {
        return (Math.sqrt(3.0) * this.sideLength) / 2.0;
    }

}
