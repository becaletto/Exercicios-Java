import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        
        Comissionado c1 = new Comissionado("Eduardo", "Portela", 1234, 5000, 0.30);
        Comissionado c2 = new Comissionado("Du", "Vieira", 333, 10000, 0.25);

        Assalariado a1 = new Assalariado("Matheus", "Gracini", 5678, 1320);

        Horista h1 = new Horista("Enzo", "Lucco", 9101, 12, 160);

        ArrayList <Empregado> lista = new ArrayList<Empregado>();
        lista.add(c1);
        lista.add(c2);
        lista.add(a1);
        lista.add(h1);

        for(Empregado e: lista) {

            if (e instanceof Comissionado){
                System.out.println(((Comissionado) e).getTotalVenda());
                double total = 0;
                total = total + ((Comissionado) e).getTotalVenda();
               

            }
        }



    }
}