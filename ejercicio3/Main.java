package ejercicio3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Programacion Estructurada
        System.out.println("¡Hola, Mundo!");
        System.out.println("Numero 1: ");
        int numero1 = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea pendiente

        System.out.println("Numero 2: ");
        int numero2 = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea pendiente
       
        System.out.println("Elije la operacion a realizar");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int opcion = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea pendiente

        // int suma = num1 + num2;
        // System.out.println("La suma es: " + suma);

        // Programacion Orientada a Objetos
        OperacionesArimetricas op1 = new OperacionesArimetricas();
        op1.num1 = numero1;
        op1.num2 = numero2;

        switch (opcion) {
            case 1:
                op1.sumar();
                break;
            case 2:
                op1.restar();
                break;
            case 3:
                op1.multiplicar();
                break;
            case 4:
                op1.dividir();
                break;
            default:
                System.out.println("Opción inválida.");
        }

        // OperacionesArimetricas op2 = new OperacionesArimetricas();
        // op2.num1 = numero1;
        // op2.num2 = numero2;
        // op2.sumar();

        // Programacion Orientada a Objetos - Clase Persona
        Persona personaCliente = new Persona("Juan", 25);
        personaCliente.mostrarInformacion();

        Persona personaEmpleado = new Persona("Maria", 30);
        personaEmpleado.mostrarInformacion();

        sc.close();
    }
}
