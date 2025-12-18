package org.cvguzman.data;

import org.cvguzman.model.*;

import java.util.ArrayList;
import java.util.List;

// Se crea clase para instancias de prueba
public class GestorUnidades {

    public List<Registrable> cargarUnidades() {

        List<Registrable> unidades = new ArrayList<>();

        // Agregamos en la lista

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

        return unidades;
    }
}

