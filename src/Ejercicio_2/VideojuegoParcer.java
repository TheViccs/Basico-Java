package Ejercicio_2;

import java.util.ArrayList;
import java.util.List;

public class VideojuegoParcer {

    public static List<Videojuego> crearListaVideoJuego(List<String> listaInput) {
        final var listaVideoJuego = new ArrayList<Videojuego>();

        for (var element : listaInput) {
            listaVideoJuego.add(parserVideoJuego(element));
        }
        return listaVideoJuego;
    }

    private static Videojuego parserVideoJuego(String data) {
        final var arrayString = data.split(",");

        final var nombre = arrayString[0];
        final var epoca = Integer.parseInt(arrayString[1]);
        final var precio = Double.parseDouble(arrayString[2]);
        final var duracion = Integer.parseInt(arrayString[3]);
        final var genero = Videojuego.Genero.valueOf(arrayString[4]);
        final var empresa = Videojuego.Empresa.valueOf(arrayString[5]);


        return new Videojuego(nombre, epoca, precio, duracion, genero, empresa);
    }
}
