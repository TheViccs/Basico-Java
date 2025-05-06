package Herencia.Models;

public class Dentista extends Persona {
    private final String controlDental;
    private final int pacientesFelices;
    private final int pacientesTotales;

    public Dentista(String nombre, String apellido, int edad, boolean casado, String controlDental, int pacientesFelices, int pacientesTotales) {
        super(nombre, apellido, edad, casado);
        this.controlDental = controlDental;
        this.pacientesFelices = pacientesFelices;
        this.pacientesTotales = pacientesTotales;
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
                controlDental %s
                Pacientes Felices: %d
                Pacientes Totales: %d
                Porcentaje de exito: %.2f
                }
                """;
        return String.format(
                multilinea,
                nombre,
                apellido,
                edad,
                casado,
                controlDental,
                pacientesFelices,
                pacientesTotales,
                porcentajeExito
        );
    }

    @Override
    public void calcularProcentajeExito() {
        porcentajeExito = ((double) pacientesFelices / pacientesTotales) * 100.0;

    }
}
