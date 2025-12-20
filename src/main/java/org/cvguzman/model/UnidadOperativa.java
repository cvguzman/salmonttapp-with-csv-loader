package org.cvguzman.model;

/* Clase abstracta UnidadOperativa
Representa la clase padre del dominio del sistema.
Define los atributos y comportamientos comunes de las distintas unidades operativas de la empresa.
Esta clase:
- Implementala interfaz Registrable
- Es abstracta, por lo que no puede ser instanciada directamente
- Sirve como base para las clases hijas (CentroCultivo y Colaborador
 */

// Se crea la clase padre para especificar el lugar de cultivo de los peces
public abstract class UnidadOperativa implements Registrable {

    // ===============================
    // 1. ATRIBUTOS COMUNES
    // ===============================

    // Nombre de la unidad operativa
    private String nombre;

    // Ubicación de la unidad operativa
    private String comuna;

    // ===============================
    // 2. CONSTRUCTOR
    // ===============================


    /* Se crea constructor de la clase padre
    Inicializa los atributos comunes que serán heredades a sus clases hijas
     */
    public UnidadOperativa(String nombre, String comuna) {
        this.nombre = nombre;
        this.comuna = comuna;
    }

    // ===============================
    // 3. IMPLEMENTACIÓN DE LA INTERFAZ
    // ===============================

    /**
     * Implementación del método definido en la interfaz Registrable.
     *
     * Este método puede ser sobrescrito por las clases hijas
     * para entregar un resumen más específico.
     *
     * @return resumen en formato String de la unidad operativa
     */
@Override
    public String mostrarResumen() {
        System.out.println("La planta  " + nombre + " es producido en " + comuna);
    return "La planta  " + nombre + " es producido en " + comuna;
}

    // ===============================
    // 4. MÉTODOS DE ACCESO (GETTERS)
    // ===============================

    public String getNombre() {return nombre;}

    public String getComuna() {return comuna;}

    // ===============================
    // 5. REPRESENTACIÓN EN TEXTO
    // ===============================

    // Se crea toString() para información mas legible en consola
    public String toString() {
        return "UnidadOperativa{" +
                "nombre= '"+ nombre + '\''  +
                ", comuna= '"+ comuna + '\''  +
                '}' ;
    }
}
