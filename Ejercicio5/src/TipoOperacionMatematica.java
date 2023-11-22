import java.util.Scanner;

public class TipoOperacionMatematica {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese un número de operación (1 al 4): ");
            int numeroOperacion = sc.nextInt();
            String tipoOperacion = determinarTipoOperacion(numeroOperacion);
            if (tipoOperacion != null) {
                System.out.println("El tipo de operación es: " + tipoOperacion);
            } else {
                System.out.println("Número de operación inválido. Debe estar entre 1 y 4.");
            }
        }
    }
    private static String determinarTipoOperacion(int numeroOperacion) {
        return switch (numeroOperacion) {
            case 1 -> "Suma";
            case 2 -> "Resta";
            case 3 -> "Multiplicación";
            case 4 -> "División";
            default -> null;
        };
    }
}
