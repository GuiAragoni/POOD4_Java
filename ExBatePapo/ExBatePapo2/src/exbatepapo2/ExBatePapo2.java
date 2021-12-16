/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exbatepapo2;
import java.util.Scanner;
/**
 *
 * @author Guilherme Aragoni
 */
public class ExBatePapo2 {

    public static void main(String[] args) {
        
        Servidor servidor = null;

        
        Buffer mensagensServidorEnvio=new Buffer(10);
        Buffer mensagensServidorRecepcao=new Buffer(10);
        ServidorSocket servidorSocket=new ServidorSocket(8889);
        servidorSocket.conect();
        
        if (servidorSocket.getSocket() != null) {
            servidor = new Servidor(mensagensServidorEnvio, servidorSocket.getSocket());
        }

        Scanner leitor = new Scanner(System.in);
        
        while (true) {
            String texto = leitor.next();
            servidor.enviarMensagem("Servidor: @ " + texto);
            
            System.out.println(mensagensServidorRecepcao.get());
            // System.out.println(mensagensServidorRecepcao.get());
        }
          
    }
    
}
