/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exfiguras;

/**
 *
 * @author Guilherme Aragoni
 */
public class Retangulo extends Figuras {
    private float area;
    private int ladoA,ladoB;
    
    public float Area(){
        ladoA = 4;
        ladoB = 5;
        area = 20;
        return area;
    }
    public void Draw(){
        System.out.println("Desenhando Retangulo");
        System.out.println("A area do Retangulo é " + Area());
    }
}
