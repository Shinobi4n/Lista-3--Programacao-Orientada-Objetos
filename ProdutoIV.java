public abstract class ProdutoIV {

    protected String nome;
    protected double precoBase;

    public ProdutoIV(String nome, double precoBase) throws PrecoInvalidoExceptionIV {

        if (precoBase <= 0) {
            throw new PrecoInvalidoExceptionIV("Preço inválido!");
        }

        this.nome = nome;
        this.precoBase = precoBase;
    }

    public abstract double calcularPrecoFinal();
}
