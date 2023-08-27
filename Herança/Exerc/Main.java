
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Eduardo");
        p1.setCpf(12345);

        Aluno al1 = new Aluno();
        al1.setNome("Matheus");
        al1.setCpf(3456);
        al1.setRa(111);

        Prof prof1 = new Prof();
        prof1.setNome("Ricardo Neves Biazzi");
        prof1.setCpf(555);
        prof1.setSalario(10000);

        Bolsista b1 = new Bolsista();
        b1.setNome("Pericles");
        double mediaB = b1.calcMedia(4,3);
        b1.setCpf(12325);
        b1.setRa(111);
        b1.setSalario(10000);

        p1.mostra();
        System.out.println("--------------");
        al1.mostra();
        System.out.println("--------------");
        b1.mostra();
        System.out.println("--------------");



    }
}