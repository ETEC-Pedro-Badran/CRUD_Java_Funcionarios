/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author Evaldo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection createConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/pcetim"; //Nome da base de dados 
        String user = "root"; //nome do usuário do MySQL 
        String password = ""; //senha do MySQL Connection 
        Connection conexao = DriverManager.getConnection(url, user, password);
        return conexao;
    }
}
