import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int numero = sc.nextInt();
        tablaMultiplicar(numero);
        sc.close();
    }

    public static void tablaMultiplicar(int numero) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}
