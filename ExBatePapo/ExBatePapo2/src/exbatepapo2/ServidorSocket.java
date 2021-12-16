/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exbatepapo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author felip
 */
public class ServidorSocket{
    	
        Socket socket;
        ServerSocket serverSocket;
        int porta;
        
        public ServidorSocket(int porta){
            this.porta=porta;
        }

        public void conect(){
                try {
                    
                    serverSocket=new ServerSocket(porta);
                    socket=serverSocket.accept();
                    
                } catch (IOException ex) {
                    ex.getStackTrace();
                }
	}
        
        public Socket getSocket(){
            return socket;
        }
    
};
