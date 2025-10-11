public class Cachorro extends Animal {

    Cachorro(String nome){
        super(nome);
    }

    @Override
    public void fazerSom(){
        System.out.println("Latido");
    }
}
