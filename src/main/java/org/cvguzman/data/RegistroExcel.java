package org.cvguzman.data;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.cvguzman.model.Producto;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class RegistroExcel {

    private List<Producto> lista = new ArrayList<>();
    private Producto Producto;

    public void subirRegistroExcel(String ruta) {
        try (FileInputStream fileInputStream = new FileInputStream(ruta)) {
            XSSFWorkbook libro = new XSSFWorkbook(fileInputStream);
            XSSFSheet hoja = libro.getSheetAt(0);

            for (int i = 1; i <= hoja.getLastRowNum(); i++) {
                var fila = hoja.getRow(i);

                String nombreProducto = fila.getCell(0).getStringCellValue();
                String areaProduccion = fila.getCell(1).getStringCellValue();
                int cantidadTonelada = (int) fila.getCell(2).getNumericCellValue();
                Producto registro = new Producto(nombreProducto, areaProduccion, cantidadTonelada);
                agregar(registro);
            }
            libro.close();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("Archivo Excel subido correctamente");
        }
    }
    
    public void agregar(Producto registros) {
        lista.add(registros);
    }

    public void subirTodos() {
        for (Producto registros : lista) {
            System.out.println(registros);
        }
    }

public List<Producto> traerProducto(String producto) {
        List<Producto> traer = new ArrayList<>();
        for (Producto registros : lista) {
            if(registros.getNombreProducto().equalsIgnoreCase(producto)) {
                traer.add(registros);
            }
        }
        return traer;
    }

    public List<Producto> traerPorCultivo(String cultivo) {
        List<Producto> traer = new ArrayList<>();
        for (Producto registro : lista) {
            if (registro.getAreaProduccion().equalsIgnoreCase(cultivo)) {
                traer.add(registro);
            }
        }
        return traer;
    }
}
