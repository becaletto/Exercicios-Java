public class Tetraedo extends FormaTriDimensional{


    public Tetraedo(double lado) {
        super(lado);
    }

    public double CalcArea(){
            area=(lado*lado)*1.73;
            return area;
        }

        public double CalcVolume(){
            volume=((lado*lado*lado)*1.41)/12;
            return volume;
        }

    }

