package Polimorfismo.Parser;

import Polimorfismo.Models.Circulo;

import java.util.ArrayList;
import java.util.List;

public class Circuloparcer {

    public static List<Circulo> generarListCirculo(List<String> listInput) {
        final var listaCirculo = new ArrayList<Circulo>();

        for (var data : listInput) {
            listaCirculo.add(parsearCirculo(data));
        }
        return listaCirculo;
    }

    private static Circulo parsearCirculo(String data) {
        final var arrayString = data.split(",");

        final var radio = Double.parseDouble(arrayString[0]);


        //Primero se tienen que pasar los atributos del padre, en este caso de la clase "Persona"
        return new Circulo(radio);

    }

}
