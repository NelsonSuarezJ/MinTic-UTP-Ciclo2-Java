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
import model.vo.LiderCiudad;

public class LiderCiudadDao {

    public ArrayList<LiderCiudad> rankingLiderCiudad() throws SQLException {
        Connection conexion = JDBCUtilities.getConnection();
        ArrayList<LiderCiudad> respuestaliderciudad = new ArrayList<LiderCiudad>();
        try {
            String sql = "SELECT Nombre || ' ' || Primer_Apellido || ' ' || Segundo_Apellido AS 'Nombre Líder' "
                    + "FROM Lider WHERE Ciudad_Residencia='Londres'";

            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                LiderCiudad liderciudad = new LiderCiudad();
                liderciudad.setNombreLider(rs.getString("Nombre Líder"));
                respuestaliderciudad.add(liderciudad);
            }

            rs.close();
            stmt.close();

        } catch (SQLException e) {
            System.err.println("Error al contectarse a Lider Ciudad " + e);
        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }
        return respuestaliderciudad;
    }
}