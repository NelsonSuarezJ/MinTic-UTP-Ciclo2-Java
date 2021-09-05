import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Serie Fibonacci");
        System.out.print("Ingrese el limite: ");
        int limite = sc.nextInt();
        fibonacci(limite);
        sc.close();
    }

    public static void fibonacci(int limite) {
        int num1 = 0;
        int num2 = 1;
        int suma = num1 + num2;
        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        while (suma <= limite) {
            System.out.print(suma + " ");
            num1 = num2;
            num2 = suma;
            suma = num1 + num2;
        }
    }
}
