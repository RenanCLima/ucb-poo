public class Gato extends Animal {

    Gato(String nome){
        super(nome);
    }

    @Override
    public void fazerSom(){
        System.out.println("Mia");
    }
}