public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void sacar(double valor) {

        double total = valor + 2.0;

        if (valor > 0 && saldo >= total) {
            saldo -= total;
        }

    }
}
