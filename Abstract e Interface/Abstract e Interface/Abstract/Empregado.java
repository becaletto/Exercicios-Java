public abstract class Empregado {
    protected String nome;
    protected String sobrenome;
    protected int cpf;

    public Empregado(String nome, String sobrenome, int cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public abstract double vencimento();

}
