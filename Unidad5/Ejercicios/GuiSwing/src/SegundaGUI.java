import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.color.ColorSpace;

public class SegundaGUI extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi segundo Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);

        // Creacion del menu
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Archivo");
        JMenu m2 = new JMenu("Ayuda");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Nuevo");
        JMenuItem m12 = new JMenuItem("Abrir");
        m1.add(m11);
        m1.add(m12);

        // Creando el panel inferior
        JPanel panel = new JPanel();
        JLabel etiqueta = new JLabel("Introducir texto");
        JTextField campotxt = new JTextField(10);
        JButton btnEnviar = new JButton("Enviar");
        JButton btnReset = new JButton("Reset");

        panel.add(etiqueta);
        panel.add(campotxt);
        panel.add(btnEnviar);
        panel.add(btnReset);

        // JTextArea txtarea = new JTextArea();

        JButton button = new JButton("Oprimir");
        button.setBackground(Color.LIGHT_GRAY);
        button.setForeground(Color.WHITE);

        // agrega componentes al frame
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setVisible(true);
    }
}
