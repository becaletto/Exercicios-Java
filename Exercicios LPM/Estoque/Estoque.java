public class Estoque
{
    private String nome;
    private int qtdatual,qtdmin;


    public Estoque()
    {
        nome ="";
        qtdatual=0;
        qtdmin =0;

    }

    public Estoque (String n,int a,int m)
    {
        nome=n;
        qtdatual=a;
        qtdmin=m;

    }

    public String getNome()
    {
        return nome;
    }

    public int getQtdatual()
    {
        return qtdatual;
    }

    public int getQtdmin()
    {
        return qtdmin;
    }

    public void setNome(String nome)
    {

        this.nome = nome;
    }

    public void setQtdatual(int qtdatual)
    {
        if(qtdatual>0)
        {
            this.qtdatual = qtdatual;
        }else
        {
            this.qtdatual=0;
        }

    }

    public void setQtdmin(int qtdmin)
    {
        if(qtdmin>0)
        {
            this.qtdmin = qtdmin;
        }else
        {
            this.qtdmin=0;
        }

    }

    public String Mostra()

    {
        return("Nome: " + nome + " / " + "Quantidade atual:" + " / " + qtdatual + " /" + "Quantidade Minima:" + qtdmin +" ") ;

    }

    public void Repor(int qtdadq)

    {
        this.qtdatual=this.qtdatual+qtdadq;
    }

    public void Darbaixa(int qtdadq)
    {
        this.qtdatual=this.qtdatual-qtdadq;
    }

    public boolean Precisarepor()

    {
        if(qtdatual<=qtdmin)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
