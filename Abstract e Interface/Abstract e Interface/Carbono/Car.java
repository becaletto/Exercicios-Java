public class Car implements CarbonFootprint {
    private String marca;
    private float cilindrada;


    @Override
    public double getCarbonFootprint() {
        return 100;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }
}
