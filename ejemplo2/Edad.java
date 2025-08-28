package ejemplo2;
import java.io.Console;
import java.util.Scanner; 
import java.time.LocalDate; 
import java.util.ArrayList;
import java.util.List;


public class edad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        // int age = scanner.nextInt();
        // scanner.nextInt();
        // int age_parameter = 18;

        // boolean tieneBoleta = true;

        // if (!(age < age_parameter || !tieneBoleta)) {
        //     System.out.println("Puedes entrar.");
        // } else {
        //     System.out.println("No puedes entrar.");
        // }

// if (age >= 18 && tieneBoleta) {
//     System.out.println("Puedes entrar.");
// } else if (age >= 18 && !tieneBoleta) {
//     System.out.println("No puedes entrar.");
// } else if (age < 18 && !tieneBoleta) {
//     System.out.println("No puedes entrar.");
// }

// // mensaje de edad con operador ternario
// String mensaje = (age >= 18) ? "Eres mayor de edad." : "Eres menor de edad.";
// System.out.println(mensaje);

// mensaje = (age >= 18 && tieneBoleta) ? "Eres mayor de edad y tienes boleta." : "No cumples con los requisitos.";
// System.out.println(mensaje);

// int edad = 19;
// boolean tieneBoleta2 = true;
// java.time.LocalDate fechaevento = java.time.LocalDate.parse("2025-08-14");
// String mensaje = "";
// if (edad >=18) {
//     if (tieneBoleta2) {
//         if (fechaevento.isAfter(java.time.LocalDate.now())) {
//             mensaje = "Puedes entrar al evento.";
//         } else {
//             mensaje = "No puedes entrar al evento, la fecha ya pasó.";
            
//         }
//         mensaje = "Puedes entrar al evento.";
//     } else {
//         mensaje = "No puedes entrar al evento, no tienes boleta.";
//     }
// } else {
//     mensaje = "No puedes entrar al evento, eres menor de edad.";
// }

// System.out.println(mensaje);

// switch
// int opcion = 2;
// switch (opcion) {
//     case 1:
//         System.out.println("Lunes");
//         break;
//     case 2:
//         System.out.println("Martes");
//         break;
//     default:
//         System.out.println("Miércoles");
//         break;
// }

// // desde java 14+; Se puede usar una version mejorada del switch expresions
// String resultado = switch (opcion) {
//     case 1 -> "Lunes";
//     case 2 -> "Martes";
//     default -> "Miércoles";
// };
// System.out.println(resultado);

// ejemplos de estructura repetitiva for
// for (int i = 0; i < 5; i++) {
//     System.out.println("Iteración " + i);
// }
//ejemplo de estructura relativa for (con break): detiene la ejecucion del ciclo, pero no del programa es importante tener en cuenta que el break solo detien el ciclo mas cercano. Y se usa en casos como cuando se cumple una condicion y no se desea continuar con el ciclo. Un caso real es cuando se busca un elemento en un array


// int[] numeros = {1, 2, 3, 4, 5};
// int numeroBuscado = 3;
// boolean encontrado = false;
// for (int i = 0; i < numeros.length; i++) {
//     if (numeros[i] == numeroBuscado) {
//         encontrado = true;
//         break; // Detiene el ciclo si se encuentra el número
//     }
// }
// if (!encontrado) {
//     System.out.println("Número no encontrado.");
// } else {
//     System.out.println("Número encontrado.");
// }

//sintaxis
// for (int i = 0; i < 5; i++) {
//     if (i == 3) {
//        continue;
//     }
//             System.out.println("Iteración " + i);
//         }

// int[] numeros = {1, 2, 3, 4, 5};
// int numeroOmitido = 3;

// for (int i = 0; i < numeros.length; i++) {
//     if (numeros[i] == numeroOmitido) {
//         continue; // Omitir el número 3
//     }
//     System.out.println("Número: " + numeros[i]);
// }

// String[] comportamientos = {"Diciplinado", "Serio", "Indisciplinado", "Amable", "Juicioso"};
// String comportamiento = "Indisciplinado";

// for (int i = 0; i < comportamientos.length; i++) {
//     if (comportamientos[i].equals(comportamiento)) {
//         System.out.println("Comportamiento encontrado: " + comportamientos[i]);
//         break; // Detiene el ciclo si se encuentra el comportamiento
//     }
// }

// while con break y continue.
// break
// int i = 0;

// while (true) // Ciclo infinito controlado con break
// {
//     Console.WriteLine($"Número: {i}");
//     i++;

//     if (i > 5) // Cuando i sea mayor que 5, salimos del bucle
//     {
//         Console.WriteLine("Salgo del bucle con break");
//         break;
//     }
// }

// continue
// int j = 0;

// while (j < 10)
// {
//     j++;

//     if (j % 2 == 0) // Si es par, no hacemos nada más en esta vuelta
//     {
//         continue; // Salta al siguiente ciclo
//     }

//     Console.WriteLine($"Número impar: {j}");
}

// do while con break y continue.
// do while break
// int k = 0;
// do
// {
//     Console.WriteLine($"Número: {k}");
//     k++;

//     if (k > 5) // Cuando k sea mayor que 5, salimos del bucle
//     {
//         Console.WriteLine("Salgo del bucle con break");
//         break;
//     }
// } while (true);

// do while continue
// int l = 0;
// do
// {
//     l++;

//     if (l % 2 == 0) // Si es par, no hacemos nada más en esta vuelta
//     {
//         continue; // Salta al siguiente ciclo
//     }

//     Console.WriteLine($"Número impar: {l}");
// } while (l < 10);


// sintexis 


// ejemplo ArrayList

// ArrayList<String> lista = new ArrayList<>();
// lista.add("Elemento 1");
// lista.add("Elemento 2");
// lista.add("Elemento 3");

// ejemplo lista
// List<String> lista = new ArrayList<>();
// lista.add("Elemento 1");
// lista.add("Elemento 2");
// lista.add("Elemento 3");

// foreach clasico
// for (int i = 0; i < lista.size(); i++) {
//     System.out.println("Elemento: " + lista.get(i));
// }

// alternativa con forEach (java 8+) usando una lamda
// lista.forEach(elemento -> {
//     System.out.println("Elemento: " + elemento);
// });




scanner.close();
    }
    

