public class MainTransferenciaBancaria {

    public static void main(String[] args) {

        Conta Capitalista = new Conta(1, 1000000000);
        Conta Proletario = new Conta(2, 500);

        try {

            Capitalista.transferir(Proletario, 1000000000);

            Capitalista.transferir(Proletario, 1);

        } catch (SaldoInsuficienteException e) {

            System.out.println("Erro: " + e.getMessage());

        } catch (IllegalArgumentException e) {

            System.out.println("Erro: " + e.getMessage());
        }

        Capitalista.exibirSaldo();
        Proletario.exibirSaldo();
    }
}
