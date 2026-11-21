public class PagamentoCartao implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento com cartão: R$ " + valor);
    }

}
