import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite primer numero: ");
        var num1 = sc.nextInt();
        System.out.print("Digite segundo numero: ");
        var num2 = sc.nextInt();
        System.out.println("La suma de " + num1 + " y " + num2 + " es igual a: " + suma(num1, num2));
        System.out.println("La resta de " + num1 + " y " + num2 + " es igual a: " + resta(num1, num2));
        System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es igual a: " + multipli(num1, num2));
        System.out.println("La division de " + num1 + " y " + num2 + " es igual a: " + division(num1, num2));
        sc.close();
    }

    public static int suma(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }

    public static int resta(int num1, int num2) {
        int resultado = num1 - num2;
        return resultado;
    }

    public static int multipli(int num1, int num2) {
        int resultado = num1 * num2;
        return resultado;
    }

    public static double division(double num1, double num2) {
        double resultado = num1 / num2;
        return resultado;
    }
}
