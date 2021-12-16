/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exbatepapormi;


import java.util.Scanner;
/**
 *
 * @author Guilherme Aragoni
 */
public class ExBatePapoRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RMIClientMSG cliente=new RMIClientMSG();
        ServerMSG mensg = new ServerMSG("");

        cliente.conectar();
       
        
        Scanner scanner= new Scanner(System.in);
        String nome;
        String mensagem;
        String msgGeral;
        try{

               System.out.println("Informe seu Nome:");
               nome=scanner.nextLine();
               
               System.out.println("Insira a mesagem que deseja enviar ao Servidor:");
               mensagem=scanner.nextLine();
               
               msgGeral="Olá meu nome é "+nome+", "+mensagem;
               cliente.getMensagemBuffer().enviarMensagemServidor(msgGeral);
               
               while(true){
                   System.out.print("Mensagem: ");
                   msgGeral=scanner.nextLine();
                   cliente.getMensagemBuffer().enviarMensagemServidor(msgGeral);
                   System.out.println("Mensagem do servidor:"+cliente.getMensagemBuffer().getMsg());
               }
           }catch(Exception e){
               e.printStackTrace();
           }
        
        
    }
    
}
