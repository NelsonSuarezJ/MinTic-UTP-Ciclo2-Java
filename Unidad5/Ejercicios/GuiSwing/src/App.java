import javax.swing.*;

public class App {
    public static void main(String[] args) {
        MiMarco marco1 = new MiMarco();
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Accion al cerrar la ventana
    }
}

class MiMarco extends JFrame {
    public MiMarco() {
        // setSize(500, 300); //tamaño
        setVisible(true);
        // setLocation(500, 800); // coordenadas de posicion
        setBounds(400, 600, 500, 500); // posicion x, posicion y,ancho,alto
        setResizable(false);
        // setExtendedState(JFrame.MAXIMIZED_BOTH);// ventana maximizada
        setTitle("Titulo de mi Frame");
    }
}