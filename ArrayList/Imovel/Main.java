import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Imovel n1 = new Novo("Rua 1", 50, 30);
        Imovel a1 = new Antigo("Rua 7", 50, 20);

        ArrayList<Imovel> lista = new ArrayList<Imovel>();
        lista.add(n1);
        lista.add(a1);

        for(Imovel i: lista){
            if(i instanceof Novo){
                i.ImprimeDads();
            }

        }


    }
}