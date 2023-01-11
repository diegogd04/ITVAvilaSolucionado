package com.dgd.itvavila.domain.usecase;

import com.dgd.itvavila.data.InspeccionDataStore;
import com.dgd.itvavila.data.PropietarioDataStore;
import com.dgd.itvavila.domain.models.Inspeccion;
import com.dgd.itvavila.domain.models.Propietario;

public class GuardarInspeccionUseCase {
    private InspeccionDataStore dataStore = InspeccionDataStore.getInstance();

    public void execute(Inspeccion model) {
        dataStore.guardar(model);
    }
}
