/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jardim;


public class Flor {
    private Petala petala, petala2;
    public void setPetala(Petala x, Petala y){
        this.petala=x;
        this.petala2=y;
    }
    public boolean verPetala(){
        if(petala==null){
            return false;
        }
        return true;
    }
    public String getcorPetala(){
        return petala.getCor();
    }
    public int getComprimento(){
        return petala.getComprimento();
    }
    public String getcorPetala2(){
        return petala2.getCor();
    }
    public int getComprimento2(){
        return petala2.getComprimento();
    }
    
}
