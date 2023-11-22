import java.util.Scanner;

public class ClasificacionTriangulo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el lado 1 del triángulo: ");
            double lado1 = sc.nextDouble();
            System.out.print("Ingrese el lado 2 del triángulo: ");
            double lado2 = sc.nextDouble();
            System.out.print("Ingrese el lado 3 del triángulo: ");
            double lado3 = sc.nextDouble();
            if (esTriangulo(lado1, lado2, lado3)) {
                if (lado1 == lado2 && lado2 == lado3) {
                    System.out.println("Triángulo equilátero");
                } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                    System.out.println("Triángulo isósceles");
                } else {
                    System.out.println("Triángulo escaleno");
                }
            } else {
                System.out.println("No es un triángulo");
            }
        }
    }
    private static boolean esTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }
}
