import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite el nombre del estudiante: ");
        String nombre = sc.nextLine();
        System.out.print("Digite primer nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite tercer nota: ");
        double nota3 = sc.nextDouble();
        promedioAlumno(nota1, nota2, nota3, nombre);
        sc.close();
    }

    public static void promedioAlumno(double nota1, double nota2, double nota3, String nombre) {
        System.out.println("Alumno: " + nombre);
        double promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio de notas es: " + promedio);
        if (promedio >= 3) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}
