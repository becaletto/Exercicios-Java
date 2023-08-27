public class Funcionario
{
    private String nome, sobrenome;
    private double sm, sa;

    public Funcionario()
    {
        nome = "";
        sobrenome = "";
        sm = 0.0;
    }

    public Funcionario(String a, String b, double c)
    {
        nome = a;
        sobrenome = b;
        if (c > 0)
        {
            sm = c;
        }
        else
        {
            sm = 0;
        }

    }


    public void apresentar()
    {
        System.out.println(nome + " " + sobrenome);
        System.out.println(sm);

    }
    public void salarioAnual()
    {
        sa = (sm*12);
        System.out.println("Salario anual: R$" + sa);
    }

    public void aumentoSalario()
    {
        System.out.println("Com um aumento de 10%, o salario anual foi para: R$" + sa * 1.1 + "\n");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSm() {
        return sm;
    }

    public void Setsm(double sm)
    {
        if (sm > 0)
        {
            this.sm = sm;
        }
        else
        {
            this.sm = 0.0;
        }
    }
}