public class Quadrado extends FormaBiDimensional{

    public Quadrado(double lado) {
        super(lado);
    }

    public double CalcArea() {
        area=lado * lado;
        return area;
    }

    }

