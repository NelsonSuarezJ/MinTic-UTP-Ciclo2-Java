import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese un numero: ");
            int numero = sc.nextInt();
            System.out.println("El numero ingresado " + esPrimo(numero));

            System.out.print("Desea continuar? S/N: ");
            String opcion = sc.next();
            if (opcion.equalsIgnoreCase("N")) {
                continuar = false;
                sc.close();
            }
        }
    }

    public static String esPrimo(int numero) {

        String resultado = "es primo";

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                resultado = "no es primo";
            }
        }

        return resultado;
    }
}
