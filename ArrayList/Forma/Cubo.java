public class Cubo extends FormaTriDimensional{


    public Cubo(double lado) {
        super(lado);
    }

    public double CalcArea(){
        area=lado*lado*6;
        return area;
    }

    public double CalcVolume(){
        volume=lado*lado*lado;
        return volume;
    }

}
