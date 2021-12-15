/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.*;
import Conexao.ConexaoBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Guilherme Aragoni
 */
public class OrderDAO {
    Connection conn;
    PreparedStatement PS;
    ResultSet RS;
    public void Inserir(OrderDTO order){
        String sql = "INSERT INTO CRUDLivraria.Orders (UserId, BookId, ShippeInfoId) VALUES (?, ?, ?)";
        conn = new ConexaoBD().Conectadatabase();
        try {
            PS = conn.prepareStatement(sql);
            PS.setInt(1, order.getUser());
            PS.setInt(2, order.getBook());
            PS.setInt(3, order.getShippeInfo());
            PS.execute();
            PS.close();

        } catch (Exception e) {
            System.out.println("Deu ruim para Cadastrar a ORDER\n" + e.getMessage());
        }
    }
    public ArrayList<OrderDTO> Listar(){
        ArrayList<OrderDTO> lista = new ArrayList();
        String sql = "SELECT * FROM CRUDLivraria.Orders ";
        conn = new ConexaoBD().Conectadatabase();
        try {
            int i=1;
            PS = conn.prepareStatement(sql);
            RS = PS.executeQuery();
            while (RS.next()){
                OrderDTO order= new OrderDTO();
                order.setId(RS.getInt("Id"));              
                //order.setUser(RS.getObject(i,UserDTO));
                //order.setBook(RS.getObject(i,BookDTO));
                //order.setShipper(RS.getObject(i,ShipperDTO));

                lista.add(order);
            }
            PS.close();
           

        } catch (Exception e) {
            System.out.println("Deu ruim para Listar a ORDER \n" + e.getMessage());
        } 
        return lista;
    }
    public void Editar(OrderDTO order){
        String sql = "UPDATE CRUDLivraria.Orders set UserId = ?, BookId = ?, ShippeInfoId = ? WHERE IdOrder = ?";
        conn = new ConexaoBD().Conectadatabase();
        try {
            if(order.getUser() != 0 && order.getBook() != 0 && order.getShippeInfo() != 0){
                PS = conn.prepareStatement(sql);
                PS.setObject(1, order.getUser());
                PS.setObject(2, order.getBook());
                PS.setObject(3, order.getShippeInfo());
                PS.setInt(4, order.getId());
                PS.execute();
                PS.close();
            }else{
                System.out.println("Digite todos os campos");
            }
        } catch (Exception e) {
            System.out.println("Deu ruim para editar a ORDER\n" + e.getMessage());
        }
    }
    public void Excluir(OrderDTO order){
        String sql = "DELETE FROM CRUDLivraria.Orders WHERE IdOrder = ?";
        conn = new ConexaoBD().Conectadatabase();
        try {
            PS = conn.prepareStatement(sql);
            PS.setInt(1, order.getId());
            PS.execute();
            PS.close();
        } catch (Exception e) {
            System.out.println("Deu ruim para Apagar a ORDER\n" + e.getMessage());
        }
    }
}
