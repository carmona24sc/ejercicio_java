package ejercicios;

import java.util.Scanner;

public class MenuConversiones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tasas de conversión (puedes editarlas para probar distintos escenarios)
        final double USD_TO_EUR = 0.92;
        final double KM_TO_MI = 0.621371;
        final double KG_TO_LB = 2.20462;

        System.out.println("Seleccione una conversión:");
        System.out.println("1. Dólares a Euros");
        System.out.println("2. Kilómetros a Millas");
        System.out.println("3. Kilogramos a Libras");
        System.out.print("Opción (1-3): ");
        int opcion = sc.nextInt();

        System.out.print("Ingrese el valor a convertir: ");
        double valor = sc.nextDouble();

        double resultado = 0;
        String mensaje = "";

        switch (opcion) {
            case 1:
                resultado = valor * USD_TO_EUR;
                mensaje = String.format("%.2f dólares son %.2f euros.", valor, resultado);
                break;
            case 2:
                resultado = valor * KM_TO_MI;
                mensaje = String.format("%.2f km son %.2f millas.", valor, resultado);
                break;
            case 3:
                resultado = valor * KG_TO_LB;
                mensaje = String.format("%.2f kg son %.2f libras.", valor, resultado);
                break;
            default:
                mensaje = "Opción no válida.";
        }

        System.out.println(mensaje);
        sc.close();
    }
}
