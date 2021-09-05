package com.reto1;

public class App {
    public static void main(String[] args) {
        Exportacion exp = new Exportacion();
        String respuesta = exp.compararExportacion(24, 2000, 0.1);
        System.out.println(respuesta);
    }
}
