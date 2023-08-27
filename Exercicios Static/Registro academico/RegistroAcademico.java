public class RegistroAcademico {

    private String nome;
    private static int numeroMatricula = 0;
    private int codigoCurso;
    private double percentualCobranca;

    public RegistroAcademico(String nome, int codigoCurso, double percentualCobranca) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.percentualCobranca = percentualCobranca;
        numeroMatricula++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getNumeroMatricula() {
        return numeroMatricula;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public double getPercentualCobranca() {
        return percentualCobranca;
    }

    public void setPercentualCobranca(double percentualCobranca) {
        this.percentualCobranca = percentualCobranca;
    }
}
