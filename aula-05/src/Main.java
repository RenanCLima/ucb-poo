/*  Sobrecarga de método tem diferença na assinatura do método
    Sobrescrita de método tem a mesma assinatura do método */

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor();
        autor1.setEmailAutor("tolkien@gmail.com");
        autor1.setCPFAutor("043.321.233-32");
        autor1.setNomeAutor("J. J. Tolkien");

        Ebook ebook1 = new Ebook(autor1);
        ebook1.setNome("O Senhor dos Anéis");
        ebook1.setDescricao("Uma história medieval de fantasia");
        ebook1.setValor(120);
        ebook1.setIsbn("434212412");

        LivroFisico fisico1 = new LivroFisico(autor1);
        fisico1.setNome("O Senhor dos Anéis");
        fisico1.setDescricao("Uma história medieval de fantasia");
        fisico1.setValor(250);
        fisico1.setIsbn("434212412");
        fisico1.setTaxaImpressao(5);

        CarrinhoCompras carrinho1 = new CarrinhoCompras();
        carrinho1.adicionarLivro(ebook1);
        carrinho1.adicionarLivro(fisico1);
        System.out.println("Valor total: " + carrinho1.getValorTotal());


    }
}