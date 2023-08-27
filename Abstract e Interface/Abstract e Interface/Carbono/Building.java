public abstract class  Building implements CarbonFootprint {
    private int numLampadas, numPessoas;
    private boolean usoDeEnergiaRenovavel, usoDeArCondicionado;

    public int getNumLampadas() {
        return numLampadas;
    }

    public void setNumLampadas(int numLampadas) {
        this.numLampadas = numLampadas;
    }

    public int getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

    public boolean isUsoDeEnergiaRenovavel() {
        return usoDeEnergiaRenovavel;
    }

    public void setUsoDeEnergiaRenovavel(boolean usoDeEnergiaRenovavel) {
        this.usoDeEnergiaRenovavel = usoDeEnergiaRenovavel;
    }

    public boolean isUsoDeArCondicionado() {
        return usoDeArCondicionado;
    }

    public void setUsoDeArCondicionado(boolean usoDeArCondicionado) {
        this.usoDeArCondicionado = usoDeArCondicionado;
    }

    @Override
    public double getCarbonFootprint() {
        return 150;
    }
}
