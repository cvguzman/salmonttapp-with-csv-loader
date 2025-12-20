package org.cvguzman.model;

/**
 * Clase Producto
 *
 * Representa un producto del inventario de la empresa.
 * Contiene información básica sobre:
 * - el nombre del producto
 * - el área de producción
 * - la cantidad producida en toneladas
 *
 * Esta clase se utiliza principalmente para:
 * - cargar datos desde archivos
 * - realizar filtros y agrupaciones con Streams
 * - mostrar información en consola
 */

// ===============================
// 1. ATRIBUTOS
// ===============================

// Creación de clase para realizar Constructor
public class Producto {

    // Nombre del producto
    private String nombreProducto;

    // Área de producción a la que pertenece el producto
    private String areaProduccion;

    // Cantidad producida expresada en toneladas
    private int cantidadTonelada;

    // ===============================
    // 2. CONSTRUCTOR
    // ===============================

    /**
     * Constructor general de la clase Producto.
     *
     * Inicializa todos los atributos necesarios para
     * representar un producto del inventario.
     *
     * @param nombreProducto nombre del producto
     * @param areaProduccion área de producción asociada
     * @param cantodadTonelada cantidad producida en toneladas
     */

// Constructor general de un producto
public Producto(String nombreProducto, String areaProduccion, int cantodadTonelada) {
    this.nombreProducto = nombreProducto;
    this.areaProduccion = areaProduccion;
    this.cantidadTonelada = cantodadTonelada;
}

    // ===============================
    // 3. MÉTODOS DE ACCESO (GETTERS)
    // ===============================

    /**
     * Obtiene el nombre del producto.
     *
     * @return nombre del producto
     */

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

    // ===============================
    // 3. MÉTODOS DE ACCESO (GETTERS)
    // ===============================

    /**
     * Obtiene el nombre del producto.
     *
     * @return nombre del producto
     */

    // Se crean los modificadores
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * Modifica el área de producción del producto.
     *
     * @param areaProduccion nueva área de producción
     */

    public void setAreaProduccion(String areaProduccion) {
        this.areaProduccion = areaProduccion;
    }

    /**
     * Modifica la cantidad producida en toneladas.
     *
     * @param cantidadTonelada nueva cantidad de toneladas
     */

    public void setCantidadTonelada(int cantidadTonelada) {
        this.cantidadTonelada = cantidadTonelada;
    }

    // ===============================
    // 5. REPRESENTACIÓN EN TEXTO
    // ===============================

    /**
     * Método toString sobrescrito para mostrar la información
     * del producto de forma clara y legible en consola.
     *
     * @return representación textual del producto
     */

    // Creamos un toStrin() para acceder mas facilmente a la información
    public String toString() {
        return "Producto{"  +
                "nombreProducto=' " + nombreProducto + '\'' +
                ", areaProduccion=' " + areaProduccion + '\'' +
                ", cantidadTonelada=' " + cantidadTonelada +
                '}';
    }
}
