public class LivroFisico extends Livro{

    private double taxaImpressao;

    public LivroFisico(Autor autor) {
        super(autor);
    }

    @Override
    public void mostrarDetalhes(){
        String mensagem = "Detalhes do livro: ";
        System.out.println(mensagem);
        System.out.println("Nome: " + getNome());
        System.out.println("Descricao: " + getDescricao());
        System.out.println("Valor: " + getValor());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Taxa de impressão: " + getTaxaImpressao() );
        System.out.println("------------");

        if(temAutor()){
            this.getAutor().mostrarDetalhesAutor();
        }

        System.out.println("-----------");
    }

    @Override
    public boolean aplicarDesconto(double porcentagem){
        if (porcentagem > 10){
            System.out.println("Desconto não pod ser maior que 10%");
            return false;
        }
        return super.aplicarDesconto(porcentagem);
    }

    //Getters and Setters
    public double getTaxaImpressao() {
        return this.getValor() * 5 /100 ;
    }

    public void setTaxaImpressao(double taxaImpressao) {
        this.taxaImpressao = taxaImpressao;
    }

}