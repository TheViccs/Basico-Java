package Herencia.Models;

public abstract class Persona {

    protected final String nombre;
    protected final String apellido;
    protected final int edad;
    protected final boolean casado;
    protected double porcentajeExito;

    public Persona(String nombre, String apellido, int edad, boolean casado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.casado = casado;
    }

    //Metodo abstracto
    public abstract void calcularProcentajeExito();
}
