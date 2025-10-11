import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cachorro pitbull = new Cachorro("Pit Pitbull");
        Cachorro husky = new Cachorro("Friento");

        Gato siames = new Gato("Peludo");
        Gato viralata = new Gato("Fofinho");

        List<Animal> listaAnimais = new ArrayList<>();
        listaAnimais.add(pitbull);
        listaAnimais.add(husky);

    }
}