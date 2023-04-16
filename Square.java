package Act_10;

class Square implements interface_shape { //Asdruds

    protected double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public double calcularArea() {
        return sideLength * sideLength;
    }

    public double calcularPerimetro() {
        return sideLength * 4;
    }

}

