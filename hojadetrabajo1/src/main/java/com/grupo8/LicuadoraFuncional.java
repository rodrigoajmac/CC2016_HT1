package com.grupo8;

public class LicuadoraFuncional implements Licuadora{
    private boolean encendida;
    private double volumenactual;
    private int velocidad;
    private double capacidadMaxima = 2.0;
    private int velocidadMaxima = 4;

    public LicuadoraFuncional(){
        this.encendida = false;
        this.velocidad = 0;
        this.volumenactual = 0;
    }

    public void encender(){
        this.encendida = true;
        this.velocidad = 0;
    }

    public void apagar(){
        this.encendida = false;
        this.velocidad = 0;
    }

    public boolean estaEncendida(){
        return encendida;
    }

    public double llenar(double volumen){
        if(volumenactual + volumen <= capacidadMaxima){
            this.volumenactual = volumenactual + volumen
        }else{
            this.volumenactual = capacidadMaxima
        }
        return volumenactual;
    }

    public int incrementarVelocidad(){
        if(velocidad < velocidadMaxima){
            this.velocidad = velocidad + 1;
        }
        return velocidad;
    }

    public int decrementarVelocidad(){
        if(velocidad > 1){
            this.velocidad = velocidad - 1;
        }
        return velocidad;
    }

    public int consultarVelocidad(){
        return velocidad;
    }

    public boolean estaLlena(){
        boolean llena = false;
        if(volumenactual = capacidadMaxima){
            boolean llena = true;
        }
        return llena;
    }

    public double vaciar(){
        this.volumenactual = 0;
        return volumenactual;
    }

    public double servir(double volumenRestado){
        if(volumenactual - volumenRestado >= 0){
            this.volumenactual = volumenactual - volumenRestado 
        }
        return volumenactual;
    }

}
