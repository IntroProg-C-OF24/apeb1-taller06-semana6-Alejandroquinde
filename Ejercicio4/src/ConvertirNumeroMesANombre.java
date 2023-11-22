import java.util.Scanner;

public class ConvertirNumeroMesANombre {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese un número de mes (1 al 12): ");
            int numeroMes = sc.nextInt();
            String nombreMes = convertirNumeroAMes(numeroMes);
            if (nombreMes != null) {
                System.out.println("El nombre del mes es: " + nombreMes);
            } else {
                System.out.println("Número de mes inválido. Debe estar entre 1 y 12.");
            }
        }
    }
    private static String convertirNumeroAMes(int numeroMes) {
        return switch (numeroMes) {
            case 1 -> "Enero";
            case 2 -> "Febrero";
            case 3 -> "Marzo";
            case 4 -> "Abril";
            case 5 -> "Mayo";
            case 6 -> "Junio";
            case 7 -> "Julio";
            case 8 -> "Agosto";
            case 9 -> "Septiembre";
            case 10 -> "Octubre";
            case 11 -> "Noviembre";
            case 12 -> "Diciembre";
            default -> null;
        };
    }
}
