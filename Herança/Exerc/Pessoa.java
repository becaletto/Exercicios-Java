public class Pessoa {
    private String nome;
    private int cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    protected void mostra() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
    }
}