import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println(Saludo(nombre));
        sc.close();
    }

    public static String Saludo(String nombre) {
        return "Hola " + nombre;
    }
}
