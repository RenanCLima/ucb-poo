/* Classes são como "fábricas" de objetos
   Para criar uma classe em Java é necessário colocar class nome-classe {atributos, métodos}
   Objetos são itens com características(atributos) e ações(métodos)
   Para criar um objeto em Java é necessário colocar nome-classe nome-objeto = new nome-classe()
 */
//Esse nome-classe() é o construtor da classe, pode ter classes que exigem atributos para um novo objeto

public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro();
        Autor autor = new Autor();


        livro.nome = "O Senhor dos Anéis";
        livro.descricao = "Uma história de fantasia medieval";
        livro.valor = 139.99;
        livro.isbn = "123-456-78-9";


        autor.nomeAutor = "J. R. R. Tolkien";
        autor.emailAutor = "jtolkien@outlook.com";
        autor.cpfAutor = "928.234.123-92";


        livro.autor = autor;


        livro.mostrarDetalhesLivro();


        Livro outroLivro = new Livro();
        Autor outroAutor = new Autor();


        outroLivro.nome = "Romeu e Julieta";
        outroLivro.descricao = "Uma história de romance e drama";
        outroLivro.valor = 49.99;
        outroLivro.isbn = "824-429-12-9";


        outroAutor.nomeAutor = "Willian Shakespeare";
        outroAutor.emailAutor = "wshakespeare@outlook.com";
        outroAutor.cpfAutor = "053.122.481-11";


        outroLivro.autor = outroAutor;


        outroLivro.mostrarDetalhesLivro();
    }
}
