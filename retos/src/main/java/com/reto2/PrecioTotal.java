package com.reto2;

public class PrecioTotal {
    private double totalPrecios = 0;
    private double totalBodega = 0;
    private double totalCabina = 0;
    private Equipaje equipaje[];

    public PrecioTotal(Equipaje equipaje[]) {
        this.equipaje = equipaje;
    }

    public void mostrarTotales() {

        calcularTotales();
        System.out.println("Total Equipaje " + totalPrecios);
        System.out.println("Total Bodega " + totalBodega);
        System.out.println("Total Cabina " + totalCabina);
    }

    public void calcularTotales() {
        for (Equipaje eq : equipaje) {
            totalPrecios = totalPrecios + eq.calcularPrecio();
            if (eq instanceof Bodega) {
                totalBodega = totalBodega + eq.calcularPrecio();
            } else {
                totalCabina = totalCabina + eq.calcularPrecio();
            }
        }
    }
}
