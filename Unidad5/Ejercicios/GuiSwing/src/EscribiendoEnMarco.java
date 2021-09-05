import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {
    public static void main(String[] args) {
        MarcoConTexto marco = new MarcoConTexto();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoConTexto extends JFrame {
    public MarcoConTexto() {
        setVisible(true);
        setTitle("Primer texto");
        setBounds(500, 500, 700, 300);
        Lamina miLamina = new Lamina();
        add(miLamina);
    }
}

class Lamina extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Estamos aprendiendo Swing", 100, 100);
    }
}