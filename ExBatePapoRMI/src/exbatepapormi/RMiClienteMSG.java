/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exbatepapormi;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
/**
 *
 * @author Guilherme Aragoni
 */
public class RMiClienteMSG {
    static IServerMSG mensagem;
    
    public static void conectar() throws NotBoundException, MalformedURLException, RemoteException{
        
        System.setProperty("java.security.policy","file:./politicas.policy");
      //  if (System.getSecurityManager() == null)
      //      System.setSecurityManager(new RMISecurityManager());
        
        
        Registry registry =LocateRegistry.getRegistry("127.0.0.1",5003);
        mensagem=(IServerMSG) registry.lookup("MensagemService");
        
    }   
    
    
    public IServerMSG getMensagemBuffer(){
        return mensagem;
    }
}
