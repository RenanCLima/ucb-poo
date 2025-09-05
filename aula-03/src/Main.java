public class Main {
    public static void main(String[] args) {

        // Autor 1
        Autor autor1 = new Autor();
        autor1.setNomeAutor("J.R.R Tolkien");
        autor1.setEmailAutor("jrrtolkien@gmail.com");
        autor1.setCPFAutor("123.456.789-00");

        // Autor 2
        Autor autor2 = new Autor();
        autor2.setNomeAutor("J.K Rowling");
        autor2.setEmailAutor("jkrowling@gmail.com");
        autor2.setCPFAutor("123.456.799-00");

        // Livro 1
        Livro livro1 = new Livro();
        livro1.setNome("O Senhor dos Anéis");
        livro1.setDescricao("Uma história de fantasia medieval");
        livro1.setValor(200);
        livro1.setIsbn("123-456-78-9");

        // Livro 2
        Livro livro2 = new Livro();
        livro2.setNome("Harry Potter e a Pedra Filosofal");
        livro2.setDescricao("Uma historia de magia e mistério");
        livro2.setValor(300);
        livro2.setIsbn("123-456-56-9");

        // Colocando os autores nos objetos livros
        livro1.setAutor(autor1);
        livro2.setAutor(autor2);

        // Detalhes de ambos os livros
        livro1.mostrarDetalhes();
        livro2.mostrarDetalhes();

        // Aplicando descontos nos livros
        livro1.aplicarDesconto(20);
        livro2.aplicarDesconto(15);

        // Mostrando alteração no custo dos livros
        System.out.println("O livro agora custa: " + livro1.getValor());
        System.out.println("O livro agora custa: " + livro2.getValor());

        // Mostrando que ambos os livros apresentam autor
        System.out.println(livro1.temAutor());
        System.out.println(livro2.temAutor());

        // Mostrando apenas algum dado específico do autor do livro
        System.out.println("O nome do autor de '" + livro1.getNome() + "' é: " + livro1.getAutor().getNomeAutor());
        System.out.println("O nome do autor de '" + livro2.getNome() + "' é: " + livro2.getAutor().getNomeAutor());
        System.out.println("O CPF do autor de '" + livro1.getNome() + "' é: " + livro1.getAutor().getCPFAutor());
        System.out.println("O CPF do autor de '" + livro2.getNome() + "' é: " + livro2.getAutor().getCPFAutor());

    }
}