package Ejercicios_6;

import java.util.List;

public class ProductosParser {
    public static Productos[] obtenerArrayProductos(List<String> listaInput) {
        final var n = listaInput.size();
        final var arrayProductos = new Productos[n];

        for (var i = 0; i < listaInput.size(); i++) {
            arrayProductos[i] = parsearProductos(listaInput.get(i));

        }


        return arrayProductos;
    }

    private static Productos parsearProductos(String data) {
        final var arrayString = data.split(",");

        final var nombre = arrayString[0];
        final var precio = Double.parseDouble(arrayString[1]);
        final var stock = Integer.parseInt(arrayString[2]);
        final var peso = Double.parseDouble(arrayString[3]);
        final var preciable = Boolean.parseBoolean(arrayString[4]);
        final var volumen = Double.parseDouble(arrayString[5]);

        return new Productos(nombre, precio, stock, peso, preciable, volumen);
    }
}
