public class ProdutoDigitalIV extends ProdutoIV implements DescontavelIV {

    public ProdutoDigitalIV(String nome, double precoBase) throws PrecoInvalidoExceptionIV {
        super(nome, precoBase);

    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase;
    }

    @Override
    public double aplicarDesconto(double percentual) {

        return precoBase - (precoBase * percentual / 100);
    }

}
