/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.ConexaoBD;
import DTO.BookDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Guilherme Aragoni
 */
public class BookDAO {
    
    Connection conn;
    PreparedStatement PS;
    ResultSet RS;
    public void Inserir(BookDTO book){
        String sql = "INSERT INTO CRUDLivraria.Book (Nome, Ano, Author, Publisher) VALUES (?, ?, ?, ?)";
        conn = new ConexaoBD().Conectadatabase();
        try {
            PS = conn.prepareStatement(sql);
            PS.setString(1, book.getNome());
            PS.setInt(2, book.getAno());
            PS.setString(3, book.getAuthor());
            PS.setString(4, book.getPublisher());

            PS.execute();
            PS.close();

        } catch (Exception e) {
            System.out.println("Deu ruim para Cadastrar o BOOK\n" + e.getMessage());
        }
    }
    public ArrayList<BookDTO> Listar(){
        ArrayList<BookDTO> lista = new ArrayList();
        String sql = "SELECT * FROM CRUDLivraria.Book ";
        conn = new ConexaoBD().Conectadatabase();
        try {
            PS = conn.prepareStatement(sql);
            RS = PS.executeQuery();
            while (RS.next()){
                BookDTO book= new BookDTO();
                book.setId(RS.getInt("IdBook"));              
                book.setNome(RS.getString("Nome"));
                book.setAno(RS.getInt("Ano"));               
                book.setAuthor(RS.getString("Author"));
                book.setPublisher(RS.getString("Publisher"));

                lista.add(book);
            }
            PS.close();
           

        } catch (Exception e) {
            System.out.println("Deu ruim para Listar o BOOK\n" + e.getMessage());
        } 
        return lista;
    }
    public void Editar(BookDTO book){
        String sql = "UPDATE CRUDLivraria.Book set Nome = ?, Ano = ?, Author = ?, Publisher = ? WHERE IdBook = ?";
        conn = new ConexaoBD().Conectadatabase();
        try {
            if(book.getNome() != "" && book.getAno() != 0 && book.getAuthor() != "" && book.getPublisher() != ""){
                
                PS = conn.prepareStatement(sql);
                PS.setString(1, book.getNome());
                PS.setInt(2, book.getAno());
                PS.setString(3, book.getAuthor());
                PS.setString(4,book.getPublisher());
                PS.setInt(5, book.getId());
                
                PS.execute();
                PS.close();
            }else{
                System.out.println("Digite todos os campos");
            }
        } catch (Exception e) {
            System.out.println("Deu ruim para editar o BOOK\n" + e.getMessage());
        }
    }
    public void Excluir(BookDTO book){
        String sql = "DELETE FROM CRUDLivraria.Book WHERE IdBook = ?";
        conn = new ConexaoBD().Conectadatabase();
        try {
            PS = conn.prepareStatement(sql);
            PS.setInt(1, book.getId());
            PS.execute();
            PS.close();
        } catch (Exception e) {
            System.out.println("Deu ruim para Apagar o BOOK \n" + e.getMessage());
        }
    }
}
