import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        int numero = sc.nextInt();
        System.out.println(numero + " es " + parImpar(numero));
        sc.close();
    }

    public static String parImpar(int numero) {
        String resultado;
        resultado = numero % 2 == 0 ? "par" : "impar";
        return resultado;
    }
}
