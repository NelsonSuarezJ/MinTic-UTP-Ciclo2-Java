import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();
        System.out.println("El doble es: " + doble(numero));
        System.out.println("El triple es: " + triple(numero));
        sc.close();
    }

    public static int doble(int numero) {
        int doble = numero * 2;
        return doble;
    }

    public static int triple(int numero) {
        int triple = numero * 3;
        return triple;
    }
}
