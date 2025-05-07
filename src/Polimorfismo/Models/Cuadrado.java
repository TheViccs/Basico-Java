package Polimorfismo.Models;

public class Cuadrado implements IFigura {

    private final double lado;
    private double perimetro;
    private double area;

    public Cuadrado(double lado) {
        this.lado = lado;
        calcularPerimetro();
        calcularArea();
    }

    @Override
    public String toString() {
        final var multi = """
                {
                Lado: %.2f
                Perimetro: %.2f
                Area: %.2f
                }  
                """;

        return String.format(
                multi,
                lado,
                perimetro,
                area
        );
    }

    @Override
    public void calcularArea() {
        perimetro = 4 * lado;
    }

    @Override
    public void calcularPerimetro() {
        area = Math.pow(lado, 2);
    }
}
