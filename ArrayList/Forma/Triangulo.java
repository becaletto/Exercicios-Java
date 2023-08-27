public class Triangulo extends FormaBiDimensional{

    private double altura;

    public Triangulo(double lado, double altura) {
        super(lado);
        this.altura = altura;
    }

    public double CalcArea() {
        area = ((lado*altura)/2);
        return area;
    }
}
