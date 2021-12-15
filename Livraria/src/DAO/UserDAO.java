package DAO;

import DTO.UserDTO;
import Conexao.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 * 
 *
 * @author Guilherme Aragoni
 */
public class UserDAO {
    
    Connection conn;
    PreparedStatement PS;
    ResultSet RS;
    public void Inserir(UserDTO user){
        String sql = "INSERT INTO CRUDLivraria.Users (Nome, Email, Senha) VALUES (?, ?, ?)";
        conn = new ConexaoBD().Conectadatabase();
        try {
            PS = conn.prepareStatement(sql);
            PS.setString(1, user.getNome());
            PS.setString(2, user.getEmail());
            PS.setString(3, user.getSenha());
            PS.execute();
            
            PS.close();

        } catch (Exception e) {
            System.out.println("Deu ruim para Cadastrar o User\n" + e.getMessage());
        }
    }
    public ArrayList<UserDTO> Listar(){
        ArrayList<UserDTO> lista = new ArrayList();
        String sql = "SELECT * FROM CRUDLivraria.Users";
        conn = new ConexaoBD().Conectadatabase();
        try {
            PS = conn.prepareStatement(sql);
            RS = PS.executeQuery();
            while (RS.next()){
                UserDTO user= new UserDTO();
                user.setId(RS.getInt("IdUser"));              
                user.setNome(RS.getString("Nome"));
                user.setEmail(RS.getString("Email"));
                lista.add(user);
            }
            PS.close();
           

        } catch (Exception e) {
            System.out.println("Deu ruim para Listar o User\n" + e.getMessage());
        } 
        return lista;
    }
    public void Editar(UserDTO user){
        String sql = "UPDATE CRUDLivraria.Users set Nome = ?, Email = ?, Senha = ? WHERE IdUser = ?";
        conn = new ConexaoBD().Conectadatabase();
        try {
            if(user.getNome() != "" && user.getEmail() != "" && user.getSenha() != ""){
                PS = conn.prepareStatement(sql);
                PS.setString(1, user.getNome());
                PS.setString(2, user.getEmail());
                PS.setString(3, user.getSenha());
                PS.setInt(4, user.getId());
                PS.execute();
                PS.close();
            }else{
                System.out.println("Digite todos os campos");
            }
        } catch (Exception e) {
            System.out.println("Deu ruim para editar o User\n" + e.getMessage());
        }
    }
    public void Excluir(UserDTO user){
        String sql = "DELETE FROM CRUDLivraria.Users WHERE IdUser = ?";
        conn = new ConexaoBD().Conectadatabase();
        try {
            PS = conn.prepareStatement(sql);
            PS.setInt(1, user.getId());
            PS.execute();
            PS.close();
        } catch (Exception e) {
            System.out.println("Deu ruim para Apagar o User \n" + e.getMessage());
        }
    }
}

