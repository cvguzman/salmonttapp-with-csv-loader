package org.cvguzman.ui;

import org.cvguzman.data.GestorDatos;
import org.cvguzman.data.GestorUnidades;
import org.cvguzman.data.RegistroExcel;
import org.cvguzman.model.CentroCultivo;
import org.cvguzman.model.PlantaProceso;
import org.cvguzman.model.Producto;
import org.cvguzman.model.UnidadOperativa;

import java.util.ArrayList;
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

        // Se comienza a visualizar la carga, lectura y extracción desde el Registros.xslx
        System.out.println("::::::REGISTRO EXCEL SALMONTT::::::");

        RegistroExcel registroExcel = new RegistroExcel();
        registroExcel.subirRegistroExcel("Registros.xlsx");
        registroExcel.subirTodos();

        System.out.println(" ");

        // Filtro del archivo excel Registros.xslx
        System.out.println("::::::FILTRO POR AREA PRODUCCION DULCE DEL ARCHIVO EXCEL::::::");

        // Muestra los elementos deseados
        RegistroExcel registro = new RegistroExcel();
        registro.subirRegistroExcel("Registros.xlsx");
        List<Producto> cultivos = registroExcel.traerPorCultivo("dulce");

        // Se crea forEach para recorrer la lista y extraer
        for (Producto c : cultivos) {
            System.out.println(c);
        }

        System.out.println(" ");
        System.out.println("::::::::HERENCIA::::::::");
        System.out.println(" ");


        // Ejecutamos la superclase de UnidadOperativa en las subclases CentroCultivo y PlantaProceso

        GestorUnidades gestor = new GestorUnidades();
        var unidades = gestor.cargarUnidades();

        // Se muestra en consola resultados a través de un for each
        for (UnidadOperativa u : unidades) {
            System.out.println(u);
            System.out.println("------------------------------------------------------------------------------------------------------------------");
        }
    }
}
