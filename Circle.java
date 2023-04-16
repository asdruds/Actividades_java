package Act_10;

class Circle implements interface_shape { //Asdruds

    public static final double PI = 3.141592;
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double calcularArea() {
        return PI * radius * radius;
    }

    public double calcularPerimetro() {
        return PI * getDiameter();
    }

}
