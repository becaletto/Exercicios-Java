public class Main {

    public static void main(String[] args) {
        RegistroAcademico aluno1 = new RegistroAcademico("João Silva", 1, 75.0);
        RegistroAcademico aluno2 = new RegistroAcademico("Maria Souza", 2, 80.0);

        System.out.println("Número de matrícula de " + aluno1.getNome() + ": " + RegistroAcademico.getNumeroMatricula());
        System.out.println("Número de matrícula de " + aluno2.getNome() + ": " + RegistroAcademico.getNumeroMatricula());

        aluno1.setPercentualCobranca(70.0);

        System.out.println("Percentual de cobrança de " + aluno1.getNome() + ": " + aluno1.getPercentualCobranca());
        System.out.println("Percentual de cobrança de " + aluno2.getNome() + ": " + aluno2.getPercentualCobranca());
    }
}
