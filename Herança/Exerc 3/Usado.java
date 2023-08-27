public class Usado extends Imovel{
    protected double desconto;

    protected Usado(int codigo, double preco, String endereco) {
        super(codigo, preco, endereco);
    }

    public double valortotal(double desconto) {
        preco = preco - desconto;
        return preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
