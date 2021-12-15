/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme Aragoni
 */
public class ConexaoBD {
    
    public Connection Conectadatabase(){
        Connection Con = null;
        try {
            String url = "jdbc:mysql://localhost:3306/CRUDLivraria?useTimezone=true&serverTimezone=UTC&user=root&password=root";
            Con = DriverManager.getConnection(url);
        } catch (SQLException e) {
             System.out.println("Deu ruim para Conectar\n"+e.getMessage()+"\n");
        }
        return Con;
    } 
}
