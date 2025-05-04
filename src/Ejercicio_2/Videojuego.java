package Ejercicio_2;

public class Videojuego {

    private final String nombre;
    private final int epoca;
    private final double precio;
    private final int duracion;
    private final Genero genero;
    private final Empresa empresa;

    public enum Genero {
        TERROR,
        ACCION,
        COMEDIA
    }

    public enum Empresa {
        XBOX,
        NINTENDO,
        PLAT_STATION
    }

    public Videojuego(String nombre, int epoca, double precio, int duracion, Genero genero, Empresa empresa) {
        this.nombre = nombre;
        this.epoca = epoca;
        this.precio = precio;
        this.duracion = duracion;
        this.genero = genero;
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        final var mult =
                """
                        {
                         Nombre: %s
                         Epoca: %d
                         Precio: %.2f
                         Duracion: %d
                         Genero: %s
                         Empresa %s
                        }
                        """;


        return String.format(
                mult,
                nombre,
                epoca,
                precio,
                duracion,
                genero,
                empresa
        );
    }

    public String getNombre() {
        return nombre;
    }

    public Genero getGenero() {
        return genero;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
}
