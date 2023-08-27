public class Main {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Becaletto", 202193, 16, 1.70);
        a1.apresentar();
        a1.estudar();


        Disciplina d1 = new Disciplina("Java", "Priscila", 30);

        d1.apresentar();
        d1.mudarProf();
        d1.aumentarCargaH();
    }

}