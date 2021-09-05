package com.reto2;

public class Equipaje {

    private static final double PESO = 10.0;
    private static final double TAMANIO = 4.5;
    private static final double PRECIO_BASE = 1000.0;
    private double peso;
    private double tamanio;
    private double precioBase;

    public Equipaje(double peso, double tamanio) {
        this.peso = peso;
        this.tamanio = tamanio;
        this.precioBase = PRECIO_BASE;
    }

    public Equipaje(double precioBase) {
        this.precioBase = precioBase;
        this.peso = PESO;
        this.tamanio = TAMANIO;
    }

    public Equipaje() {
        this.peso = PESO;
        this.tamanio = TAMANIO;
        this.precioBase = PRECIO_BASE;
    }

    public double getPeso() {
        return this.peso;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public double getPrecioBase() {
        return this.precioBase;
    }

    public double calcularPrecio() {
        return 0.0;
    }
}
