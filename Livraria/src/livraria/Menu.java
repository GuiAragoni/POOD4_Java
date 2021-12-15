/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livraria;
import java.util.Scanner;
import DTO.*;
import DAO.*;
import java.util.ArrayList;
/**
 *
 * @author Guilherme Aragoni
 */
public class Menu {
    int op=1;
    int opin=1;
    Scanner ler = new Scanner( System.in );
    public Menu() {
        System.out.println("Bem vindo, o que deseja gerenciar");
        System.out.println("1-Livros ---- 2-Usuarios ---- 3-Entregadora ---- 4-Pedidos");
        op=ler.nextInt();
        switch(op){
            case 1:
                System.out.println("O que deseja gerenciar sobre os livros");
                System.out.println("1-Inserir ---- 2-Listar ---- 3-Editar ---- 4-Excluir");
                opin=ler.nextInt();
                switch(opin){
                    case 1:
                        BookDTO book = new BookDTO();
                        System.out.println("Nome");
                        book.setNome(ler.nextLine());
                        ler.nextLine();
                        System.out.println("autor");
                        book.setAuthor(ler.nextLine());
                        ler.nextLine();
                        System.out.println("Publi");
                        book.setPublisher(ler.nextLine());
                        ler.nextLine();
                        System.out.println("Ano");
                        book.setAno(ler.nextInt());

                        BookDAO novoBook= new BookDAO();
                        novoBook.Inserir(book);
                        
                    case 2:
                        ArrayList<BookDTO> Lista = new ArrayList<BookDTO>();
                        BookDAO bookDAO = new BookDAO();
                        Lista = bookDAO.Listar();
                        for (BookDTO model : Lista) {
                            System.out.println(model.getId()+" - "+ model.getNome());
                        }
                        break;
                    case 3:
                        ArrayList<BookDTO> Editar = new ArrayList<BookDTO>();
                        BookDAO velhoBook = new BookDAO();
                        Editar = velhoBook.Listar();
                        for (BookDTO model : Editar) {
                            System.out.println(model.getId()+" - "+ model.getNome());
                        }
                        System.out.println("Qual dos Id(s) acima vc deseja editar?");
                        BookDTO bookEdt = new BookDTO();
                        bookEdt.setId(ler.nextInt());
                        bookEdt.setNome(ler.nextLine());
                        bookEdt.setAuthor(ler.nextLine());
                        bookEdt.setPublisher(ler.nextLine());
                        bookEdt.setAno(ler.nextInt());
                        break;
                    case 4:
                        ArrayList<BookDTO> Deletar = new ArrayList<BookDTO>();
                        BookDAO bookDLT = new BookDAO();
                        Deletar = bookDLT.Listar();
                        for (BookDTO model : Deletar) {
                            System.out.println(model.getId()+" - "+ model.getNome());
                        }
                        System.out.println("Qual dos Id(s) acima vc deseja Deletar?");
                        BookDTO bookDelete = new BookDTO();
                        bookDelete.setId(ler.nextInt());
                        break;
                }
                
        }
       
        
    }
    
}
