public class MainContaBancaria {

    public static void main(String[] args) {

        ContaBancaria corrente = new ContaCorrente("Aluno", 5000);
        ContaBancaria poupanca = new ContaPoupanca("Aluna", 80000);

        corrente.depositar(3000);
        corrente.sacar(4000);

        poupanca.depositar(400000);
        poupanca.sacar(90000);

        System.out.println("Saldo corrente: " + corrente.saldo);
        System.out.println("Saldo poupança: " + poupanca.saldo);
    }
}
