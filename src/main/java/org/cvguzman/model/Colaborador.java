package org.cvguzman.model;

/**
 * Clase Colaborador
 *
 * Representa a un colaborador responsable de una unidad operativa.
 * Esta clase hereda de UnidadOperativa y agrega información
 * específica relacionada con la persona a cargo.
 *
 * Demuestra el uso de:
 * - Herencia (extends UnidadOperativa)
 * - Sobrescritura de métodos (@Override)
 * - Polimorfismo mediante la interfaz Registrable
 */

public class Colaborador extends UnidadOperativa {

    // ===============================
    // 1. ATRIBUTOS ESPECÍFICOS
    // ===============================

    // Nombre del colaborador responsable
    private String colaborador;

    // Teléfono de contacto del colaborador
    private int telefono;

    // ===============================
    // 2. CONSTRUCTOR
    // ===============================

    /**
     * Constructor de la clase Colaborador.
     *
     * Inicializa los atributos propios del colaborador y
     * reutiliza el constructor de la superclase UnidadOperativa
     * para asignar el nombre y la comuna de la unidad.
     *
     * @param nombre nombre de la unidad operativa a cargo
     * @param comuna comuna donde se ubica la unidad
     * @param colaborador nombre del colaborador responsable
     * @param telefono número de teléfono del colaborador
     */
    public Colaborador(String nombre, String comuna, String colaborador, int telefono) {
        super(nombre, comuna);
        this.colaborador = colaborador;
        this.telefono = telefono;
    }

    // ===============================
    // 3. MÉTODOS DE ACCESO
    // ===============================

    /**
     * Obtiene el nombre del colaborador.
     *
     * @return nombre del colaborador
     */

    public String getColaborador() {
        return colaborador;
    }

    // ===============================
    // 4. SOBRESCRITURA DE MÉTODOS
    // ===============================

    /**
     * Sobrescritura del método mostrarResumen definido en la
     * interfaz Registrable.
     *
     * Retorna un resumen específico indicando qué colaborador
     * está a cargo de la unidad operativa.
     *
     * @return resumen descriptivo del colaborador
     */
    @Override
    public String mostrarResumen() {
        return "El colaborador " + getColaborador()
                + " está a cargo del Centro " + getNombre()
                + " en " + getComuna();
    }

    // ===============================
    // 5. REPRESENTACIÓN EN TEXTO
    // ===============================

    /**
     * Método toString sobrescrito para mostrar información
     * clara y detallada del colaborador en consola.
     *
     * @return representación textual del objeto Colaborador
     */
@Override
    public String toString() {
        return "Colaborador{" +
                "colaborador= '" + colaborador + '\'' +
                "teléfono= '" + telefono + '\'' +
                "centro= '" + getNombre() + '\'' +
                ", comuna= '" + getComuna() + '\'' +
                '}';
    }
}
