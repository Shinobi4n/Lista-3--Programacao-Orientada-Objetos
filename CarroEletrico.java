public class CarroEletrico extends Veiculo implements Eletrico {

    public CarroEletrico(String modelo, double velocidadeAtual) {
        super(modelo, velocidadeAtual);
    }

    @Override
    public void acelerar() {
        velocidadeAtual += 15;
        System.out.println("Carro: " + modelo + ", Velocidade: " + velocidadeAtual + " km/h");

    }

    @Override
    public void carregarBateria() {
        System.out.println("Carro " + modelo + " carregando bateria!");
    }

}
