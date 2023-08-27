public class Bicycle implements CarbonFootprint{
    private String marca;
    private int tamanhoAro;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanhoAro() {
        return tamanhoAro;
    }

    public void setTamanhoAro(int tamanhoAro) {
        this.tamanhoAro = tamanhoAro;
    }

    @Override
    public double getCarbonFootprint() {
        return 0;
    }
}
