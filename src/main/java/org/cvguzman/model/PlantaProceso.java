package org.cvguzman.model;

// Se crea subclase que  heredará atributos de la superclase
public class PlantaProceso  extends UnidadOperativa{

    private int toneladasDia;

    public PlantaProceso(String nombre, String comuna, int toneladasDia) {
        super(nombre, comuna);
        this.toneladasDia = toneladasDia;
    }
}
