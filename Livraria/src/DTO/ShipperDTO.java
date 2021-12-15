/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Guilherme Aragoni
 */
public class ShipperDTO {
    private int Id;
    private String ShipperNome;
    private String Endereco;
    private int Numero;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getShipperNome() {
        return ShipperNome;
    }

    public void setShipperNome(String ShipperName) {
        this.ShipperNome = ShipperName;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

 
    
}
