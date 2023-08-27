import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Quadrado quad = new Quadrado(10);
        Triangulo tri = new Triangulo(30, 2);
        Circulo circ = new Circulo(4);

        Cubo cb = new Cubo(10);
        Esfera esf = new Esfera(20);
        Tetraedo tet = new Tetraedo(10);


        ArrayList<Forma> forma = new ArrayList<Forma>();

        forma.add(quad);
        forma.add(tri);
        forma.add(circ);
        forma.add(cb);
        forma.add(esf);
        forma.add(tet);

        for(Forma i: forma){
            if(i instanceof FormaBiDimensional){
                 if (i instanceof Quadrado){
                     ((Quadrado) i).CalcArea();
                 }
                 else{
                     if (i instanceof Triangulo){
                         ((Triangulo) i).CalcArea();
                     }
                     else {
                         if(i instanceof Circulo){
                         }
                     }
                 }
            }

            else{
                System.out.println();
                System.out.println();
            }

        }








    }
}