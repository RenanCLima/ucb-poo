public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor; // Composição = uma classe dentro de outra classe


    void mostrarDetalhesLivro(){
        String mensagem = "Detalhes do livro";
        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        System.out.println("------------------------------------");
        autor.mostrarDetalhesAutor();
        System.out.println("------------------------------------");
    }
}

