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
public class OrderDTO {
    private int Id;
    private int User;
    private int Book;
    private int ShippeInfo;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getUser() {
        return User;
    }

    public void setUser(int User) {
        this.User = User;
    }

    public int getBook() {
        return Book;
    }

    public void setBook(int Book) {
        this.Book = Book;
    }

    public int getShippeInfo() {
        return ShippeInfo;
    }

    public void setShippeInfo(int ShippeInfo) {
        this.ShippeInfo = ShippeInfo;
    }

    
    
}
