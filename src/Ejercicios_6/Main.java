package Ejercicios_6;

import Utilities.FileManager;

import java.io.File;
import java.util.Arrays;

public class Main {

    public static void ordernarArray(Productos[] array) {
        for (var i = 0; i < array.length; i++) {
            for (var j = 0; j < array.length - i - 1; j++) {
                if (array[j].getPrecio() > array[j + 1].getPrecio()) {
                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        final var fileInput = new File("src/Ejercicios_6/productos.csv");
        final var listInput = FileManager.leerFile(fileInput);
        final var arrayProcds = ProductosParser.obtenerArrayProductos(listInput);
        ordernarArray(arrayProcds);
        System.out.printf("Array ordenado: %s%n", Arrays.toString(arrayProcds));

    }

}
