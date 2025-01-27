package com.grupo8;

public interface Licuadora {
    void encender();
    void apagar();
    boolean estaEncendida();
    double llenar(double volumen);
    int incrementarVelocidad();
    int decrementarVelocidad();
    int consultarVelocidad();
    boolean estaLlena();
    double vaciar();
    double servir(double volumenRestado);
}

