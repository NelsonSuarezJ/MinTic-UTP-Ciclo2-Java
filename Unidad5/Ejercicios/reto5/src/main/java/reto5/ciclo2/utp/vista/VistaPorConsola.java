package reto5.ciclo2.utp.vista;

import java.sql.SQLException;
import java.util.ArrayList;
import reto5.ciclo2.utp.controlador.ControladorApp;
import reto5.ciclo2.utp.modelo.Compra;
import reto5.ciclo2.utp.modelo.Lider;
import reto5.ciclo2.utp.modelo.Proyecto;

public class VistaPorConsola {

    static ControladorApp c = new ControladorApp();;

    public static void reqProyecto() throws SQLException {

        ArrayList<Proyecto> lp = c.listaProyectos();
        System.out.println("-----Proyecto Ciudad-------");
        System.out.println("Constructora\t Fecha_Inicio\t Clasificación");
        for (Proyecto proyecto : lp) {
            System.out.print(proyecto.getConstructora() + "\t");
            System.out.print(proyecto.getFechaInicio() + "\t");
            System.out.println(proyecto.getClasificacion() + "\t");
        }
    }

    public static void reqCompra() throws SQLException {
        ArrayList<Compra> lc = c.listaCompra();
        System.out.println("-----Suma Cantidades-------");
        System.out.println("Suma Cantidades");
        System.out.println(lc.get(0).getCantidad());
    }

    public static void reqLider() throws SQLException {
        ArrayList<Lider> ll = c.listaLider();
        System.out.println("-----Líder Ciudad-------");
        System.out.println("Nombre Líder");
        for (Lider lider : ll) {
            System.out.println(lider.getNombreLider());
        }
    }
}
