public abstract class Veiculo {

    protected String modelo;
    protected double velocidadeAtual;

    public Veiculo(String modelo, double velocidadeAtual) {
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
    }

    public abstract void acelerar();

}
