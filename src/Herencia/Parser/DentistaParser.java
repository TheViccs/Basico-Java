package Herencia.Parser;

import Herencia.Models.Dentista;

import java.util.ArrayList;
import java.util.List;

public class DentistaParser {

    public static List<Dentista> generarListDentista(List<String> listInput) {
        final var listaDentista = new ArrayList<Dentista>();

        for (var data : listInput) {
            listaDentista.add(parsearDentista(data));
        }
        return listaDentista;
    }

    private static Dentista parsearDentista(String data) {
        final var arrayString = data.split(",");

        final var nombre = arrayString[0];
        final var apellido = arrayString[1];
        final var edad = Integer.parseInt(arrayString[2]);
        final var casado = Boolean.parseBoolean(arrayString[3]);
        final var controlDental = arrayString[4];
        final var pacientesFelices = Integer.parseInt(arrayString[5]);
        final var pacientesTotales = Integer.parseInt(arrayString[6]);

        //Primero se tienen que pasar los atributos del padre, en este caso de la clase "Persona"
        return new Dentista(nombre, apellido, edad, casado, controlDental, pacientesFelices, pacientesTotales);

    }
}
