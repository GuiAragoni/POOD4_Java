/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jardim;

/**
 *
 * @author Guilherme Aragoni
 */
public class Program {
    public static void main(String[] args) {
        
        Petala p1 = new Petala();
        p1.setCor("Verde");
        p1.setComprimento(10);
        
        Petala p2 = new Petala();
        p2.setCor("Amarelo");
        p2.setComprimento(15);
        
        Petala p3 = new Petala();
        p3.setCor("Branco");
        p3.setComprimento(10);
        
        Petala p4 = new Petala();
        p4.setCor("Azul");
        p4.setComprimento(15);
        
        Petala p5 = new Petala();
        p5.setCor("Roxo");
        p5.setComprimento(10);
        
        Petala p6 = new Petala();
        p6.setCor("Rosa");
        p6.setComprimento(15);
        
        Petala p7 = new Petala();
        p7.setCor("Magenta");
        p7.setComprimento(10);
        
        Petala p8 = new Petala();
        p8.setCor("Preto");
        p8.setComprimento(15);
        
        
        Flor f1 = new Flor();
        f1.setPetala(p1,p5);
        Flor f2= new Flor();
        f2.setPetala(p2,p6);
        Flor f3 = new Flor();
        f3.setPetala(p3,p7);
        Flor f4= new Flor();
        f4.setPetala(p4,p8);
        
        Jardim j1 = new Jardim();
        j1.setFlor(f1,f3);
        Jardim j2 = new Jardim();
        j2.setFlor(f2,f4);
        
        Pracinha P1 = new Pracinha();
        P1.setPracinha(j1,j2);
        
        System.out.println("Primeiro Jardim");
        System.out.print("\t1º Flor com petalas de cores "+P1.getJardim().getFlor().getcorPetala());
        System.out.println(" e "+P1.getJardim().getFlor().getcorPetala2());
        System.out.print("\t2º Flor com petalas de cores "+P1.getJardim().getFlor2().getcorPetala());
        System.out.println(" e "+P1.getJardim().getFlor2().getcorPetala2());
        System.out.println("Segundo Jardim");
        System.out.print("\t3º Flor com petalas de cores "+P1.getJardim2().getFlor().getcorPetala());
        System.out.println(" e "+P1.getJardim2().getFlor().getcorPetala2());
        System.out.print("\t4º Flor com petalas de cores "+P1.getJardim2().getFlor2().getcorPetala());
        System.out.println(" e "+P1.getJardim2().getFlor2().getcorPetala2());
    }
    
}
