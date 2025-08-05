public class Main {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo!");
             int zapatos = 350000;
        int tenis = 280000;
        int camisetas = 175000;
        int jeans = 200000;

        // Mostrar artículos y precios
        System.out.println("Almacen WC");
        System.out.println("Precio de los Zapatos: $" + zapatos);
        System.out.println("Precio de los Tenis: $" + tenis);
        System.out.println("Precio de las Camisetas: $" + camisetas);
        System.out.println("Precio de los Jeans: $" + jeans);

        // Calcular total y promedio
        int total = zapatos + tenis + camisetas + jeans;
        double promedio = total / 4.0;

        System.out.println("\nTotal: $" + total);
        System.out.println("Promedio de Precios: $" + promedio);

        // Aumentar jeans 6.2%
        double nuevoJeans = jeans + (jeans * 0.062);
        // Disminuir zapatos 0.8%
        double nuevoZapatos = zapatos - (zapatos * 0.008);

        System.out.println("Nuevo Precio Jeans: $" + Math.round(nuevoJeans));
        System.out.println("Nuevo Precio Zapatos: $" + Math.round(nuevoZapatos));
    }


}
