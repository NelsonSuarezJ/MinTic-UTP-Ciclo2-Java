package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.SumaProveedor;

public class SumaProveedorDao {

    public ArrayList<SumaProveedor> rankingSumaProveedor() throws SQLException {
        ArrayList<SumaProveedor> respuestaSuma = new ArrayList<SumaProveedor>();
        Connection conexion = JDBCUtilities.getConnection();
        String sql = "SELECT sum(Cantidad) FROM Compra WHERE Proveedor='Homecenter'";
        try {
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                SumaProveedor sumaproveedor = new SumaProveedor();
                sumaproveedor.setSumaCantidades(rs.getInt(1));
                respuestaSuma.add(sumaproveedor);
            }

            rs.close();
            stmt.close();

        } catch (SQLException e) {
            System.err.println("Error consultado SumaProveedor " + e);
        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }
        return respuestaSuma;
    }
}