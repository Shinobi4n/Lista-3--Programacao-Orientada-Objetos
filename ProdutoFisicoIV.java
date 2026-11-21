public class ProdutoFisicoIV extends ProdutoIV {

    public ProdutoFisicoIV(String nome, double precoBase) throws PrecoInvalidoExceptionIV {

        super(nome, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase + 15;
    }
}
