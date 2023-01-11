package com.dgd.itvavila.domain.models;

public class Motocicleta implements Vehiculo{
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private String annioMatriculacion;
    private Integer diametro;

    @Override
    public String getMatricula() {
        return matricula;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAnnioMatriculacion() {
        return annioMatriculacion;
    }

    public void setAnnioMatriculacion(String annioMatriculacion) {
        this.annioMatriculacion = annioMatriculacion;
    }

    public Integer getDiametro() {
        return diametro;
    }

    public void setDiametro(Integer diametro) {
        this.diametro = diametro;
    }
}
