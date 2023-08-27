public class Novo extends Imovel{

    public Novo(String endereco, double preco, double diferenca) {
        super(endereco, preco, diferenca);
        this.preco=this.preco+diferenca;
    }
}
