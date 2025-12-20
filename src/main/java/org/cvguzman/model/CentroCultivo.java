package org.cvguzman.model;

/**
 * Clase CentroCultivo
 *
 * Representa una unidad operativa del tipo Centro de Cultivo.
 * Esta clase hereda de UnidadOperativa y agrega información
 * específica relacionada con la producción en toneladas.
 *
 * Demuestra el uso de:
 * - Herencia (extends UnidadOperativa)
 * - Sobrescritura de métodos (@Override)
 * - Polimorfismo a través de la interfaz Registrable
 */

// Se crea subclase que  heredará atributos de la superclase
public class CentroCultivo  extends UnidadOperativa  {

    // ===============================
    // 1. ATRIBUTO ESPECÍFICO
    // ===============================

    // Creación atributo privado de la cantidad de toneladas producidas por el centro de cultivo
    private int toneladasProduccion;

    // ===============================
    // 2. CONSTRUCTOR
    // ===============================

    /**
     * Constructor de la clase CentroCultivo.
     *
     * Inicializa los atributos propios de la clase y
     * reutiliza el constructor de la superclase UnidadOperativa
     * para asignar el nombre y la comuna.
     *
     * @param nombre nombre del centro de cultivo
     * @param comuna comuna donde se encuentra el centro
     * @param toneladasProduccion cantidad de toneladas producidas
     */

    // Se crea constructor con atributos incluyendo atributos superclase
    public CentroCultivo(String nombre, String comuna, int toneladasProduccion) {
        super(nombre, comuna);
        this.toneladasProduccion = toneladasProduccion;
    }

    // ===============================
    // 3. SOBRESCRITURA DE MÉTODOS
    // ===============================

    /**
     * Sobrescritura del método mostrarResumen definido en la
     * interfaz Registrable e implementado en UnidadOperativa.
     *
     * Cada CentroCultivo entrega un resumen específico
     * incluyendo su nivel de producción.
     *
     * @return resumen descriptivo del centro de cultivo
     */
    @Override
    public String mostrarResumen() {
        return "El centro de cultivo " + getNombre()
                + " ubicado en " + getComuna()
                + " produce " + toneladasProduccion + " toneladas ";
    }

    // ===============================
    // 4. REPRESENTACIÓN EN TEXTO
    // ===============================

    /**
     * Método toString sobrescrito para mostrar información
     * detallada y legible del centro de cultivo en consola.
     *
     * @return representación textual del objeto CentroCultivo
     */

@Override
    // Se crea toString() para información mas legible en consola
    public String toString() {
        return "UnidadOperativa{" +
                "nombre= '" + getNombre() + '\'' +
                ", comuna= '" + getComuna() + '\'' +
                ", toneladasProduccion= '" + toneladasProduccion + '\'' +
                '}';
    }
}
