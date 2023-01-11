package com.dgd.itvavila.domain.usecase;

import com.dgd.itvavila.data.VehiculoDataStore;
import com.dgd.itvavila.domain.models.Camion;
import com.dgd.itvavila.domain.models.Vehiculo;

public class ObtenerVehiculoUseCase {
    private VehiculoDataStore dataStore = VehiculoDataStore.getInstance();

    public Vehiculo execute(String matricula) {
        return dataStore.buscar(matricula);
    }
}
