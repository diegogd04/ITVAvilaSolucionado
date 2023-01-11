package com.dgd.itvavila.domain.usecase;

import com.dgd.itvavila.data.PropietarioDataStore;
import com.dgd.itvavila.domain.models.Propietario;

public class ObtenerPropietarioUseCase {
    private PropietarioDataStore dataStore = PropietarioDataStore.getInstance();

    public Propietario execute(String codigo) {
        return dataStore.buscar(codigo);
    }
}
