public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }

    }

}