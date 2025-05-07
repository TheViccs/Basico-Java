package Polimorfismo.Models;

public class Triangulo implements IFigura {
    private final double lado1;
    private final double lado2;
    private final double lado3;
    private double perimetro;
    private double area;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        calcularPerimetro();
        calcularArea();
    }

    @Override
    public String toString() {
        final var multi = """
                {
                Lado 1: %.2f
                Lado 2: %.2f
                Lado 3: %.2f
                Perimetro: %.2f
                Area: %.2f
                }  
                """;

        return String.format(
                multi,
                lado1,
                lado2,
                lado3,
                perimetro,
                area
        );
    }

    @Override
    public void calcularArea() {
        perimetro = lado1 + lado2 + lado3;
    }

    @Override
    public void calcularPerimetro() {
        final var s = (lado1 + lado2 + lado3) / 2;
        area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
}
