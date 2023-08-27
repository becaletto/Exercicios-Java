import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int qtdCarta = 0, qtdBola = 0;

        Jogo t1 = new Truco();
        Jogo b1 = new Buraco();
        Jogo f1 = new Futebol();
        Jogo v1 = new Volei();

        ArrayList<Jogo> lista = new ArrayList<Jogo>();
        lista.add(t1);
        lista.add(b1);
        lista.add(f1);
        lista.add(v1);

        for(Jogo e: lista){
            e.iniciar();
            e.jogar();

            if (e instanceof JogoDeCartas){
                qtdCarta++;
            }
            else {
                qtdBola++;
            }

        }
        System.out.println("A quantidade de jogo com bola é" + "" + qtdBola);
        System.out.println("A quantidade de jogo de cartas é" + "" + qtdCarta);






    }
}