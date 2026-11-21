public class MainVeiculo {

    public static void main(String[] args) {

        Carro carro = new Carro("BYD", 0);
        CarroEletrico eletrico = new CarroEletrico("Gurgel", 0);

        System.out.println();
        carro.acelerar();
        carro.acelerar();
        System.out.println();

        eletrico.acelerar();
        eletrico.acelerar();

        eletrico.carregarBateria();

    }

}
