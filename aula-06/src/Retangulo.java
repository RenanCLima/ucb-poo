public class Retangulo extends FormaGeometrica{
    // Atributos
    private double largura;
    private double altura;

    // Construtores
    Retangulo(String cor, double largura, double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    // Métodos
    @Override
    public double calcularArea(){
        return getAltura() * getLargura();
    }

    // Getters
    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }
}
