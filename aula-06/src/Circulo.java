public class Circulo extends FormaGeometrica{
    // Atributos
    private double raio;

    // Construtores
    Circulo (String cor, double raio){
        super(cor);
        this.raio = raio;
    }

    // Métodos
    @Override
    public double calcularArea(){
        return Math.PI * getRaio() * getRaio();
    }

    // Getters
    public double getRaio() {
        return raio;
    }
}
