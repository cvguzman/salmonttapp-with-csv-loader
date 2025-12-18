package org.cvguzman.model;

public class Colaborador extends UnidadOperativa {

    private String colaborador;
    private int telefono;

    public Colaborador(String nombre, String comuna, String colaborador, int telefono) {
        super(nombre, comuna);
        this.colaborador = colaborador;
        this.telefono = telefono;
    }

    public String getColaborador() {
        return colaborador;
    }

    @Override
    public String mostrarResumen() {
        return "El colaborador " + getColaborador()
                + " está a cargo del Centro " + getNombre()
                + " en " + getComuna();
    }
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
