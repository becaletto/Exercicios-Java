import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {


        Comum c1 = new Comum(20);
        Vip v1 = new Vip(50, 40);
        double total = 0;

        c1.imprimirValor();
        v1.imprimirValor();

        ArrayList<Ingresso> lista = new ArrayList<Ingresso>();
        lista.add(c1);
        lista.add(v1);

        for(Ingresso i:lista){
            total=total+i.getValor();
        }
        System.out.println(total);


         
    }
}