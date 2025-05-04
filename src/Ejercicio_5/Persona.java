package Ejercicio_5;

public class Persona {

    private final String nombre, apellido;
    private final int edad;
    private final double peso;
    private final boolean casado;
    private final Color color;
    private final Profesion profesion;

    public Persona(String nombre, String apellido, int edad, double peso, boolean casado, Color color, Profesion profesion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.casado = casado;
        this.color = color;
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        final var multi = """
                {
                Nombre: %s
                Apellido %s
                Edad: %d
                Peso: %.2f
                Casado: %b
                Color: %s
                Profesion: %s
                }
                """;

        return String.format(
                multi,
                nombre,
                apellido,
                edad,
                peso,
                casado,
                color,
                profesion
        );
    }

    public enum Profesion {
        INGENIERO,
        DENTISTA,
        ABOGADO
    }
}
