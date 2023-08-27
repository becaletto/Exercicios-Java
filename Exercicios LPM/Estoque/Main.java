public class Main {
    public static void main(String[] args)
    {
        System.out.println("  ");
        Estoque e1= new Estoque();
        e1.setNome("Impressora");
        System.out.println(e1.getNome());
        System.out.println("quantidade atual: ");
        e1.setQtdatual(13);
        System.out.println(e1.getQtdatual());
        System.out.println("Quantidade minima: ");
        e1.setQtdmin(6);
        System.out.println(e1.getQtdmin());
        e1.Darbaixa(5);
        System.out.println("Precisa repor? ");
        System.out.println(e1.Precisarepor());
        System.out.println(e1.Mostra());

        System.out.println("");

        Estoque e2= new Estoque();
        e2.setNome("Monitor");
        System.out.println(e2.getNome());
        System.out.println("quantidade atual: ");
        e2.setQtdatual(11);
        System.out.println(e2.getQtdatual());
        System.out.println("Quantidade minima: ");
        e2.setQtdmin(13);
        System.out.println(e2.getQtdmin());
        e2.Repor(7);
        System.out.println("Precisa repor? ");
        System.out.println(e2.Precisarepor());
        System.out.println(e2.Mostra());

        System.out.println("");

        Estoque e3= new Estoque();
        e3.setNome("Mouse");
        System.out.println(e3.getNome());
        System.out.println("quantidade atual: ");
        e3.setQtdatual(6);
        System.out.println(e3.getQtdatual());
        System.out.println("Quantidade minima: ");
        e3.setQtdmin(2);
        System.out.println(e3.getQtdmin());
        e3.Darbaixa(4);
        System.out.println("Precisa repor? ");
        System.out.println(e3.Precisarepor());
        System.out.println(e3.Mostra());

    }
}