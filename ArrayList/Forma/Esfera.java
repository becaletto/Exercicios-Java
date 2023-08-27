public class Esfera extends FormaTriDimensional{

    public Esfera(double lado) {
        super(lado);
    }

    public double CalcArea(){
        area=4*3.14*lado*lado;
        return area;
    }

    public double CalcVolume(){
        volume=(4*3.14*lado*lado*lado)/3;
        return volume;
    }

}
