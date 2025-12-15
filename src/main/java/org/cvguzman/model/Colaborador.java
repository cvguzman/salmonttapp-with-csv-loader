package org.cvguzman.model;

public class Colaborador extends UnidadOperativa implements Registrable {

    private String colaborador;

    public Colaborador(String colaborador, String nombre, String comuna) {
        super(nombre, comuna);
        this.colaborador = colaborador;
    }

    public String getColaborador() {
        return colaborador;
    }

    public void mostrarResumen() {
        System.out.println("El colaborador " + getColaborador() + " está a cargo del " + getNombre() + " en " + getComuna());
    }

    public String toString() {
        return "UnidadOperativa{" +
                "colaborador= '" + getColaborador() + '\'' +
                "nombre= '" + getNombre() + '\'' +
                ", comuna= '" + getComuna() + '\'' +
                '}';
    }

}
