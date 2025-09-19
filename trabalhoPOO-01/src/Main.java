public class Main {
    public static void main(String[] args) {
        // Pessoas não atletas
        // Pessoa 1
        Pessoa pessoa1 = new Pessoa("Han Solo", 73.4, 1.79);

        pessoa1.mostrarDetalhes();

        //Pessoa 2
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Jabba the Hutt");
        pessoa2.setPeso(1358);
        pessoa2.setAltura(3.8);

        pessoa2.mostrarDetalhes();


        // Pessoas atletas
        // Pessoa atleta 1
        Atleta atleta1 = new Atleta("Anakin Skywalker", 30.8, 1.36, "Corrida de pods");

        atleta1.mostrarDetalhes();

        // Pessoa atleta 2
        Atleta atleta2 = new Atleta();
        atleta2.setNome("Luke Skywalker");
        atleta2.setPeso(72.8);
        atleta2.setAltura(1.75);
        atleta2.setEsportePraticado("Treino Jedi");

        atleta2.mostrarDetalhes();

    }
}