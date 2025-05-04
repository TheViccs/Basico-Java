package Ejercicio_5;

public class Main {
    public static void main(String[] args) {
        final var colorRojo = new Color("ROJO", "#E74C3C");
        final var colorAzul = new Color("AZUL", "#3498DB");
        final var colorAmarillo = new Color("AMARILLO", "#F7DC6F");

        final var p1 = new Persona("OMAR", "VARGAS", 44, 95.123, true, colorAzul, Persona.Profesion.INGENIERO);
        final var p2 = new Persona("SELENA", "RODRIGUEZ", 52, 50.752, true, colorRojo, Persona.Profesion.DENTISTA);
        final var p3 = new Persona("EMELINA", "GUTIERREZ", 18, 45.879, false, colorAmarillo, Persona.Profesion.ABOGADO);

        System.out.printf("Persona 1: %s%n", p1);
        System.out.printf("Persona 2: %s%n", p2);
        System.out.printf("Persona 3: %s%n", p3);
    }
}
