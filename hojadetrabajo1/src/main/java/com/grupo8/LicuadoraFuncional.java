package com.grupo8;

public class LicuadoraFuncional implements Licuadora{
    /**
     * Atributos de la clase licuadora
     */
    private boolean encendida; //Determinar si la licuadora está encendida (true) o apagada (false)
    private double volumenactual; //Determinar el volumen ocupado de la licuadora
    private int velocidad; //Determinar la velocidad en la que se encuentra 
    private double capacidadMaxima = 2.0; //Determinar el volumen máximo de la licuadora
    private int velocidadMaxima = 4; //Determinar la velocidad máxima de la licuadora

    /**
     * Constructor de la clase 
     */
    public LicuadoraFuncional(){
        this.encendida = false; //Cuando se crea una licuadora esta debería estar apagada
        this.velocidad = 0; //La velocidad inicial debe ser cero 
        this.volumenactual = 0; //El volumen inicial debe ser cero 
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
            this.volumenactual = volumenactual + volumen;
        }else{
            this.volumenactual = capacidadMaxima;
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
        if(volumenactual == capacidadMaxima){
            llena = true;
        }
        return llena;
    }

    public double vaciar(){
        this.volumenactual = 0;
        return volumenactual;
    }

    public double servir(double volumenRestado){
        if(volumenactual - volumenRestado >= 0){
            this.volumenactual = volumenactual - volumenRestado ;
        }
        return volumenactual;
    }

}
