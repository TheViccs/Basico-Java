package Polimorfismo.Parser;

import Polimorfismo.Models.Cuadrado;

import java.util.ArrayList;
import java.util.List;

public class Cuadradoparcer {

    public static List<Cuadrado> generarListCuadrado(List<String> listInput) {
        final var listaCuadrado = new ArrayList<Cuadrado>();

        for (var data : listInput) {
            listaCuadrado.add(parsearCuadrado(data));
        }
        return listaCuadrado;
    }

    private static Cuadrado parsearCuadrado(String data) {
        final var arrayString = data.split(",");

        final var lado = Double.parseDouble(arrayString[0]);


        //Primero se tienen que pasar los atributos del padre, en este caso de la clase "Persona"
        return new Cuadrado(lado);

    }
}
