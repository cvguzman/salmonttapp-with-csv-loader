package org.cvguzman.model;

// Se crea subclase que  heredará atributos de la superclase
public class PlantaProceso  extends UnidadOperativa{

    // Se crea atributo para constructor
    private int capacidadProceso;

    // Se crea constructor con atributos incluyendo atributos superclase
    public PlantaProceso(String nombre, String comuna, int capacidadProceso) {
        super(nombre, comuna);
        this.capacidadProceso = capacidadProceso;
    }
}
