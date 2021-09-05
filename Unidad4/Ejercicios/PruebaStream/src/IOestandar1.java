import java.io.*;

public class IOestandar1 {
    public static void main(String[] args) throws Exception {
        int numBytes = 0;
        char caracter;
        System.out.println("\nEscribe el texto: ");
        try {
            do {
                caracter = (char) System.in.read();
                System.out.print(caracter);
                numBytes++;
            } while (caracter != '\n');
            System.err.printf("%d bytes leidos %n", numBytes);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
