package reto5.ciclo2.utp.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection conectarse() throws SQLException {
        String url = "jdbc:sqlite:recursos/ProyectosConstruccion.db";
        Connection conn = null;
        conn = DriverManager.getConnection(url);
        return conn;
    }
}
