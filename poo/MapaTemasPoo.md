package poo;
import java.util.HashMap;

import ejercicio3.Persona;

// 1: Clase y Objetos
public class MapaTemasPoo {
    // 2: Encapsulamiento
    private HashMap<String, String> temas; // Mapa para almacenar los temas

    // 3: Constructores, this y sobrecarga
    public MapaTemasPoo() {
        temas = new HashMap<>();
    }

    // Métodos
    public void agregarTema(String clave, String tema) {
        temas.put(clave, tema);
    }

    public String obtenerTema(String clave) {
        return temas.get(clave);
    }

    public void eliminarTema(String clave) {
        temas.remove(clave);
    }

    // Getters y Setters
    public HashMap<String, String> getTemas() {
        return temas;
    }

    public void setTemas(HashMap<String, String> temas) {
        this.temas = temas;
    }

    // 4: Herencia y super
    public static class MapaTemasAvanzado extends MapaTemasPoo {
        public MapaTemasAvanzado() {
            super();
        }

        public void agregarTemaAvanzado(String clave, String tema) {
            super.agregarTema(clave, tema);
        }
    }

    // 5: Polimorfismo: Sobrescritura de métodos
    @Override
    public void agregarTema(String clave, String tema) {
        super.agregarTema(clave, tema);
    }

    // 6: Abstracción: Clase abstracta e interfaz
    public interface Tema {
        String getNombre();
    }

    public abstract class TemaAbstracto implements Tema {
        protected String nombre;

        public TemaAbstracto(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public String getNombre() {
            return nombre;
        }
    }
    // 7: static y final
    public static class TemaEstatico extends TemaAbstracto {
        public TemaEstatico(String nombre) {
            super(nombre);
        }
    }

    public static final class TemaFinal extends TemaAbstracto {
        public TemaFinal(String nombre) {
            super(nombre);
        }
    }

    // 8: Paquetes y Organización del Código
    // (Este Archivo está en el paquete poo)

    // 9: toString, equals y hashCode
    @Override
    public String toString() {
        return "MapaTemasPoo{" +
                "temas=" + temas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MapaTemasPoo)) return false;
        MapaTemasPoo that = (MapaTemasPoo) o;
        return temas.equals(that.temas);
    }

    @Override
    public int hashCode() {
        return temas.hashCode();
    }

    // 10: Composición vs Herencia
    // En este caso, estamos utilizando composición al tener un HashMap dentro de la clase
    // En lugar de heredar de una clase base, estamos incluyendo un objeto de otra clase
    class Motor {}
class Auto {
    private Motor motor; // composición: un Auto tiene un Motor
}

public class MapaTemasPoo {
    public static void main(String[] args) {
        Persona p = new Persona("Ana");
        Estudiante e = new Estudiante("Luis", 123);

        System.out.println(p);
        System.out.println(e);

        Circulo c = new Circulo(2.0);
        c.dibujar();
        c.imprimir();
        System.out.println("Área del círculo: " + c.area());

        System.out.println("Siguiente ID: " + Utilidades.siguienteId());
    }
}