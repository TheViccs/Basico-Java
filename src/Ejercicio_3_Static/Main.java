package Ejercicio_3_Static;

public class Main {
    public static void main(String[] args) {
        final var v1 = new Vector2D("Saturno", 35.13, 94.44);
        final var v2 = new Vector2D("Marte", 83.63, 58.60);

        final var vSuma = Vector2D.calcularSuma("Tierra", v1, v2);

        System.out.printf("Nombre: %s, Modulo: %.2f%n", v1.getNombre(), v1.getModulo());
        System.out.printf("Nombre: %s, Modulo: %.2f%n", v2.getNombre(), v2.getModulo());
        System.out.printf("Nombre: %s, Modulo: %.2f%n", vSuma.getNombre(), vSuma.getModulo());


    }
}
