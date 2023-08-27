public class SimuladorCaixaBanco {
    private static int numeroDoCliente;
    private int numeroDoCaixa;


    public SimuladorCaixaBanco(int n) {
        numeroDoCaixa = n;
        this.numeroDoCliente = numeroDoCliente;
        System.out.println("Caixa "+numeroDoCaixa+" iniciou operação.");
    }


    public void proximoAtendimento()
    {
        numeroDoCliente = numeroDoCliente + 1;
        System.out.print("Cliente com a senha no "+numeroDoCliente+" , favor ");
        System.out.println("dirigir-s ao caixa no "+numeroDoCaixa+".");
    }





    public static int getNumeroDoCliente() {
        return numeroDoCliente;
    }

    public static void setNumeroDoCliente(int numeroDoCliente) {
        SimuladorCaixaBanco.numeroDoCliente = numeroDoCliente;
    }

    public int getNumeroDoCaixa() {
        return numeroDoCaixa;
    }

    public void setNumeroDoCaixa(int numeroDoCaixa) {
        this.numeroDoCaixa = numeroDoCaixa;
    }
}
