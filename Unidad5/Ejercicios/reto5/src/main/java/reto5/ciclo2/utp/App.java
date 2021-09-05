package reto5.ciclo2.utp;

import java.sql.SQLException;

import reto5.ciclo2.utp.controlador.ControladorApp;

public class App {
    public static void main(String[] args) throws SQLException {

        ControladorApp control = new ControladorApp();
        control.iniciarGui();
    }
}
