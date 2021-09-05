package reto5.ciclo2.utp.modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class LiderDao {

    public ArrayList<Lider> consultaLider() throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT Nombre || ' ' || Primer_Apellido || ' ' || Segundo_Apellido AS 'Nombre Líder' "
                + "FROM Lider WHERE Ciudad_Residencia = 'Londres'";
        ArrayList<Lider> listalider = new ArrayList<Lider>();

        try {
            conn = Conexion.conectarse();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Lider lider = new Lider();
                lider.setNombreLider(rs.getString("Nombre Líder"));
                listalider.add(lider);
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            System.err.println("Error al conectarse a Lider " + e);
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return listalider;
    }
}
