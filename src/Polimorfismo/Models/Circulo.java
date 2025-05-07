package Polimorfismo.Models;

public class Circulo implements IFigura {
    private final double radio;
    private double perimetro;
    private double area;

    public Circulo(double radio) {
        this.radio = radio;
        calcularPerimetro();
        calcularArea();
    }

    @Override
    public String toString() {
        final var multi = """
                {
                Radio: %.2f
                Perimetro: %.2f
                Area: %.2f
                }  
                """;

        return String.format(
                multi,
                radio,
                perimetro,
                area
        );
    }

    @Override
    public void calcularArea() {
        perimetro = 2 * Math.PI * radio;
    }

    @Override
    public void calcularPerimetro() {
        area = Math.PI * Math.pow(radio, 2);
    }
}
