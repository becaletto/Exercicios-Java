public class Popança {
    private static double taxaJurosAnual;
    private double saldo;

    public static double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public static void setTaxaJurosAnual(double taxaJurosAnual) {
        Popança.taxaJurosAnual = taxaJurosAnual;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Popança(double saldo) {
        this.saldo = saldo;
    }

    public void calcJurosMensais() {
        saldo = saldo+(saldo*taxaJurosAnual)/12;
        System.out.println(saldo);
    }

        public static void modificaTaxaJuro(double NtaxaJurosAnual) {
            taxaJurosAnual = NtaxaJurosAnual ;
        }




    }

