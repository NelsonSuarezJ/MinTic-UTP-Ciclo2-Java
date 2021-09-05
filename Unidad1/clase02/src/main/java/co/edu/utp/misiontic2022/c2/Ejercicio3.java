package co.edu.utp.misiontic2022.c2;

//Programa que lea dos variables enteras N y m y le quite a N sus m últimas cifras

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();
        System.out.print("Ingrese cantidad de cifras a quitar: ");
        int cifras = sc.nextInt();
        System.out.println("El numero " + numero + " menos " + cifras + " cifras es: " + nuevoNumero(numero, cifras));
        sc.close();
    }

    public static int nuevoNumero(int numero, int cifras) {
        for (int i = 0; i < cifras; i++) {
            numero = numero / 10;
        }
        return numero;
    }
}
