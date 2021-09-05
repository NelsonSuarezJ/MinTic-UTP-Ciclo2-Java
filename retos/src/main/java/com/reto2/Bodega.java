package com.reto2;

public class Bodega extends Equipaje {

    private static final double CAPACIDAD = 8.0;

    public Bodega() {
        super();
    }

    public Bodega(double peso, double tamanio) {
        super(peso, tamanio);
    }

    public Bodega(double precioBase) {
        super(precioBase);
    }

    public double calcularPrecio() {
        double precioFinal = getPrecioBase() + (getPeso() * getTamanio() * CAPACIDAD);
        return precioFinal;
    }
}
