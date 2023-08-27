public class Animal {
    protected int idade;
    protected String nome;
    protected String som;

    public Animal(int idade, String nome, String som) {
        this.idade = idade;
        this.nome = nome;
        this.som = som;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }


    public void som(){
        System.out.println(getSom());
    }
}
