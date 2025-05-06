package Herencia.Models;

public class Abogado extends Persona {
    private final String notaria;
    private final int juiciosGanados;
    private final int juiciosAsistidos;


    public Abogado(String nombre, String apellido, int edad, boolean casado, String notaria, int juiciosGanados, int juiciosAsistidos) {
        super(nombre, apellido, edad, casado);
        this.notaria = notaria;
        this.juiciosGanados = juiciosGanados;
        this.juiciosAsistidos = juiciosAsistidos;
        calcularProcentajeExito();
    }

    @Override
    public String toString() {
        final var multilinea = """
                {
                Nombre: %s
                Appelido %s
                Edad %d
                Casado %b
                Notaria %s
                Juicios ganados: %d
                Juicios Asistidos: %d
                Porcentaje de exito: %.2f
                }
                """;
        return String.format(
                multilinea,
                nombre,
                apellido,
                edad,
                casado,
                notaria,
                juiciosGanados,
                juiciosAsistidos,
                porcentajeExito

        );
    }

    @Override
    public void calcularProcentajeExito() {
        porcentajeExito = ((double) juiciosGanados / juiciosAsistidos) * 100.0;
    }
}
