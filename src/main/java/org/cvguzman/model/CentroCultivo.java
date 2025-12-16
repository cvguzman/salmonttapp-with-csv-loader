package org.cvguzman.model;

// Se crea subclase que  heredará atributos de la superclase
public class CentroCultivo  extends UnidadOperativa {

    // Creación atributo privado
    private int toneladasProducción;

    // Se crea constructor con atributos incluyendo atributos superclase
    public CentroCultivo(String nombre, String comuna, int toneladasProducción) {
        super(nombre, comuna);
        this.toneladasProducción = toneladasProducción;
    }

    @Override
    public Object mostrarResumen() {
        System.out.println("El centro de cultivo " + getNombre() + " produce " + toneladasProducción + " toneladas " +
                " en " + getComuna());
        return "El centro de cultivo " + getNombre() + " produce " + toneladasProducción + " toneladas " +
                " en " + getComuna();
    }

    // Se crea toString() para información mas legible en consola
    public String toString() {
        return "UnidadOperativa{" +
                "nombre= '" + getNombre() + '\'' +
                ", comuna= '" + getComuna() + '\'' +
                ", toneladasProduccion= '" + toneladasProducción + '\'' +
                '}';
    }
}
