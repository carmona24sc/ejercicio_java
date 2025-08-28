package poo;
import java.util.Scanner;

//  1: Clases y Objetos
//  Ejemplo de uso de clases y objetos en Java
//  En este ejemplo, crearemos una clase simple llamada Libros
//  La clase Libros tendrá atributos como título y autor, y métodos para mostrar la información del libro
// Clase: Libros
// Objeto: libro1

class Libros {
    private String titulo;
    private String autor;

    public Libros(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
}

// Clase Principal Con El Metodo Main
public class Main {
    public static void main(String[] args) {
        Libros libro1 = new Libros("El Quijote", "Miguel de Cervantes");
        libro1.mostrarInfo();
    }
}

// 2: Encapsulamiento
// En este ejemplo, los atributos de la clase Libros son privados
// y solo se pueden acceder a través de métodos públicos
// Ejemplo de uso de la clase Libros




private class Libros {
    private String titulo; // Título del libro
    private String autor; // Autor del libro

    // 3: Constructor, this y sobrecarga
    public Libros(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }

    // (getters y setters)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Sobrecarga de métodos
    public void mostrarInfo(boolean detalle) {
        if (detalle) {
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
        } else {
            System.out.println("Título: " + titulo);
        }
    }
}

// 4: Herencia y Super
// En este ejemplo, crearemos una clase llamada LibrosDigitales que hereda de la clase Libros
// La clase LibrosDigitales tendrá un atributo adicional llamado formato y un método para mostrar la información del libro digital
class LibrosDigitales extends Libros {
    private String formato;

    public LibrosDigitales(String titulo, String autor, String formato) {
        super(titulo, autor);
        this.formato = formato;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Formato: " + formato);
    }
}

// 5: Polimorfismo: Sobrescritura de métodos
// En este ejemplo, la clase LibrosDigitales sobrescribe el método mostrarInfo
// Esto permite que los objetos de la clase LibrosDigitales tengan un comportamiento específico al mostrar su información
// Ejemplo de uso del polimorfismo

Libros libro = new Libros("El Quijote", "Miguel de Cervantes");
LibrosDigitales libroDigital = new LibrosDigitales("Cien años de soledad", "Gabriel García Márquez", "PDF");

libro.mostrarInfo();
libroDigital.mostrarInfo();

// 6: Abstracción: Clase abstracta e interfaz
// En este ejemplo, crearemos una clase abstracta llamada Publicacion
// y una interfaz llamada Descargable
abstract class Publicacion {
    private String titulo;
    private String autor;

    public Publicacion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public abstract void mostrarInfo();
}

interface Descargable {
    void descargar();
// 6: Abstracción: Clase abstracta e interfaz
abstract class Publicacion {
    private String titulo;
    private String autor;

    public Publicacion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public abstract void mostrarInfo();
}

interface Descargable {
    void descargar();
}

// 7: static y final
// En este ejemplo, crearemos una clase llamada Configuracion
// que tendrá un atributo estático y un atributo final
class Configuracion {
    private static String url = "http://miapi.com";
    private final String clave;

    public Configuracion(String clave) {
        this.clave = clave;
    }

    public static String getUrl() {
        return url;
    }

    public String getClave() {
        return clave;
    }
}

// 8: Paquetes y Organización del Código
// (En este ejemplo, la clase Libros y la clase Main están en el paquete poo)

// 9: toString, equals y hashCode
// En este ejemplo, sobreescribiremos los métodos toString, equals y hashCode en la clase Libros
class Libros {
    private String titulo;
    private String autor;

    public Libros(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Libros)) return false;
        Libros libro = (Libros) obj;
        return titulo.equals(libro.titulo) && autor.equals(libro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor);
    }
}

// 10: Composición vs Herencia
// En este ejemplo, mostraremos la diferencia entre composición y herencia

class Biblioteca {
    private List<Libros> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libros libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {
        for (Libros libro : libros) {
            System.out.println(libro);
        }
    }
// En este caso, estamos utilizando composición para representar la relación entre la biblioteca y los libros
// La clase Biblioteca tiene una lista de objetos de la clase Libros, lo que permite gestionar múltiples libros
// En lugar de heredar de la clase Libros, la clase Biblioteca "tiene un" Libros, lo que es un ejemplo de composición
public class InnerMain {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(new Libros("El Quijote", "Miguel de Cervantes"));
        biblioteca.agregarLibro(new Libros("Cien años de soledad", "Gabriel García Márquez"));
        biblioteca.mostrarLibros();
    }
}
