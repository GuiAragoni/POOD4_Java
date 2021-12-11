/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;
/**
 *
 * @author Guilherme Aragoni
 */
public class Retangulo {
    private int lado_A, lado_B;
    private int x,y;
    private int x1,y1;
    public Retangulo(int x, int y,int x1, int y1){
        this.x=x;
        this.y=y;
        this.x1=x1;
        this.y1=y1;
        this.lado_A=Math.abs(x1-x);
        this.lado_B=Math.abs(y-y1);
    }
    public int getLadoA(){
        return lado_A;
    }
    public int getLadoB(){
        return lado_B;
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getX1(){
        return x1;
    }
    public int getY1(){
        return y1;
    }
    
    public int getArea(){
        if(lado_A<=0 || lado_B<=0){
            return 0;
        }
        return lado_A*lado_B;
    }                               
    public int getAreaDiff(Retangulo ret){
        int i,x=0,y=0,x1=0,y1=0;
        for(i=this.x;i<=this.x1;i++){
            if(i==ret.getX()){
                x=i;
                break;
            }
            else{
                x = this.x1;
            }
        }
        for(i=this.x;i<=this.x1;i++){
            if(i==ret.getX1()){
                x1=i;
                break;
            }
            else{
                x1 = this.x1;
            }
        }
        for(i=this.y;i>=this.y1;i--){
            if(i==ret.getY()){
                y=i;
                break;
            }
            else{
                y = this.y1;
            }
        }
        for(i=this.y;i>=this.y1;i--){
            if(i==ret.getY1()){
                y1=i;
                break;
            }
            else{
                y1 = this.y1;
            }
        }
        Retangulo Dentro = new Retangulo(x,y,x1,y1);
        return (getArea() - Dentro.getArea());
    }
}
