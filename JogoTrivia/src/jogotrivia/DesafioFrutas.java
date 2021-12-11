/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogotrivia;

import java.util.Scanner;

/**
 *
 * @author Guilherme Aragoni
 */
public class DesafioFrutas {
    String[] perguntas=new String[3];
    String[] respostas=new String[3];
    boolean[] resp=new boolean[3];
    
    public DesafioFrutas(){
        perguntas[0]="Fruta da cor Vermela?";
        perguntas[1]="Fruta da cor Laranja?";
        perguntas[2]="Fruta da cor Vinho?";
        respostas[0]="maça";
        respostas[1]="laranja";
        respostas[2]="uva";
        for(int i= 0; i<3;i++){
            resp[i]=false;
        }
    }
    private void imorimePergunta(){
    }
    
    public void ExeJogo(){
        int per=(int) (Math.random()*3);
        
        System.out.println(perguntas[per]);
        Scanner read=new Scanner(System.in);
        String resposta = read.next();
        
        if(resposta.toLowerCase().equals(this.respostas[per])){
            System.out.println("Acertou ");
        }else{
            System.out.println("Trolo");
        }
       
        
        
    }
}
