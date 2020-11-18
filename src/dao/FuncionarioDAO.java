/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.ConnectionFactory;
import dominio.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Evaldo
 */
public class FuncionarioDAO {
    
    
    public boolean inserir(Funcionario funcionario) throws SQLException{
            Connection conexao = ConnectionFactory.createConnection();
            
            Statement st = conexao.createStatement();
            
            
            String sql = "INSERT INTO funcionario (codigo, nome,sobrenome,idade,salario) VALUES (?,?,?,?,?)"; //Prepara a instrução SQL
            PreparedStatement ps = conexao.prepareStatement(sql); //Executa a instrução SQL 
            
            ps.setInt(1, funcionario.getCodigo());
            ps.setString(2, funcionario.getNome());
            ps.setString(3, funcionario.getSobrenome());
            ps.setInt(4, funcionario.getIdade());
            ps.setDouble(5, funcionario.getSalario());
            ps.executeUpdate();
            return true;
    
    }
    
    
}
