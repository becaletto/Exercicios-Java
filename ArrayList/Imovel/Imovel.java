public class Imovel {

    protected String endereco;
    protected double preco;
    protected double diferenca;


    public void ImprimeDads(){
        System.out.println("Endereço: " + endereco);
        System.out.println("Preço: " + preco);
    }


    public Imovel(String endereco, double preco, double diferenca) {
        this.endereco = endereco;
        this.preco = preco;
        this.diferenca = diferenca;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDiferenca() {
        return diferenca;
    }

    public void setDiferenca(double diferenca) {
        this.diferenca = diferenca;
    }
}
