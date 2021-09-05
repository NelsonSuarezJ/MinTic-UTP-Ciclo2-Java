package com.reto2;

public class Cabina extends Equipaje {

    private static final int TIEMPO = 2;

    public Cabina() {
        super();
    }

    public Cabina(double peso, double tamanio) {
        super(peso, tamanio);
    }

    public Cabina(double precioBase) {
        super(precioBase);
    }

    public double calcularPrecio() {
        double precioFinal = getPrecioBase() + (getPeso() * getTamanio() * TIEMPO);
        return precioFinal;
    }
}
