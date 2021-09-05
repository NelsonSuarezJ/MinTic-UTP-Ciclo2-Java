package reto5.ciclo2.utp.modelo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProyectoDao {
    public ArrayList<Proyecto> consultaProyecto() throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT Constructora, Fecha_Inicio, Clasificacion FROM Proyecto WHERE Ciudad = 'Pereira'";
        ArrayList<Proyecto> listaProyectos = new ArrayList<Proyecto>();

        try {
            conn = Conexion.conectarse();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Proyecto proyecto = new Proyecto();
                proyecto.setConstructora(rs.getString("Constructora"));
                proyecto.setFechaInicio(rs.getString("Fecha_Inicio"));
                proyecto.setClasificacion(rs.getString("Clasificacion"));
                listaProyectos.add(proyecto);
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            System.err.println("Error al conectarse con Proyecto " + e);
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return listaProyectos;
    }
}
