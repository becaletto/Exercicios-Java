
public class Aluno extends Pessoa {
    private int ra;

    public void mostra()
    {
        super.mostra();
        System.out.println(this.ra);
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    protected double calcMedia(double nota1, double nota2) {
       double media = ((nota1+nota2)/2);
        return media;
    }
}