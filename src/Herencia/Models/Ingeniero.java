package Herencia.Models;

public class Ingeniero extends Persona {
    private final String contructora;
    private final int edificiosConstruidos;
    private final int edificiosPlanificados;

    public Ingeniero(String nombre, String apellido, int edad, boolean casado, String contructora, int edificiosConstruidos, int edificiosPlanificados) {
        super(nombre, apellido, edad, casado);
        this.contructora = contructora;
        this.edificiosConstruidos = edificiosConstruidos;
        this.edificiosPlanificados = edificiosPlanificados;
        calcularProcentajeExito();

    }

    @Override
    public String toString() {
        final var multilinea = """
                {
                nombre: %s
                appelido: %s
                edad: %d
                casado: %b
                contructora: %s
                edificios construidos: %d
                edificios planificados: %d
                Porcentaje de exito: %.2f
                }
                """;
        return String.format(
                multilinea,
                nombre,
                apellido,
                edad,
                casado,
                contructora,
                edificiosConstruidos,
                edificiosPlanificados,
                porcentajeExito
        );
    }

    @Override
    public void calcularProcentajeExito() {
        porcentajeExito = ((double) edificiosConstruidos / edificiosPlanificados) * 100.0;

    }
}
