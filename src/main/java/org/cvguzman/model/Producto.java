package org.cvguzman.model;

import org.cvguzman.data.RegistroExcel;
// Creación de clase para realizar Constructor
public class Producto {
    private String nombreProducto;
    private String areaProduccion;
    private int cantidadTonelada;

// Constructor general de un producto
public Producto(String nombreProducto, String areaProduccion, int cantodadTonelada) {
    this.nombreProducto = nombreProducto;
    this.areaProduccion = areaProduccion;
    this.cantidadTonelada = cantodadTonelada;
}

    // Se crean los accesores
    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getAreaProduccion() {
        return areaProduccion;
    }

    public int getCantidadTonelada() {
        return cantidadTonelada;
    }

    // Se crean los modificadores
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setAreaProduccion(String areaProduccion) {
        this.areaProduccion = areaProduccion;
    }

    public void setCantidadTonelada(int cantidadTonelada) {
        this.cantidadTonelada = cantidadTonelada;
    }


    // Creamos un toStrin() para acceder mas facilmente a la información
    public String toString() {
        return "Producto{"  +
                "nombreProducto=' " + nombreProducto + '\'' +
                ", areaProduccion=' " + areaProduccion + '\'' +
                ", cantidadTonelada=' " + cantidadTonelada +
                '}';
    }
}
