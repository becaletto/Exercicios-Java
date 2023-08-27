public class Disciplina
    {
        private String nome, professor;
        private int cargaH;

        public Disciplina(String a, String b, int c)
        {
            nome = a;
            professor = b;
            cargaH = c;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setProfessor(String professor) {
            this.professor = professor;
        }

        public void setCargaH(int cargaH) {
            this.cargaH = cargaH;
        }

        public String getNome() {
            return nome;
        }

        public String getProfessor() {
            return professor;
        }

        public int getCargaH() {
            return cargaH;
        }

        public void apresentar()
        {
            System.out.println(nome);
            System.out.println(professor);
            System.out.println(cargaH);
        }

        public void mudarProf()
        {
            professor = "Tânia";
            System.out.println(professor);

        }

        public void aumentarCargaH()
        {
            cargaH = 40;
            System.out.println(cargaH);
        }
    }
