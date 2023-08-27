
public class Prof extends Pessoa {
    private double salario;

    public void mostra()
    {
        super.mostra();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
