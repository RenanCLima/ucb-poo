public class Pessoa {
    // Atributos
    private String nome;
    private double peso; // quilogramas (kg)
    private double altura;  // metros (m)

    // Construtores
    public Pessoa() {
    }

    public Pessoa(String nome, double peso, double altura){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    // Métodos
    public double calculadoraIMC(){
        return getPeso() / (getAltura() * getAltura());
    }

    public void mostrarDetalhes(){
        System.out.println("Informações da Pessoa:");
        System.out.println("Nome da pessoa: " + getNome());
        System.out.println("Peso: " + getPeso() + "kg");
        System.out.println("Altura: " + getAltura() + "m");
        System.out.println("IMC: " + calculadoraIMC());
        System.out.println("---------------------------------------");
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
