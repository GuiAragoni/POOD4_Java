/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exbatepapormi;
    
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author Guilherme Aragoni
 */
public interface IServerMSG {    
    void enviarMensagemCliente(String msg) throws RemoteException;
    void enviarMensagemServidor(String msg) throws RemoteException;
    public String getMsg() throws RemoteException;
    public void setMsg(String msg)throws RemoteException;
// 
}

