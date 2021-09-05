package co.edu.utp.misiontic2022.c2;

/*Programa que calcule el precio de venta de un producto conociendo el precio
por unidad (sin IVA) del producto, el número de productos vendidos y el
porcentaje de IVA aplicado Los datos anteriores se leerán por teclado*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio unitario: ");
        var precio = sc.nextInt();
        System.out.print("Ingrese la cantidad de productos: ");
        var cantidad = sc.nextInt();
        System.out.print("Ingrese el IVA: ");
        var iva = sc.nextInt();
        System.out.println(precioVenta(precio, cantidad, iva));
        sc.close();
    }

    public static double precioVenta(int precio, int cantidad, double iva) {
        double precioiva = precio * (iva / 100) + precio;
        double total = precioiva * cantidad;
        return total;
    }
}
