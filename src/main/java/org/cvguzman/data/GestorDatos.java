package org.cvguzman.data;

import org.cvguzman.model.Producto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GestorDatos {

    public List<Producto> subirInventario(String listado) {

        List<Producto> lista = new ArrayList<>();

        // Indicamos la ruta para buscar el archivo y cargarlo
        ClassLoader archivo = getClass().getClassLoader();
        try {
            // Se crea flujo de entrada de datos
            InputStream lecturaDatos = archivo.getResourceAsStream(listado);
            if (lecturaDatos == null) {
                System.out.println("No se encontró el archivo: " + listado);
                return lista;
            }

            try {
                // Utilización del BufferedReader para permitir lectura de líneas completas
                BufferedReader br = new BufferedReader(new InputStreamReader(lecturaDatos));
                String linea;
                int numeroLinea = 0;

                while ((linea = br.readLine()) != null) {
                    numeroLinea++;
                    if (linea.trim().isEmpty()) continue;

                    // Se realiza la separación del ; con ayuda del split()
                    String[] seccion = linea.split(";");
                    if (seccion.length != 3) {
                        System.out.println("Línea " + numeroLinea + " es incorrecta");
                        continue;
                    }

                    String nombreProducto = seccion[0].trim();
                    String areaProduccion = seccion[1].trim();
                    String cantidadToneladaString = seccion[2].trim();
                    try {
                        // Se transforma el tipo de dato int a string con el Integer.parseInt()
                        int cantidadTonelada = Integer.parseInt(cantidadToneladaString);
                        Producto producto = new Producto(nombreProducto, areaProduccion, cantidadTonelada);
                        lista.add(producto);

                        // Se maneja el error con exception
                    } catch (Exception e) {
                        System.err.println("Se detectó un error en el programa");
                    }

                }
            } catch (NullPointerException | IOException e) {
                System.err.println("Se detectó un error en el programa");
            }
            return lista;
        } finally {
            System.out.println("Archivo cargado");
        }
    }
}
