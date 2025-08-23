public class Motor {
    String combustivel;
    int potencia;
    boolean energia;

    void exibirDetalhesMotor(){
        System.out.println("Combustível: " + combustivel);
        System.out.println("Cavalos de Potência: " + potencia);
        if(energia == true){
            System.out.println("Motor está ligado");
        }
        else{
            System.out.println("Motor está desligado");
        }
        System.out.println("---------------------------------------");
    }

    void ligarMotor(){
        System.out.println("O motor do carro foi ligado");
        energia = true;
    }
    void desligarMotor(){
        System.out.println("O motor do carro foi desligado");
        energia = false;
    }
}
