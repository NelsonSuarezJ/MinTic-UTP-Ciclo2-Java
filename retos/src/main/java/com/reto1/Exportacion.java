package com.reto1;

public class Exportacion {
    double calculoInteresSimple;
    double calculoInteresCompuesto;
    String respuesta;

    public double interesSimple(int pTiempo, double pCapital, double pInteres) {
        calculoInteresSimple = pTiempo * pCapital * pInteres;
        return calculoInteresSimple;
    }

    public double interesCompuesto(int pTiempo, double pCapital, double pInteres) {
        calculoInteresCompuesto = pCapital * (Math.pow(1 + pInteres, pTiempo) - 1);
        return calculoInteresCompuesto;
    }

    public String compararExportacion(int pTiempo, double pCapital, double pInteres) {
        if (pInteres <= 0) {
            respuesta = "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";
        } else {
            respuesta = "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $"
                    + (interesCompuesto(pTiempo, pCapital, pInteres) - interesSimple(pTiempo, pCapital, pInteres));
        }
        return respuesta;
    }
}
