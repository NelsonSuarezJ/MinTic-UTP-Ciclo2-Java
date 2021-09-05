import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el genero (H/M): ");
        String genero = sc.nextLine();
        System.out.print("Ingrese la altura en cm: ");
        int altura = sc.nextInt();
        System.out.println("El peso ideal es: " + pesoIdeal(genero, altura));
        sc.close();
    }

    public static int pesoIdeal(String genero, int altura) {
        int peso;
        if (genero.equalsIgnoreCase("M")) {
            peso = altura - 120;
        } else {
            peso = altura - 110;
        }
        return peso;
    }
}
