package reto5.ciclo2.utp.controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import reto5.ciclo2.utp.modelo.*;
import reto5.ciclo2.utp.vista.VistaGui;
import reto5.ciclo2.utp.vista.VistaPorConsola;

public class ControladorApp {

    VistaGui vista;
    private ArrayList<Proyecto> lp;
    private ArrayList<Compra> lc;
    private ArrayList<Lider> ll;
    private String[][] array;

    public ArrayList<Proyecto> listaProyectos() throws SQLException {
        ProyectoDao pd = new ProyectoDao();
        lp = pd.consultaProyecto();
        return lp;
    }

    public ArrayList<Compra> listaCompra() throws SQLException {
        CompraDao cp = new CompraDao();
        lc = cp.consultaCompra();
        return lc;
    }

    public ArrayList<Lider> listaLider() throws SQLException {
        LiderDao ld = new LiderDao();
        ll = ld.consultaLider();
        return ll;
    }

    public void iniciarGui() throws SQLException {
        vista = new VistaGui(this);
    }

    public void iniciarConsola() throws SQLException {
        VistaPorConsola.reqProyecto();
        System.out.println("");

        VistaPorConsola.reqCompra();
        System.out.println("");

        VistaPorConsola.reqLider();
        System.out.println("");
    }

    public String[][] convertirArrayProyecto(ArrayList<Proyecto> proyecto, int columnas) {
        array = new String[proyecto.size()][columnas];
        for (int i = 0; i < proyecto.size(); i++) {
            array[i][0] = proyecto.get(i).getConstructora();
            array[i][1] = proyecto.get(i).getFechaInicio();
            array[i][2] = proyecto.get(i).getClasificacion();
        }
        return array;
    }

    public String[][] convertirArrayCompra(ArrayList<Compra> proyecto, int columnas) {
        array = new String[proyecto.size()][columnas];
        for (int i = 0; i < proyecto.size(); i++) {
            array[i][0] = String.valueOf(proyecto.get(i).getCantidad());
        }
        return array;
    }

    public String[][] convertirArrayLider(ArrayList<Lider> proyecto, int columnas) {
        array = new String[proyecto.size()][columnas];
        for (int i = 0; i < proyecto.size(); i++) {
            array[i][0] = proyecto.get(i).getNombreLider();
        }
        return array;
    }
}
