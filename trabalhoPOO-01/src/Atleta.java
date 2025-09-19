public class Atleta extends Pessoa {
    // Atributos
    private String esportePraticado;

    // Construtores
    public Atleta() {
    }

    // Polimorfismo de Sobrecarga
    public Atleta(String nome, double peso, double altura, String esportePraticado) {
        super(nome, peso, altura);
        this.esportePraticado = esportePraticado;
    }

    // Métodos
    // Polimorfismo de Sobrescrita
    @Override
    public double calculadoraIMC() {
        return (getPeso() / (getAltura() * getAltura())) * 0.95;
    }

    @Override
    public void mostrarDetalhes(){
        System.out.println("Informações do Atleta:");
        System.out.println("Nome da pessoa: " + getNome());
        System.out.println("Peso: " + getPeso() + "kg");
        System.out.println("Altura: " + getAltura() + "m");
        System.out.println("Esporte Praticado: " + getEsportePraticado());
        System.out.println("IMC: " + calculadoraIMC());
        System.out.println("---------------------------------------");
    }

    // Getters e Setters
    public String getEsportePraticado() {
        return esportePraticado;
    }

    public void setEsportePraticado(String esportePraticado) {
        this.esportePraticado = esportePraticado;
    }
}
