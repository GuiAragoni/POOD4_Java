/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

   A função de editar e apagar não está funcionando, infelizmente não consegui fazer certo 
 */
package cadastrolista;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class CadastroLista {

    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        
        Scanner ler = new Scanner (System.in);
        
        int op=1;
        while(op!=0){
            System.out.println("O que deseja fazer? \n1-Cadastrar \n2-Listar \n3-Editar \n4-Deletar \n0-Sair");
            op = ler.nextInt();
                if(op == 1) {
                    Funcionario Novo = new Funcionario();
                    System.out.println("Digite o Id:");
                    Novo.setId(ler.nextInt());
                    ler.nextLine();
                    
                    System.out.println("Digite o Nome:");
                    Novo.setNome(ler.nextLine());
                    
                    System.out.println("Digite o Email:");
                    Novo.setEmail(ler.nextLine());
                    
                    System.out.println("Digite a Idade:");
                    Novo.setIdade(ler.nextInt());
                    
                    ler.nextLine();
                    funcionarios.add(Novo);
                }
                if(op == 2) {
                    funcionarios.forEach(new Consumer<Funcionario>() {
                        @Override
                        public void accept(Funcionario x) {
                           System.out.println("Nome:" + x.getNome());
                           System.out.println("Email:" + x.getEmail());
                           System.out.println("Idade:" + x.getIdade());
                        }
                    });
                }
                if(op == 3) {
                    int id = ler.nextInt();
                    funcionarios.forEach(new Consumer<Funcionario>() {
                        @Override
                        public void accept(Funcionario x) {
                           if(id == x.getId()){
                                Funcionario Novo = x;
                                System.out.println("Digite o novo Id:");
                                Novo.setId(ler.nextInt());
                                ler.nextLine();
                                
                                System.out.println("Digite o novo Nome:");
                                Novo.setNome(ler.nextLine());
                                
                                System.out.println("Digite o novo Email:");
                                Novo.setEmail(ler.nextLine());
                                
                                System.out.println("Digite a novo Idade:");
                                Novo.setIdade(ler.nextInt());
                                
                                funcionarios.add(Novo);
                           }
                        }
                    });
                    System.out.println("Funcionario Encontrado");

                }
                if(op == 4) {
                    int id2 = ler.nextInt();
                    funcionarios.forEach(new Consumer<Funcionario>() {
                        @Override
                        public void accept(Funcionario x) {
                           if(id2 == x.getId()){
                                funcionarios.remove(x);
                           }
                        }
                    });
                }
            }
    }
}
