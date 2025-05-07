package Polimorfismo.Parser;

import Polimorfismo.Models.Triangulo;

import java.util.ArrayList;
import java.util.List;

public class Trianguloparcer {
    public static List<Triangulo> generarListTriangulo(List<String> listInput) {
        final var listaTriangulo = new ArrayList<Triangulo>();

        for (var data : listInput) {
            listaTriangulo.add(parsearTriangulo(data));
        }
        return listaTriangulo;
    }

    private static Triangulo parsearTriangulo(String data) {
        final var arrayString = data.split(",");

        final var lado1 = Double.parseDouble(arrayString[0]);
        final var lado2 = Double.parseDouble(arrayString[1]);
        final var lado3 = Double.parseDouble(arrayString[2]);


        //Primero se tienen que pasar los atributos del padre, en este caso de la clase "Persona"
        return new Triangulo(lado1, lado2, lado3);

    }
}
