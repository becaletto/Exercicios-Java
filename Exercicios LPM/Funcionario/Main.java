public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("João", "Silva", 1000);
        Funcionario f2 = new Funcionario("Maria", "Souza", -1000);

        f1.apresentar();
        f1.salarioAnual();
        f1.aumentoSalario();

        f2.apresentar();
        f2.salarioAnual();
        f2.aumentoSalario();

    }
}