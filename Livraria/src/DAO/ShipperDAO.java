/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.ConexaoBD;
import DTO.ShipperDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Guilherme Aragoni
 */
public class ShipperDAO {
    Connection conn;
    PreparedStatement PS;
    ResultSet RS;
    public void Inserir(ShipperDTO shipper){
        String sql = "INSERT INTO CRUDLivraria.Shipper (ShipperNome, Endereco, Numero) VALUES (?, ?, ?)";
        conn = new ConexaoBD().Conectadatabase();
        try {
            PS = conn.prepareStatement(sql);
            PS.setString(1, shipper.getShipperNome());
            PS.setString(2, shipper.getEndereco());
            PS.setInt(3, shipper.getNumero());
            PS.execute();
            PS.close();

        } catch (Exception e) {
            System.out.println("Deu ruim para Cadastrar o Shipper\n" + e.getMessage());
        }
    }
    public ArrayList<ShipperDTO> Listar(){
        ArrayList<ShipperDTO> lista = new ArrayList();
        String sql = "SELECT * FROM CRUDLivraria.Shipper ";
        conn = new ConexaoBD().Conectadatabase();
        try {
            PS = conn.prepareStatement(sql);
            RS = PS.executeQuery();
            while (RS.next()){
                ShipperDTO shipper= new ShipperDTO();
                shipper.setId(RS.getInt("IdShipper"));              
                shipper.setShipperNome (RS.getString("ShipperNome"));
                shipper.setEndereco (RS.getString("Endereco"));
                lista.add(shipper);
            }
            PS.close();
           

        } catch (Exception e) {
            System.out.println("Deu ruim para Listar o Shipper\n" + e.getMessage());
        } 
        return lista;
    }
    public void Editar(ShipperDTO shipper){
        String sql = "UPDATE CRUDLivraria.Shipper set ShipperNome = ?, Endereco = ?, Numero = ? WHERE IdShipper = ?";
        conn = new ConexaoBD().Conectadatabase();
        try {
            if(shipper.getShipperNome() != "" && shipper.getEndereco() != "" && shipper.getNumero() != 0){
                PS = conn.prepareStatement(sql);
                PS.setString(1, shipper.getShipperNome());
                PS.setString(2, shipper.getEndereco());
                PS.setInt(3, shipper.getNumero());
                PS.setInt(4, shipper.getId());
                PS.execute();
                PS.close();
            }else{
                System.out.println("Digite todos os campos");
            }
        } catch (Exception e) {
            System.out.println("Deu ruim para editar o Shipper\n" + e.getMessage());
        }
    }
    public void Excluir(ShipperDTO shipper){
        String sql = "DELETE FROM CRUDLivraria.Shipper WHERE IdShipper = ?";
        conn = new ConexaoBD().Conectadatabase();
        try {
            PS = conn.prepareStatement(sql);
            PS.setInt(1, shipper.getId());
            PS.execute();
            PS.close();
        } catch (Exception e) {
            System.out.println("Deu ruim para Apagar o Shipper\n" + e.getMessage());
        }
    }
}
