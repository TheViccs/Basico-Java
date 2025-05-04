package Ejercicio_4_Null;

public class Trabajador {

    private final String nombre;
    private final String apellido;
    private final int edad;
    private final String conyugue;
    private final estadoCivil estadoCivil;

    public enum estadoCivil {
        SOLTERO,
        CASADO
    }

    public Trabajador(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.conyugue = null;
        estadoCivil = obtenerestadoCivil();
    }

    public Trabajador(String nombre, String apellido, int edad, String conyugue) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.conyugue = conyugue;
        estadoCivil = obtenerestadoCivil();
    }

    private estadoCivil obtenerestadoCivil() {
        if (conyugue == null) {
            return estadoCivil.SOLTERO;
        } else {
            return estadoCivil.CASADO;
        }

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Trabajador.estadoCivil getEstadoCivil() {
        return estadoCivil;
    }
}
