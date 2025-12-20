package org.cvguzman.model;

/**
 * Interfaz Registrable
 *
 * Define un contrato común para todas las clases del sistema
 * que pueden ser registradas y mostradas mediante un resumen.
 *
 * Esta interfaz permite:
 * - Aplicar polimorfismo
 * - Trabajar con distintas clases a través de un mismo tipo
 * - Separar la definición del comportamiento de su implementación
 */

// Se crea interfaz
public interface Registrable {

    // ===============================
    // MÉTODO ABSTRACTO
    // ===============================

    /**
     * Retorna un resumen descriptivo del objeto.
     *
     * Este método debe ser implementado por todas las clases
     * que implementen la interfaz Registrable.
     *
     * Permite que diferentes tipos de objetos entreguen
     * su propia versión del resumen.
     *
     * @return String con el resumen del objeto
     */

    // Método sin implementación, solo se declara
    String mostrarResumen();
}
