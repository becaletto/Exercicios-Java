public class Item
{
    private int cod, quant;
    private String desc;

    private double preco, total;

    public Item (int a, int b, String c, double d)
    {
        cod = a;
        if(b > 0)
        {
            quant = b;
        }
        else
        {
            quant = 0;
        }
        desc = c;
        preco = d;
    }

    public void mostrar()
    {
        System.out.println(desc);
        System.out.println("Código:"+cod);
        System.out.println("Quantidade:"+quant);
        System.out.println("Preço: R$:"+preco);
    }
    public double getTotal()
    {
        return quant * preco;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
