public class Pessoa {

    private String nome;
    private int idd, dia, mes, ano;



    public Pessoa(int b, int c, int d)
    {

        //DIA
        if ((b >= 1 ) && (b <= 31))
        {
            dia = b;
        }
        else
            dia = 1;

        //MES
        if ((c >= 1 ) && (c <= 12))
        {
            mes = c;
        }
        else
            mes = 1;

        //ANO
        if (d >= 1000)
        {
            ano = d;
        }
        else
            ano = 1000;
    }

    public Pessoa(String a, int b, int c, int d)
    {

        //DIA
        if ((b >= 1 ) && (b <= 31))
        {
            dia = b;
        }
        else
            dia = 1;

        //MES
        if ((c >= 1 ) && (c <= 12))
        {
            mes = c;
        }
        else
            mes = 1;

        //ANO
        if (d >= 1000)
        {
            ano = d;
        }
        else
            ano = 1000;
    }

    public void calculaIdade()
    {
        idd = 2023-ano;
    }

    public String informaNome ()
    {
        return nome;

    }

    public int informaIdade ()
    {
        return idd;

    }


    {
        public String getNome () {
        return nome;
    }

        public void setNome (String nome){
        this.nome = nome;
    }

        public int getIdd () {
        return idd;
    }

        public void setIdd ( int idd){
        this.idd = idd;
    }

        public int getDia () {
        return dia;
    }

        public void setDia ( int dia){
        if ((dia >= 1 ) && (dia <= 31))
        {
            this.dia = dia;
        }
        else
            dia = 1;


    }

        public int getMes () {
        return mes;
    }

        public void setMes ( int mes){
        if ((mes >= 1 ) && (mes <= 12))
        {
            this.mes = mes;
        }
        else
            mes = 1;

    }

        public int getAno () {
        return ano;
    }

        public void setAno(int ano){
        if (ano>= 1000)
        {
            this.ano = ano;
        }
        else
            ano = 1000;

    }
    }
}
