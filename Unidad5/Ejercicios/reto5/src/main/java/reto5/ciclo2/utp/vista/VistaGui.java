package reto5.ciclo2.utp.vista;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

import reto5.ciclo2.utp.controlador.ControladorApp;
import reto5.ciclo2.utp.modelo.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class VistaGui extends JFrame implements ActionListener {

    private JButton boton1, boton2, boton3;
    private JTable tabla;
    private JScrollPane sp;
    private JPanel panel;
    private ArrayList<Proyecto> lp;
    private ArrayList<Compra> lc;
    private ArrayList<Lider> ll;
    ControladorApp ca;

    public VistaGui(ControladorApp control) throws SQLException {

        lp = control.listaProyectos();
        lc = control.listaCompra();
        ll = control.listaLider();

        setTitle("Aplicacion GUI Reto 5");
        setSize(570, 500);
        setLocationRelativeTo(null);
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("recursos/icono.png");
        setIconImage(miIcono);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        boton1 = new JButton("Proyecto Ciudad");
        boton1.setBounds(30, 20, 150, 50);
        boton1.setBackground(new Color(0x008deb));
        boton1.setForeground(Color.WHITE);
        boton1.setFocusPainted(false);
        boton2 = new JButton("Suma Cantidades");
        boton2.setBounds(200, 20, 150, 50);
        boton2.setBackground(new Color(0x008deb));
        boton2.setForeground(Color.WHITE);
        boton2.setFocusPainted(false);
        boton3 = new JButton("Lider Ciudad");
        boton3.setBounds(370, 20, 150, 50);
        boton3.setBackground(new Color(0x008deb));
        boton3.setForeground(Color.WHITE);
        boton3.setFocusPainted(false);

        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);

        tabla = new JTable();
        sp = new JScrollPane(tabla);
        sp.setBounds(30, 100, 500, 300);

        panel = new JPanel();
        panel.setBackground(new Color(0xfcfcfc));
        panel.setLayout(null);

        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(sp);
        getContentPane().add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String accion = e.getActionCommand();
        panel.remove(sp);
        ca = new ControladorApp();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        switch (accion) {
            case "Proyecto Ciudad":
                String[] pc = { "Constructora", "Fecha_Inicio", "Clasificacion" };
                tabla = new JTable(ca.convertirArrayProyecto(lp, pc.length), pc);
                tabla.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                tabla.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
                tabla.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
                break;
            case "Suma Cantidades":
                String[] sc = { "Suma Cantidades" };
                tabla = new JTable(ca.convertirArrayCompra(lc, sc.length), sc);
                tabla.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                break;
            case "Lider Ciudad":
                String[] alc = { "Nombre Lider" };
                tabla = new JTable(ca.convertirArrayLider(ll, alc.length), alc);
                tabla.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
                break;
            default:
                break;
        }
        tabla.setSelectionBackground(new Color(0x008deb));
        tabla.setSelectionForeground(Color.WHITE);
        sp = new JScrollPane(tabla);
        sp.setBounds(30, 100, 500, 300);
        panel.add(sp);
    }
}
