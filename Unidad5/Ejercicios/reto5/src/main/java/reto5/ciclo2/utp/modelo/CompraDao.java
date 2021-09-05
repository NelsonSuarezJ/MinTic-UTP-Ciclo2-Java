package reto5.ciclo2.utp.modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CompraDao {
    public ArrayList<Compra> consultaCompra() throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT sum(Cantidad) as 'Suma Cantidades' FROM Compra WHERE Proveedor = 'Homecenter'";
        ArrayList<Compra> listaCompra = new ArrayList<Compra>();

        try {
            conn = Conexion.conectarse();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            Compra compra = new Compra();
            compra.setCantidad(rs.getInt("Suma Cantidades"));
            listaCompra.add(compra);

        } catch (SQLException e) {
            System.err.println("Error al conectarse a Compra " + e);
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return listaCompra;
    }
}
