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
public class Javathread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExThread x = new ExThread("x");
        x.start();
        ExThread v = new ExThread("v");
        v.start();
    }
    
}
