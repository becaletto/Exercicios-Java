public class Preguica extends Animal {
    private String sobe;


    public Preguica(int idade, String nome, String som, String sobe) {
        super(idade, nome, som);
        this.sobe = sobe;
    }

    public String getSobe() {
        return sobe;
    }

    public void setSobe(String sobe) {
        this.sobe = sobe;
    }
}
