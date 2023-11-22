import java.util.Scanner;

public class CostoEnvioPaquetes {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el peso del paquete en kg: ");
            double peso = sc.nextDouble();
            System.out.print("Ingrese la región (local/nacional/internacional): ");
            String region = sc.next();
            double costoEnvio = calcularCostoEnvio(peso, region);
            System.out.println("El costo de envío es: $" + costoEnvio);
        }
    }
    private static double calcularCostoEnvio(double peso, String region) {
        double costo = 0;
        if (peso < 5 && region.equalsIgnoreCase("local")) {
            System.out.println("costo = 5");  
        } else if (peso >= 5 && peso <= 10 && region.equalsIgnoreCase("nacional")) {
            System.out.println("costo = 10");
        } else {
            System.out.println("costo = 15;");
        }
        return costo;
    }
}
