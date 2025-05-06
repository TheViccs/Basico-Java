package Herencia.Parser;

import Herencia.Models.Ingeniero;

import java.util.ArrayList;
import java.util.List;

public class IngenieroParser {

    public static List<Ingeniero> generarListaIngenieros(List<String> listInput) {
        final var listaIngenieros = new ArrayList<Ingeniero>();

        for (var data : listInput) {
            listaIngenieros.add(parsearIngeniero(data));
        }

        return listaIngenieros;
    }

    private static Ingeniero parsearIngeniero(String data) {
        final var arrayString = data.split(",");

        final var nombre = arrayString[0];
        final var apellido = arrayString[1];
        final var edad = Integer.parseInt(arrayString[2]);
        final var casado = Boolean.parseBoolean(arrayString[3]);
        final var constructira = arrayString[4];
        final var edificiosContruidos = Integer.parseInt(arrayString[5]);
        final var edificiosPlanificados = Integer.parseInt(arrayString[6]);

        return new Ingeniero(nombre, apellido, edad, casado, constructira, edificiosContruidos, edificiosPlanificados);

    }
}
