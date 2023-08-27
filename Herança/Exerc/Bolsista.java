
public class Bolsista extends Aluno {
    private double salario;

    public void mostra()
    {
        super.mostra();
        System.out.println(this.salario);
    }

    public double calcMedia(double nota1, double nota2) {
        double media;
        media = (super.calcMedia(nota1,nota2))+1;
        return media;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
