package com.dgd.itvavila.domain.usecase;

import com.dgd.itvavila.data.VehiculoDataStore;
import com.dgd.itvavila.domain.models.Camion;
import com.dgd.itvavila.domain.models.Vehiculo;

public class GuardarVehiculoUseCase {
    private VehiculoDataStore dataStore = VehiculoDataStore.getInstance();

    public void execute(Vehiculo model) {
        dataStore.guardar(model);
    }
}
