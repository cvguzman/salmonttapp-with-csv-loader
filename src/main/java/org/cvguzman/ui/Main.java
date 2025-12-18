package org.cvguzman.ui;

import org.cvguzman.data.GestorDatos;
import org.cvguzman.data.GestorUnidades;
import org.cvguzman.model.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Muestra los elementos del archivo centros.txt
        GestorDatos gestorDatos = new GestorDatos();
        List<Producto> archivoInventario = gestorDatos.subirInventario("centros.txt");

        System.out.println("::::::INVENTARIO SALMONTT::::::");

        // Se implementa un for each para recorrer el archivo centros.txt
        for (Producto productos : archivoInventario) {
            System.out.println(productos);
        }

        System.out.println(" ");

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
        areasDeProduccion.forEach((area, cantidad) -> System.out.println(area + ": " + cantidad));
        
        System.out.println(" ");
        System.out.println("::::::::HERENCIA::::::::");
        System.out.println(" ");

        System.out.println("A continuación mostramos interfaz Registrable");
        System.out.println(" ");

        // Ejecutamos la superclase de UnidadOperativa en las subclases CentroCultivo y PlantaProceso
        GestorUnidades gestor = new GestorUnidades();
        var unidades = gestor.cargarUnidades();

        System.out.println(" ");

        // Se muestra en consola resultados a través de un for each
        for (Registrable r : unidades) {
            if (r instanceof Colaborador) {
                System.out.println("::::COLABORADOR RESPONSABLE::::");
            } else if (r instanceof CentroCultivo) {
                System.out.println("::::CENTRO CULTIVO::::");
            }
            System.out.println(r.mostrarResumen());
        }
    }
}
