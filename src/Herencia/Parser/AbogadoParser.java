package Herencia.Parser;

import Herencia.Models.Abogado;

import java.util.ArrayList;
import java.util.List;

public class AbogadoParser {

    public static List<Abogado> generarListAbogados(List<String> listInput) {
        final var listaAbogado = new ArrayList<Abogado>();

        for (var data : listInput) {
            listaAbogado.add(parsearAbogado(data));
        }
        return listaAbogado;
    }

    private static Abogado parsearAbogado(String data) {
        final var arrayString = data.split(",");

        final var nombre = arrayString[0];
        final var apellido = arrayString[1];
        final var edad = Integer.parseInt(arrayString[2]);
        final var casado = Boolean.parseBoolean(arrayString[3]);
        final var notaria = arrayString[4];
        final var juiciosGanados = Integer.parseInt(arrayString[5]);
        final var juiciosAsistidos = Integer.parseInt(arrayString[6]);

        //Primero se tienen que pasar los atributos del padre, en este caso de la clase "Persona"
        return new Abogado(nombre, apellido, edad, casado, notaria, juiciosGanados, juiciosAsistidos);

    }

}
