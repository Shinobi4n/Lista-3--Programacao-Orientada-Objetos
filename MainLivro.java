public class MainLivro {

    public static void main(String[] args) {

        Livro livro = new Livro("Manifesto Comunista", 150);

        for (int i = 0; i < 151; i++) {

            try {

                livro.emprestar();

            } catch (LivroIndisponivelException e) {

                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

}
