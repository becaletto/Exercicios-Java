public class Main {
    public static void main(String[] args) {
        Animal c = new Cachorro(5, "Rex","AU", "Corre");
        Animal cv = new Cavalo(17, "Rogerio", "Rilincha","Corre");
        Animal p = new Preguica(30, "Antonio" ,"Dorme","Sobe");

        c.som();
        cv.som();
        p.som();




    }
}