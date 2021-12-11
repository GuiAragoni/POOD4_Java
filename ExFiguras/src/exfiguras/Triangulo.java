
package exfiguras;

public class Triangulo extends Figuras {
    private int a,b,c;
    private float area;

    public float Area(){
        a=3;
        b=4;
        c=5;
        area = 6;
        return area;
    }
    public void Draw(){
        System.out.println("Desenhando Triangulo");
        System.out.println("A area do Triangulo é " + Area());
    }
    
}
