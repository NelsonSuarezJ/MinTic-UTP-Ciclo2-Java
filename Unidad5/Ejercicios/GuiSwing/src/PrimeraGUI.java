import javax.swing.JButton;
import javax.swing.JFrame;

public class PrimeraGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi primer Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        JButton btn = new JButton("Presionar");
        frame.getContentPane().add(btn);
        frame.setVisible(true);
    }
}
