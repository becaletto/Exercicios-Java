import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CarbonFootprint car1 = new Car();
        CarbonFootprint car2 = new Car();

        CarbonFootprint bike1 = new Bicycle();
        CarbonFootprint bike2 = new Bicycle();

        //CarbonFootprint predio1 = new Building();
        //CarbonFootprint predio2 = new Building();

        CarbonFootprint casa1 = new House();
        CarbonFootprint casa2 = new House();

        CarbonFootprint escola1 = new School();
        CarbonFootprint escola2 = new School();

        ArrayList<CarbonFootprint> lista = new ArrayList<CarbonFootprint>();
        lista.add(car1);
        lista.add(car2);

        lista.add(bike1);
        lista.add(bike2);

        //lista.add(predio1);
        //lista.add(predio2);

        lista.add(casa1);
        lista.add(casa2);

        lista.add(escola1);
        lista.add(escola2);


        for (CarbonFootprint c: lista)
        {

            System.out.println(c.getCarbonFootprint());
            System.out.println();

        }


    }
}