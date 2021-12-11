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
public class Circulo extends Figuras {
    private int raio;
    private float area;
    
    public void Draw(){
        System.out.println("Desenhando Circulo");
        System.out.println("A area do Circulo é " + Area());
    }
    public float Area(){
        raio = 4;
        area = (float)50.24;
        return area;
    } 
    
}
