package org.cvguzman.ui;

// Importación de las clases encargadas de la lógica de datos
import org.cvguzman.data.GestorDatos;
import org.cvguzman.data.GestorUnidades;

// Importación de los modelos del dominio
import org.cvguzman.model.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Clase Main utilizada EXCLUSIVAMENTE para pruebas por consola.
 *
 * Permite:
 * - Leer datos desde archivos
 * - Mostrar información en consola
 * - Probar herencia, polimorfismo e interfaces
 *
 * Esta clase NO forma parte de la interfaz gráfica (Swing).
 */


public class Main {

    /**
     * Punto de entrada de la aplicación en modo consola.
     */

    public static void main(String[] args) {

        // ===============================
        // 1. CARGA DE INVENTARIO DESDE ARCHIVO
        // ===============================

        // Se instanciael gestor encargado de leer archivos de datos
        GestorDatos gestorDatos = new GestorDatos();

        // Se carga el inventario desde el archivo centros.txt
        // El método retorna una lista de objetos Productos
        List<Producto> archivoInventario = gestorDatos.subirInventario("centros.txt");

        // Título consola
        System.out.println("::::::INVENTARIO SALMONTT::::::");

        // Se implementa un for each para recorrer el archivo centros.txt
        for (Producto productos : archivoInventario) {
            System.out.println(productos);
        }

        System.out.println(" ");

        // ===============================
        // 2. FILTRO Y AGRUPACIÓN CON STREAMS
        // ===============================


        System.out.println("::::::FILTRO POR AREA PRODUCCION::::::");

        // Se realiza filtro de área produccion de archivo centros.txt
        // Utilizamos Map para crear un nuevo arreglo con el predicado que correspone, en este caso el area de producción.
        // Aprovechamos el método collect  para dividir nuestro arreglo en tipos de área
        //  y el método ´counting´ para contar cuantas veces se repite cada área.
        Map<String, Long> areasDeProduccion = archivoInventario.stream()
                .collect(Collectors.groupingBy(
                        Producto::getAreaProduccion,
                        Collectors.counting()
                ));

        // Se imrpimen los resultados del filtro
        areasDeProduccion.forEach((area, cantidad) -> System.out.println(area + ": " + cantidad));
        
        System.out.println(" ");
        System.out.println("::::::::HERENCIA::::::::");
        System.out.println(" ");

        System.out.println("A continuación mostramos interfaz Registrable");
        System.out.println(" ");

        // ===============================
        // 3. HERENCIA, INTERFAZ Y POLIMORFISMO
        // ===============================

        // Ejecutamos la superclase de UnidadOperativa en las subclases CentroCultivo y Colaborador
        GestorUnidades gestor = new GestorUnidades();

        // Se  cargan las unidades de una lista polimórfica
        var unidades = gestor.cargarUnidades();

        System.out.println(" ");

        // Se recorre la lista usando la interfaz Registrable, demostrando el polimorfismo
        for (Registrable r : unidades) {

            // Uso de instanceof para identificar el tipo concreto
            if (r instanceof Colaborador) {
                System.out.println("::::COLABORADOR RESPONSABLE::::");
            } else if (r instanceof CentroCultivo) {
                System.out.println("::::CENTRO CULTIVO::::");
            }

            // Se ejecuta el método común definido en la interfaz
            System.out.println(r.mostrarResumen());
        }
    }
}
