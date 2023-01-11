package com.dgd.itvavila.presentation;

import com.dgd.itvavila.domain.models.Inspeccion;

public class InspeccionPrinter {
    public void imprimir(Inspeccion inspeccion) {
        System.out.println("Cód. Inspección:" + inspeccion.getCodigo());
        System.out.println("Fecha Inspección:" + inspeccion.getFecha());
        System.out.println("Resultado Inspección:" + inspeccion.getResultado());
        System.out.println("Propietario: " + inspeccion.getPropietario().getDni() + " " + inspeccion.getPropietario().getNombre() + " " + inspeccion.getPropietario().getApellidos());
        System.out.println("Vehículo: " + inspeccion.getVehiculo().getMatricula() + " " + inspeccion.getVehiculo().getMarca() + " " + inspeccion.getVehiculo().getModelo());
        System.out.println("---------------------------------------");

    }
}
