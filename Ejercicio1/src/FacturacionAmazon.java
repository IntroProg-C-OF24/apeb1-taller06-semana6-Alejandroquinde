import java.util.Scanner;

public class FacturacionAmazon {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double costoProducto1, costoProducto2, costoEnvio, subtotal, descuento, iva, total;
            System.out.print("Ingrese el costo del primer producto: $");
            costoProducto1 = sc.nextDouble();
            System.out.print("Ingrese el costo del segundo producto: $");
            costoProducto2 = sc.nextDouble();
            System.out.print("Ingrese los gastos de envío: $");
            costoEnvio = sc.nextDouble();
            subtotal = costoProducto1 + costoProducto2 + costoEnvio;
            iva = subtotal * 0.10;
            if (subtotal > 1000) {
                descuento = subtotal * 0.20;
            } else if (subtotal >= 500) {
                descuento = subtotal * 0.05;
            } else {
                descuento = 0;
            }   
            if (subtotal > 5000) {
                costoEnvio = 0;
            }   
            total = subtotal - descuento + iva;
            System.out.println("\nDetalle de la Factura:");
            System.out.println("Costo Producto 1: $" + costoProducto1);
            System.out.println("Costo Producto 2: $" + costoProducto2);
            System.out.println("Gastos de Envío: $" + costoEnvio);
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Descuento: $" + descuento);
            System.out.println("IVA (10%): $" + iva);
            System.out.println("Total: $" + total);
        }
    }
}
