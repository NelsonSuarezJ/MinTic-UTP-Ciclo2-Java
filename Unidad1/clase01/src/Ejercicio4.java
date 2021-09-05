import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite la temperatura en Celcius: ");
        double celcius = sc.nextDouble();
        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit(celcius));
        sc.close();
    }

    public static double fahrenheit(double celcius) {
        double fah = 32 + (9 * celcius / 5);
        return fah;
    }
}
