import java.awt.Toolkit;
import javax.swing.*;
import java.awt.*;

public class CrearMarcoCentrado {
    public static void main(String[] args) {
        MarcoCentro marco1 = new MarcoCentro();
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoCentro extends JFrame {
    public MarcoCentro() {
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = miPantalla.getScreenSize();
        int alturaPantalla = tamanioPantalla.height;
        int anchoPantalla = tamanioPantalla.width;
        setSize(anchoPantalla / 2, alturaPantalla / 2);
        setLocation(anchoPantalla / 4, alturaPantalla / 4);
        setVisible(true);
        setTitle("Marco centrado");
        Image miIcono = miPantalla.getImage("src/icono.png");
        setIconImage(miIcono);
    }
}