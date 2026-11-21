public class MainProduto {

    public static void main(String[] args) {

        try {

            Produto p1 = new Produto("PC GAMER", 10000, 10);

            System.out.println("Nome: " + p1.getNome() + "\n" +
                    "Preço: " + p1.getPreco() + "\n" +
                    "Quantidade: " + p1.getQuantidade());

        } catch (IllegalArgumentException e) {

            System.out.println("Erro no cadastro: " + e.getMessage());
        }

        try {

            Produto p2 = new Produto(" ", 50000, 5);

            System.out.println("Nome: " + p2.getNome() + "\n" +
                    "Preço: " + p2.getPreco() + "\n" +
                    "Quantidade: " + p2.getQuantidade());

        } catch (IllegalArgumentException e) {

            System.out.println("Erro no cadastro: " + e.getMessage());
        }

    }
}
