public class Imovel {
    protected int codigo;
    protected double preco;
    protected String endereco;

    protected Imovel(int codigo, double preco, String endereco){
        this.codigo = codigo;
        this.preco = preco;
        this.endereco = endereco;
    }

    public void apresentar() {
        System.out.println(getCodigo());
        System.out.println(getEndereco());
        System.out.println(getPreco());
        System.out.println();;
    }

    public double valortotal(){
        return preco;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
