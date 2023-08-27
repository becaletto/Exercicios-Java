public class Novo extends Imovel{
    protected double precoAd;

    protected Novo(int codigo, double preco, String endereco) {
        super(codigo, preco, endereco);
    }

    public double valortotal(double precoAd) {
        preco = preco + precoAd;
        return preco;
    }

    public double getPrecoAd() {
        return precoAd;
    }

    public void setPrecoAd(double precoAd) {
        this.precoAd = precoAd;
    }
}


