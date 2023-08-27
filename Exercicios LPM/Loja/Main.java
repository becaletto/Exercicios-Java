public class Main {
    public static void main(String[] args) {

        Item i1 = new Item (1234, 5, "Mousepad Fortrek", 15.0);
        Item i2 = new Item (5678, 5, "Teclado RedDragon", 50.0);
        Item i3 = new Item (9101, 0, "Mouse LogiTec", 30.0);

        i1.mostrar();
        System.out.println("Total: R$"+i1.getTotal());
        System.out.println();

        i2.mostrar();
        System.out.println("Total: R$"+i2.getTotal());
        System.out.println();

        i3.mostrar();
        System.out.println("Total: R$"+i3.getTotal());


    }
}
