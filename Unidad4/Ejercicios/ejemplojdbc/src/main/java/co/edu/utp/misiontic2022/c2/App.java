package co.edu.utp.misiontic2022.c2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            String url = "jdbc:sqlite:bdprueba.db";
            conn = DriverManager.getConnection(url);
            /*
             * PreparedStatement stmtp =
             * conn.prepareStatement("insert into alumno values(?,?,?,?,?,?)");
             * stmtp.setInt(1, 4); stmtp.setString(2, "Pedro"); stmtp.setInt(3, 21);
             * stmtp.setInt(4, 1); stmtp.setString(5, "Hombre"); stmtp.setInt(6, 1);
             * stmtp.executeUpdate();
             */

            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from alumno");
            System.out.println("Conexion exitosa con la base de datos");
            while (rs.next()) {
                System.out.println(
                        rs.getString("nom_alu") + "\t" + rs.getInt("edad_alu") + "\t" + rs.getString("gen_alu"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
