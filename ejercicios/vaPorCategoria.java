package ejercicios;

import java.util.Scanner;

public class vaPorCategoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la categoría: ");
        String categoria = sc.nextLine().toLowerCase();

        System.out.print("Ingrese el precio base: ");
        double precioBase = sc.nextDouble();

        double ivaPorcentaje;
        switch (categoria) {
            case "alimentos":
                ivaPorcentaje = 0.08;
                break;
            case "electronica":
                ivaPorcentaje = 0.16;
                break;
            case "ropa":
                ivaPorcentaje = 0.12;
                break;
            default:
                System.out.println("Categoría no válida.");
                sc.close();
                return;
        }

        double iva = precioBase * ivaPorcentaje;
        double total = precioBase + iva;

        System.out.printf("Subtotal: %.2f\n", precioBase);
        System.out.printf("IVA (%.0f%%): %.2f\n", ivaPorcentaje * 100, iva);
        System.out.printf("Total: %.2f\n", total);

        sc.close();
        
    }
}
