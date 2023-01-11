package com.dgd.itvavila.domain.usecase;

import com.dgd.itvavila.data.InspeccionDataStore;
import com.dgd.itvavila.data.PropietarioDataStore;
import com.dgd.itvavila.domain.models.Inspeccion;
import com.dgd.itvavila.domain.models.Propietario;

public class ObtenerInspeccionUseCase {
    private InspeccionDataStore dataStore = InspeccionDataStore.getInstance();

    public Inspeccion execute(String codigo) {
        return dataStore.buscar(codigo);
    }
}
