package com.grupo8;

public class LicuadoraFuncional implements Licuadora{
    private boolean encendida;
    private double volumenactual;
    private int velocidad;
    private double capacidadMaxima = 2.0;

    public LicuadoraFuncional(){
        this.encendida = false;
        this.velocidad = 0;
        this.volumenactual = 0;
    };



}
