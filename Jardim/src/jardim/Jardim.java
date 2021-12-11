/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jardim;


public class Jardim {
    private Flor flor, flor2;
    
    public void setFlor(Flor flor, Flor flor2){
        this.flor=flor;
        this.flor2=flor2; 
    }
    
    public Flor getFlor(){
        return flor;
    }
    
    public Flor getFlor2(){
        return flor2;
    }
}
