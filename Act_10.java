package Act_10;
import java.util.Scanner;

public class Act_10 { //Asdruds

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona propiedad a calcular: \n  a) área\n  b) perímetro");
        String propiedad = scanner.next();

        if(!propiedad.equals("a") && !propiedad.equals("b")){
            do{
                System.out.println("Opción no válida, vuelva a ingresar");
                propiedad = scanner.next();
            }while(!propiedad.equals("a") && !propiedad.equals("b"));
        }

        System.out.println("Selecciona la figura: \n  a) Circulo\n  b) Cuadrado\n  c) Triangulo Equilátero\n  d) Hexagono");
        String figura = scanner.next();

        if (!figura.equals("a") && !figura.equals("b") && !figura.equals("c") && !figura.equals("d")){
            do{
                System.out.println("Opción no válida, vuelva a ingresar");
                figura = scanner.next();
            }while(!figura.equals("a") && !figura.equals("b") && !figura.equals("c") && !figura.equals("d"));
        }

        switch (figura){
            case ("a"):

                System.out.println("Ingresa el valor del radio del círculo en cm: ");
                double radio = scanner.nextDouble();

                Circle shape1 = new Circle(radio);

                if(propiedad.equals("a")){
                    System.out.println("El area del circulo es: " + shape1.calcularArea() + " cm^2");
                } else if (propiedad.equals("b")) {
                    System.out.println("El perímetro del circulo es: " + shape1.calcularPerimetro() + " cm");
                }
                break;
            case ("b"):

                System.out.println("Ingresa el valor de un lado del cuadrado en cm: ");
                double ladoC = scanner.nextDouble();

                Square shape2 = new Square(ladoC);

                if(propiedad.equals("a")){
                    System.out.println("El area del cuadrado es: " + shape2.calcularArea() + " cm^2");
                } else if (propiedad.equals("b")){
                    System.out.println("El perímetro del cuadrado es: " + shape2.calcularPerimetro() + " cm");
                }
                break;
            case ("c"):

                System.out.println("Ingresa el valor de un lado del triángulo en cm: ");
                double ladoT = scanner.nextDouble();

                EquilateralTriangle shape3 = new EquilateralTriangle(ladoT);

                if(propiedad.equals("a")){
                    System.out.println("El area del triangulo es: " + shape3.calcularArea() + " cm^2");
                } else if (propiedad.equals("b")) {
                    System.out.println("El perímetro del triangulo es: " + shape3.calcularPerimetro() + " cm");
                }
                break;
            case ("d"):

                System.out.println("Ingresa el valor de un lado del hexágono en cm: ");
                double ladoH = scanner.nextDouble();

                Hexagon shape4 = new Hexagon(ladoH);

                if(propiedad.equals("a")){
                    System.out.println("El area del hexagono es: " + shape4.calcularArea() + " cm^2");
                } else if (propiedad.equals("b")) {
                    System.out.println("El perímetro del hexágono es: " + shape4.calcularPerimetro() + " cm");
                }
                break;
            default:
                System.out.println("Opción no valida");
        }

    }

}
