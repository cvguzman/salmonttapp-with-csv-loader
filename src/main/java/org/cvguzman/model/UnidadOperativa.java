package org.cvguzman.model;

// Se crea la clase padre para especificar el lugar de cultivo de los peces
public class UnidadOperativa {

    private String nombre;
    private String comuna;


    // Se crea constructor de la clase padre
    public UnidadOperativa(String nombre, String comuna) {
        this.nombre = nombre;
        this.comuna = comuna;
    }

    // Se creanaccesores
    public String getNombre() {
        return nombre;
    }

    public String getComuna() {
        return comuna;
    }

    //Se crea método
    public void locacionProducto() {
        System.out.println("Producto "+ nombre + " es producido en " + comuna);
    }

    // Se crea toString() para información mas legible en consola
    public String toString() {
        return "UnidadOperativa{" +
                "nombre= ' " + nombre + '\''  +
                ", comuna= ' " + nombre + '\''  +
                '}' ;
    }
}
