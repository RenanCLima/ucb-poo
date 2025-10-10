public abstract class FormaGeometrica {
    // Atributos
    protected String cor;

    // Construtores
    public FormaGeometrica(String cor){
        this.cor = cor;
    }

    // Métodos
    public abstract double calcularArea();

    public void exibirCor() {
        System.out.println("A cor da forma é: " + getCor());
    }

    public void exibirDetalhes() {
        exibirCor();
        System.out.println(calcularArea());
        System.out.println("------------------------------------------");
    }

    // Getters
    public String getCor() {
        return cor;
    }
}
