public class PagamentoPix implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento PIX: R$ " + valor);
    }

}
