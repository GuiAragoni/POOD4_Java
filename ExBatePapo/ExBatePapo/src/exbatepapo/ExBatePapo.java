/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exbatepapo;
import java.util.Scanner;
/**
 *
 * @author Guilherme Aragoni
 */
public class ExBatePapo {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Cliente cliente = null;

        Buffer mensagensClienteEnvio = new Buffer(10);
        Buffer mensagensClienteRecepcao = new Buffer(10);
        ClienteSocket clienteSocket = new ClienteSocket("127.0.0.1", 8889);

        clienteSocket.conect();

        if (clienteSocket.getSocket() != null) {
            cliente = new Cliente(mensagensClienteRecepcao, clienteSocket.getSocket());
            cliente = new Cliente(mensagensClienteEnvio, clienteSocket.getSocket());

        }

        Scanner leitor = new Scanner(System.in);

        while (true) {
            String texto = leitor.nextLine();
            cliente.enviarMensagem("Cliente: @ " + texto);
            
            System.out.println(mensagensClienteRecepcao.get());
            String [] dados = mensagensClienteRecepcao.get().split("@");
            System.out.println("Nome: " + dados[0] + "  " + "Mensagem: " + dados[1]);
            System.out.println(mensagensClienteRecepcao.get());
        }

    }
    
}
