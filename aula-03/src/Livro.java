/* Uma boa prática em atributos de objetos é utilizar private, pois isso impede
 a alteração dos valores dos atributos em outras partes do código de forma descontrolada
  Para alterar o valor de um atributo é criado um método "set"
  Para retornar o valor de um atributo é criado um método "get"*/


/* Exemplo de método set:
   void setValor(double valor){
        this.valor = valor;
    }

    Exemplo de método get:
    double getValor(){
        return valor;
    }
*/

/* Todo objeto criado de uma classe é criado por meio de um construtor, esse construtor
    é um método especial que não tem parâmetro nem retorno, porém pode ser adicionado conteúdo
    exigindo algum parâmetro ou simplesmente quando criado algum objeto, apresentar uma mensagem
    informando que foi criado. Ele só serve para inicializar o objeto no momento da criação e
    seu nome é o mesmo da classe que ele inicializa objetos.
*/

/* Exemplo de classe com construtor explícito:
    class Animal {
        private String especie;
        private int idade;
        private double peso;

        Animal(String especie) {
        this.especie = especie;
        System.out.println("Objeto criado, especie = " + especie);
        }
    }
*/
// Nesse caso acima, para criar um objeto da classe animal, é necessário pelo menos o atributo especie, os outros
// podem continuar com o valor nulo e pode ser adicionado o seu valor posteriormente. Quando um objeto da classe
// Animal é criado, é apresentado que foi criado e mostra a especie do objeto.


public class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    // Esse construtor não exige parâmetros, apenas mostra que o objeto foi criado
    Livro(){
        System.out.println("Livro Criado");
    }

    void mostrarDetalhes(){
        String mensagem = "Detalhes do livro: ";
        System.out.println(mensagem);
        System.out.println("Nome: " + getNome());
        System.out.println("Descricao: " + getDescricao());
        System.out.println("Valor: " + getValor());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("------------");


        if(temAutor()){
            autor.mostrarDetalhesAutor();
        }

        System.out.println("-----------");
    }



    boolean temAutor(){
        return autor != null;
    }


    void aplicarDesconto(double porcentagem){
        if(porcentagem > 20){
            System.out.println("Desconto não pode ser maior que 20%");
            return;
        }
        valor -= valor * porcentagem / 100;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
