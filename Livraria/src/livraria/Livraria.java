/*
 *        
   

 */
package livraria;

import DTO.*;
import DAO.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Guilherme Aragoni
 */
public class Livraria {


    public static void main(String[] args) {
        Scanner ler = new Scanner( System.in );


        UserDTO user = new UserDTO();
        user.setNome("Teste");
        user.setEmail("email@teste.com");
        user.setSenha("Teste123");
        
        UserDAO novoUser = new UserDAO();
        novoUser.Inserir(user);
        
       
        BookDTO book = new BookDTO();
        book.setNome("LivroTeste");
        book.setAuthor("Author");
        book.setPublisher("Publisher");
        book.setAno(2021);
        
        BookDAO novoBook= new BookDAO();
        novoBook.Inserir(book);
        
        
        ShipperDTO shipper = new ShipperDTO();
        shipper.setShipperNome("Sedex");
        shipper.setEndereco("Rua do cliente");
        shipper.setNumero(42);
        
        ShipperDAO novoShipper = new ShipperDAO();
        novoShipper.Inserir(shipper);
        
        
        OrderDTO order = new OrderDTO();
        ArrayList<UserDTO> listaUser = new ArrayList<UserDTO>();
        UserDAO x = new UserDAO();
        listaUser = x.Listar();
        for (UserDTO model : listaUser) {
            System.out.println(model.getId()+" - "+ model.getNome());
        }
        System.out.println("Escolha um Usuario");
        order.setUser(ler.nextInt());
        
        ArrayList<BookDTO> listaBook = new ArrayList<BookDTO>();
        BookDAO x1 = new BookDAO();
        listaBook = x1.Listar();
        for (BookDTO model : listaBook) {
            System.out.println(model.getId()+" - "+ model.getNome());
        }
        System.out.println("Escolha um Livro");
        order.setBook(ler.nextInt());
        
        ArrayList<ShipperDTO> listaShipper = new ArrayList<ShipperDTO>();
        ShipperDAO x2 = new ShipperDAO();
        listaShipper = x2.Listar();
        for (ShipperDTO model : listaShipper) {
            System.out.println(model.getId()+" - "+ model.getShipperNome());
        }
        System.out.println("Escolha uma entregadora");
        order.setShippeInfo(ler.nextInt());
        
        OrderDAO novoOrder = new OrderDAO();
        novoOrder.Inserir(order);
        
        

    }
    
}
