package org.cvguzman.model;

// Se crea la clase padre para especificar el lugar de cultivo de los peces
public abstract class UnidadOperativa implements Registrable {

    private String nombre;
    private String comuna;

    // Se crea constructor de la clase padre
    public UnidadOperativa(String nombre, String comuna) {
        this.nombre = nombre;
        this.comuna = comuna;
    }

    // Se crea interfaz que sera usado en clases hijas
@Override
    public void mostrarResumen() {
        System.out.println("La planta  " + nombre + " es producido en " + comuna);
    }

    // Se crean accesores
    public String getNombre() {return nombre;}

    public String getComuna() {return comuna;}

    // Se crea toString() para información mas legible en consola
    public String toString() {
        return "UnidadOperativa{" +
                "nombre= '"+ nombre + '\''  +
                ", comuna= '"+ comuna + '\''  +
                '}' ;
    }
}
