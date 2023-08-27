import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Popança p1 = new Popança(2000);
        Popança p2 = new Popança(3000);

        Popança.modificaTaxaJuro(0.03);
        p1.calcJurosMensais();
        p2.calcJurosMensais();

    }
}