/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exbiblioteca;

import Classes.*;

/*
 @author Guilherme Aragoni
 */
public class ExBiblioteca {
    
    public static void main(String[] args) {
        Author author = new Author();
        author.setName("Guilherme");
        
        Publisher publisher = new Publisher();
        publisher.setName("VeracidadeNova");
        
        Book book = new Book();
        book.setAuthor(author);
        book.setName("Code");
        book.setAno(2021);     
        book.setPublisher(publisher);
        
        Account account = new Account();
        account.setEmailAddress("Phoebe@gmail.com");
        account.setID(01);
        account.setPassowrd("1234");
        
        Customer user = new Customer();
        user.setName("Regina Falange");
        user.setAccount(account);
        
        Shipper shipper = new Shipper();
        shipper.setName("Vapit Vupit");
        
        ShipperInfo shipperInfo = new ShipperInfo();
        shipperInfo.setEndereco("Rua Dom Carvalho Viana Nunes");
        shipperInfo.setNumero(77);
        shipperInfo.setShipper(shipper);
        
        BillingInfo billingInfo = new BillingInfo();
        Order order = new Order();
        order.setID(01);
        order.setBook(book);
        order.setUser(user);
        order.setShippeInfo(shipperInfo);
        order.setBillingInfo(billingInfo);        
        
        
        if (account.validateLogin(01,"1234")){
            System.out.println("Pedido de ID: "+ order.getID());
            System.out.println("User: "+ order.getUser().getName());
            System.out.println("Livro: "+ order.getBook().getName()+" ano: "+ order.getBook().getAno());
        }
    }
    
}
