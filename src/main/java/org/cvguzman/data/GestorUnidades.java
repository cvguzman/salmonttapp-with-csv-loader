package org.cvguzman.data;

import org.cvguzman.model.CentroCultivo;
import org.cvguzman.model.PlantaProceso;
import org.cvguzman.model.UnidadOperativa;

import java.util.ArrayList;
import java.util.List;

// Se crea clase para instancias de prueba
public class GestorUnidades {

    public List<UnidadOperativa>  cargarUnidades() {

        List<UnidadOperativa> unidades = new ArrayList<>();

        // Se crean objetos para CentroCultivo
        CentroCultivo centro1 = new CentroCultivo("Centro Llanquihue", "Puerto Montt", 116);
        centro1.mostrarInformacion();

        CentroCultivo centro2 = new CentroCultivo("Centro Frutillar", "Puerto Montt", 322);
        centro2.mostrarInformacion();

        // Se crean objetos para PlantaProceso
        PlantaProceso planta1 = new PlantaProceso("Planta Pacific Blue", "Aysén", 3000);
       planta1.mostrarInformacion();

       PlantaProceso planta2 = new PlantaProceso("Planta Aqua Chile", "Río Bueno", 2500);
       planta2.mostrarInformacion();

        // Agregamos en la lista
        unidades.add(centro1);
        unidades.add(centro2);
        unidades.add(planta1);
        unidades.add(planta2);

        return unidades;
    }
}

