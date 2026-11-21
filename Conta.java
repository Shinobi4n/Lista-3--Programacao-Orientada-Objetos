public class Conta {

    private int numero;
    private double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void transferir(Conta destino, double valor)
            throws SaldoInsuficienteException {

        if (destino == null) {
            throw new IllegalArgumentException("Conta de destino inválida!");
        }

        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero!");
        }

        if (saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente!");
        }

        saldo -= valor;
        destino.saldo += valor;

        System.out.println("Transferência realizada!");
    }

    public void exibirSaldo() {
        System.out.println("Conta: " + numero + ", Saldo: R$ " + saldo);
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
