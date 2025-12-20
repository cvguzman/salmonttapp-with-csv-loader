package org.cvguzman.data;

import org.cvguzman.model.*;

import java.util.ArrayList;
import java.util.List;

// Clase encargada de generar instancias de prueba de las unidades operativas
// Se utiliza principalmente para demostrar herencia, polimorfismo e interfaz Registrable

// Se crea clase para instancias de prueba
public class GestorUnidades {

    // Método que crea y retorna una lista de objetos que implementan la interfaz Registrable
    public List<Registrable> cargarUnidades() {

        // Lista polimórfica: puede almacenar cualquier clase que implemente Registrable
        List<Registrable> unidades = new ArrayList<>();

// Se agregan centros de cultivo (subclase de UnidadOperativa)
        unidades.add(
                new CentroCultivo(
                        "Aqua",
                        "Frutillar",
                        2445));
        unidades.add(
                new CentroCultivo(
                        "Espez",
                        "Osorno",
                        1449));

        // Se agregan colaboradores responsables de distintas unidades
        unidades.add(
                new Colaborador(
                        "Aqua",
                        "Puerto Octay",
                        "María Cancino",
                        456788885));
        unidades.add(
                new Colaborador(
                        "Salpez",
                        "Puerto Montt",
                        "Raúl Villalobos",
                        34567789));

        // Se agregan colaboradores responsables de distintas unidades
        return unidades;
    }
}

