package Ejercicio_2;

import Utilities.FileManager;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static List<Videojuego> filtrarListaXbox(List<Videojuego> listaTotal) {
        final var listaXbox = new ArrayList<Videojuego>();

        for (var videojuegos : listaTotal) {
            if (videojuegos.getEmpresa().equals(Videojuego.Empresa.XBOX)) {
                listaXbox.add(videojuegos);
            }
        }
        return listaXbox;
    }


    public static void main(String[] args) {
        //final Videojuego vd1 = new Videojuego("Blue Protocol", 2011, 58.99, 45, Videojuego.Genero.TERROR, Videojuego.Empresa.XBOX);
        // final Videojuego vd2 = new Videojuego("VELHEIM", 2015, 49.99, 15, Videojuego.Genero.ACCION, Videojuego.Empresa.PLAT_STATION);
        // final Videojuego vd3 = new Videojuego("Mario Bros", 1998, 69.99, 5, Videojuego.Genero.COMEDIA, Videojuego.Empresa.NINTENDO);

        // System.out.printf("Videojuego 1: %s%n", vd1);
        // System.out.printf("Videojuego 2: %s%n", vd2);
        // System.out.printf("Videojuego 3: %s%n", vd3);

        final var fileInpit = new File("src/Ejercicio_2/videojuegos.csv");
        final var listainput = FileManager.leerFile(fileInpit);

        final var listaVideojuegos = VideojuegoParcer.crearListaVideoJuego(listainput);
        final var listaXbox = filtrarListaXbox(listaVideojuegos);
        System.out.printf("La lista es: %s%n", listaXbox);

    }
}
