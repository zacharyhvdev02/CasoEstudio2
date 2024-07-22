package com.mycompany.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

    protected Connection conexion;
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://sql.ealpizar.com:56274/ilib?characterEncoding=UTF-8";

    private final String USER = "patrones";
    private final String PASS = "r2@xp8BKLeXqB!v9fGQ01Dvr&$r#h7&Pn";

    public void Conectar() throws ClassNotFoundException {
        try {
            Class.forName(JDBC_DRIVER);
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Cerrar() throws SQLException {
        if (conexion != null && !conexion.isClosed()) {
            conexion.close();
        }
    }
}
