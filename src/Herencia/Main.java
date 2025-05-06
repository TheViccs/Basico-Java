package Herencia;

import Herencia.Parser.AbogadoParser;
import Herencia.Parser.DentistaParser;
import Herencia.Parser.IngenieroParser;
import Utilities.FileManager;
import Utilities.RandomUtilities;

import java.io.File;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        final var listadoInputIng = FileManager.leerFile(new File("src/Herencia/Files/ingenieros.csv"));
        final var listadoInputDentista = FileManager.leerFile(new File("src/Herencia/Files/dentistas.csv"));
        final var listadoInputAbogado = FileManager.leerFile(new File("src/Herencia/Files/abogados.csv"));

        final var listaDentista = DentistaParser.generarListDentista(listadoInputDentista);
        final var listaAbogado = AbogadoParser.generarListAbogados(listadoInputAbogado);
        final var listaIng = IngenieroParser.generarListaIngenieros(listadoInputIng);

        final var random = new Random();
        final var randomIndexDen = RandomUtilities.generarRandomInt(listaDentista.size() - 1, 0, random);
        final var randomIndexAbo = RandomUtilities.generarRandomInt(listaAbogado.size() - 1, 0, random);
        final var randomIndexIng = RandomUtilities.generarRandomInt(listaAbogado.size() - 1, 0, random);

        System.out.printf("Random Dentista: %s%n", listaDentista.get(randomIndexDen));
        System.out.printf("Random Abogado: %s%n", listaAbogado.get(randomIndexAbo));
        System.out.printf("Random Ing: %s%n", listaIng.get(randomIndexIng));
    }


}
