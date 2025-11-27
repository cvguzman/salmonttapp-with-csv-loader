package org.cvguzman.model;

// Se crea subclase que  heredará atributos de la superclase
public class CentroCultivo  extends UnidadOperativa{

    // Creación atributo privado
    private int toneladasProducción;

    // Se crea constructor con atributos incluyendo atributos superclase
    public CentroCultivo(String nombre, String comuna, int toneladasProducción) {
        super(nombre, comuna);
        this.toneladasProducción = toneladasProducción;
    }
}
