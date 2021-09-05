import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LeerArchivoTexto {
    public static void main(String[] args) throws FileNotFoundException {
        String nombre = "D:\\Numeros.txt";
        var archivo = new File(nombre);
        if (archivo.exists()) {
            var lector = new Scanner(archivo);
            System.out.println("Números del archivo");
            while (lector.hasNext()) {
                var numeros = new StringTokenizer(lector.next(), ",");
                while (numeros.hasMoreTokens()) {
                    System.out.print(numeros.nextToken() + "\t");
                }
                System.out.println("");
            }
            lector.close();
        } else {
            System.out.println("¡El fichero no existe!");
        }
    }
}
