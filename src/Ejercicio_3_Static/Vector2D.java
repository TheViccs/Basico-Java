package Ejercicio_3_Static;

public class Vector2D {

    private final String nombre;
    private final double x;
    private final double y;
    private final double modulo;

    public Vector2D(String nombre, double x, double y) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        this.modulo = calcularModulo();
    }

    private double calcularModulo() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static Vector2D calcularSuma(String nombre, Vector2D v1, Vector2D v2) {
        final var x = v1.x + v2.x;
        final var y = v1.y + v2.y;

        return new Vector2D(nombre, x, y);
    }

    public String getNombre() {
        return nombre;
    }

    public double getModulo() {
        return modulo;
    }
}
