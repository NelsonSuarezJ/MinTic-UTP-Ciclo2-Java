import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int num = sc.nextInt();
        System.out.println("El numero tiene " + cuentaDigitos(num) + " cifras");
        sc.close();
    }

    public static int cuentaDigitos(int numero) {
        int cuenta = 0;
        while (numero != 0) {
            cuenta += 1;
            numero /= 10;
        }
        return cuenta;
    }
}
