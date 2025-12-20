package org.cvguzman.data;

import org.cvguzman.model.Producto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


// Clase encargada de la lectura de archivos externos y de la carga de datos al modelo producto
public class GestorDatos {

    // Método que lee un archivo de texto y lo transforma en una lista de productos
    public List<Producto> subirInventario(String listado) {

        // Lista donde se almacenarán los productos leídos desde el archivo
        List<Producto> lista = new ArrayList<>();

        // Se obtiene el ClassLoader para acceder a archivos dentro del proyecto
        ClassLoader archivo = getClass().getClassLoader();
        try {

            // Se abre el archivo como flujo de entrada
            InputStream lecturaDatos = archivo.getResourceAsStream(listado);

            // Validación: si el archivo no existe, se retorna una lista vacía
            if (lecturaDatos == null) {
                System.out.println("No se encontró el archivo: " + listado);
                return lista;
            }

            try {

                // BufferedReader permite leer el archivo línea por línea
                BufferedReader br = new BufferedReader(new InputStreamReader(lecturaDatos));
                String linea;
                int numeroLinea = 0;

                // Se recorre el archivo hasta el final
                while ((linea = br.readLine()) != null) {
                    numeroLinea++;

                    // Se ignoran líneas vacías
                    if (linea.trim().isEmpty()) continue;

                    // Se separan los datos usando ';' como delimitador
                    String[] seccion = linea.split(";");

                    // Validación: cada línea debe tener exactamente 3 campos
                    if (seccion.length != 3) {
                        System.out.println("Línea " + numeroLinea + " es incorrecta");
                        continue;
                    }

                    // Se asignan los valores a variables
                    String nombreProducto = seccion[0].trim();
                    String areaProduccion = seccion[1].trim();
                    String cantidadToneladaString = seccion[2].trim();
                    try {

                        // Conversión del valor String a int
                        int cantidadTonelada = Integer.parseInt(cantidadToneladaString);

                        // Se crea el objeto Producto y se agrega a la lista
                        Producto producto = new Producto(
                                nombreProducto,
                                areaProduccion,
                                cantidadTonelada
                        );
                        lista.add(producto);

                    } catch (Exception e) {

                        // Manejo de error si la conversión numérica falla
                        System.err.println("Error en la línea "
                                + numeroLinea
                                +
                                ": cantidad no válida"
                        );
                    }
                }
            } catch (IOException e) {

                // Manejo de errores de lectura del archivo
                System.err.println("Error al leer el archivo");
            } finally {

                // Este bloque siempre se ejecuta
                System.out.println("Archivo cargado");
            }

            // Se retorna la lista con los productos cargados
            return lista;
        } finally {
        }
    }
}