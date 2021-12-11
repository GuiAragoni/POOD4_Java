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
public class Ex1 {

    
    public static void main(String[] args) {   
        int XY[];
        Retangulo r= new Retangulo(2,4,8,2);// (x,y) = (2,4); (x1,y1) = (8,2) 
        System.out.println("Area "+r.getArea());
        Retangulo r1= new Retangulo(5,3,7,1);// (x,y) = (5,3); (x1,y1) = (7,1)
        System.out.println("Area "+r1.getArea());
        System.out.println("Area entre "+r.getAreaDiff(r1));
    }  
}
