public class Cavalo extends Animal{
    private String correr;

    public Cavalo(int idade, String nome, String som, String correr) {
        super(idade, nome, som);
        this.correr = correr;
    }

    public String getCorrer() {
        return correr;
    }

    public void setCorrer(String correr) {
        this.correr = correr;
    }
}
