public class Circulo extends FormaBiDimensional{

    private double pi=3.14;

    public Circulo(double lado) {
        super(lado);
    }

    public double CalcArea() {
        area = ((lado * lado)*pi);
        return area;
    }
}
