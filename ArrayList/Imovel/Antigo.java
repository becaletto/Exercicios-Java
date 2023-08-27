public class Antigo extends Imovel{

    public Antigo(String endereco, double preco, double diferenca) {
        super(endereco, preco, diferenca);
        this.preco=this.preco-diferenca;
    }


}
