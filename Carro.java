public class Carro extends Veiculo {

    public Carro(String modelo, double velocidadeAtual) {
        super(modelo, velocidadeAtual);
    }

    @Override
    public void acelerar() {
        velocidadeAtual += 10;
        System.out.println("Carro: " + modelo + ", Velocidade: " + velocidadeAtual + " km/h");

    }

}
