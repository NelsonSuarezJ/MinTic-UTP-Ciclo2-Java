package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese fecha de nacimiento en formato dd/mm/aaaa: ");
        String fecha = sc.nextLine();
        System.out.println("Numero de la suerte: " + calculoFecha(fecha));
        sc.close();
    }

    public static int calculoFecha(String fecha) {
        int d1 = fecha.indexOf("/");
        int d2 = fecha.lastIndexOf("/");
        int dia = Integer.parseInt(fecha.substring(0, d1));
        int mes = Integer.parseInt(fecha.substring(d1 + 1, d2));
        int anio = Integer.parseInt(fecha.substring(d2 + 1));
        int numero = dia + mes + anio;
        int resultado = 0;
        while (numero > 0) {
            resultado += numero % 10;
            numero /= 10;
        }
        return resultado;
    }
}
