import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Erro de compilação -> Tentativa de instanciar um objeto de classe abstrata
        // FormaGeometrica quadrado = new FormaGeometrica("Azul")


        // Instanciação de Objetos
        Circulo circulo = new Circulo("Azul", 3.0);
        Retangulo retangulo = new Retangulo("Verde", 4.0, 5.0);

        // Criação de Array com Objetos
        List<FormaGeometrica> listaFormas = new ArrayList<>();
        listaFormas.add(circulo);
        listaFormas.add(retangulo);

        // Loop que percorre a listaFormas e exibe detalhes
        for (FormaGeometrica forma: listaFormas) {
            forma.exibirDetalhes();
        }

    }
}