public class PagamentoBoleto implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento com boleto: R$ " + valor);
    }

}
