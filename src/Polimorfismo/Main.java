package Polimorfismo;

import Polimorfismo.Parser.Circuloparcer;
import Polimorfismo.Parser.Cuadradoparcer;
import Polimorfismo.Parser.Trianguloparcer;
import Utilities.FileManager;
import Utilities.RandomUtilities;

import java.io.File;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        final var fileCirculo = FileManager.leerFile(new File("src/Polimorfismo/File/circulos.csv"));
        final var fileCuadrado = FileManager.leerFile(new File("src/Polimorfismo/File/cuadrados.csv"));
        final var fileTriangulo = FileManager.leerFile(new File("src/Polimorfismo/File/triangulos.csv"));

        final var listaCir = Circuloparcer.generarListCirculo(fileCirculo);
        final var listaCua = Cuadradoparcer.generarListCuadrado(fileCuadrado);
        final var listaTri = Trianguloparcer.generarListTriangulo(fileTriangulo);

        final var random = new Random();
        final var randomIndexCir = RandomUtilities.generarRandomInt(listaCir.size() - 1, 0, random);
        final var randomIndexCua = RandomUtilities.generarRandomInt(listaCua.size() - 1, 0, random);
        final var randomIndexTri = RandomUtilities.generarRandomInt(listaTri.size() - 1, 0, random);

        System.out.printf("Circulo: %s%n", listaCir.get(randomIndexCir));
        System.out.printf("Cuadrado: %s%n", listaCua.get(randomIndexCua));
        System.out.printf("Triangulo: %s%n", listaTri.get(randomIndexTri));
    }


}
