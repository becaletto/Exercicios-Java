public class Aluno
{
    private String nome;
    private int ra, idd;
    private double altura;

    public Aluno(String a, int b, int c, double d)
    {
        nome = a;
        ra = b;
        idd = c;
        altura = d;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getRa() {
        return ra;
    }

    public int getIdd() {
        return idd;
    }

    public double getAltura() {
        return altura;
    }


    public void apresentar ()
    {
        System.out.println(nome);
        System.out.println(ra);
        System.out.println(idd);
        System.out.println(altura);
    }

    public void estudar()
    {
        if(ra < 0) {
            System.out.println("Aluno não matriculado");
        }
        else
            System.out.println("Aluno estudando");
    }

    public void setNome(String becaletto) {
    }
}