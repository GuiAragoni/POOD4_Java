/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathread;

/**
 *
 * @author Guilherme Aragoni
 */
public class ExThread extends Thread{
    public String nome="";
    public ExThread(String nome){
        this.nome=nome;
    }
    public void run(){
        int i=0;
        while(i<100){
            i++;
            System.out.println(this.nome + i);
        }
    }
}
