import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int aleatorio = (int) (Math.random() * (max - min) + 1);
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entre 0 y 100: ");
        int numero = sc.nextInt();
        adivinarNumero(aleatorio, numero);
        sc.close();
    }

    public static void adivinarNumero(int aleatorio, int numero) {
        while (numero != aleatorio) {
            if (numero < aleatorio) {
                System.out.println("El numero que busca es mayor");
            } else {
                System.out.println("El numero que busca es menor");
            }
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese otro numero: ");
            numero = sc.nextInt();
            if (numero == aleatorio) {
                sc.close();
            }
        }
        System.out.println("Haz acertado");
    }
}
