public abstract class Animal {
    protected String nome;

    // Construtores
    Animal(String nome){
        this.nome = nome;
    }

    // Métodos
    abstract void fazerSom();

    public void dormir(){
        System.out.println("O animal: " + getNome() + " está dormindo");
    }

    public void exibirDetalhes(){
        dormir();
        fazerSom();
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
