public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {

        if (nome.isBlank()) {
            throw new IllegalArgumentException("O precisa ser preenchido!");
        }

        if (preco <= 0) {
            throw new IllegalArgumentException("Preço deve ser maior que zero!");
        }

        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa!");
        }

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
