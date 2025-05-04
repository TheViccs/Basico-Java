package Ejercicio_4_Null;

public class Main {


    public static void main(String[] args) {
        Trabajador t1 = new Trabajador("ROSA", "PALACIOS", 25); // Se esa el contructor que no tiene conyugue
        Trabajador t2 = new Trabajador("CARLOS", "FREITAS", 52, "BULMA CHAVEZ"); // Se esa el contructor que tiene conyugue

        System.out.printf("Nombre: %s %s, Estado Civil: %s%n", t1.getNombre(), t1.getApellido(), t1.getEstadoCivil());
        System.out.printf("Nombre: %s %s, Estado Civil: %s%n", t2.getNombre(), t2.getApellido(), t2.getEstadoCivil());
    }
}
