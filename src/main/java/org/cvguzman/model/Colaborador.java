package org.cvguzman.model;

public class Colaborador extends UnidadOperativa implements Registrable {

    private String colaborador;

    public Colaborador(String colaborador, String nombre, String comuna, int valor) {
        super(nombre, comuna);
        this.colaborador = colaborador;
    }

    public String getColaborador() {
        return colaborador;
    }

    public Object mostrarResumen() {
        System.out.println("El colaborador " + getColaborador() + " está a cargo del " + getNombre() + " en " + getComuna());
        return "El colaborador " + getColaborador() + " está a cargo del " + getNombre() + " en " + getComuna();
    }

    public String toString() {
        return "UnidadOperativa{" +
                "colaborador= '" + getColaborador() + '\'' +
                "nombre= '" + getNombre() + '\'' +
                ", comuna= '" + getComuna() + '\'' +
                '}';
    }

}
