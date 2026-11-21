public class MainProdutoIV {

    public static void main(String[] args) {

        try {

            ProdutoIV[] produto = new ProdutoIV[2];

            produto[0] = new ProdutoFisicoIV("Carteira de Trabalho", 1);
            produto[1] = new ProdutoDigitalIV("E-titulo", 200);

            for (int i = 0; i < produto.length; i++) {

                System.out.println("Produto: " + produto[i].nome);

                System.out.println(
                        "Preço final: R$ " + produto[i].calcularPrecoFinal());
            }

            ProdutoDigitalIV digital = (ProdutoDigitalIV) produto[1];

            System.out.println(
                    "Preço com desconto: R$ " +
                            digital.aplicarDesconto(10));

            ProdutoIV invalido = new ProdutoFisicoIV("Livro", -50);

        } catch (PrecoInvalidoExceptionIV e) {

            System.out.println("Erro: " + e.getMessage());
        }
    }
}
