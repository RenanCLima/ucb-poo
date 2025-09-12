public class CarrinhoCompras {

    private double valorTotal;

    public void adicionarLivro(Livro livro){
        System.out.println("Livro adicionado ao carrinho: " + livro);
            livro.aplicarDesconto(5);
            valorTotal += livro.getValor();
    }

    //Getter
    public double getValorTotal() {
        return valorTotal;
    }
}
