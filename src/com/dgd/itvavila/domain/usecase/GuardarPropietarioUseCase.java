package com.dgd.itvavila.domain.usecase;

import com.dgd.itvavila.data.PropietarioDataStore;
import com.dgd.itvavila.domain.models.Propietario;

public class GuardarPropietarioUseCase {
    private PropietarioDataStore dataStore = PropietarioDataStore.getInstance();

    public void execute(Propietario model) {
        dataStore.guardar(model);
    }
}
