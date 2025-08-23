public class Carro {
    String marca;
    String modelo;
    int ano;
    Motor motor;

    void exibirDetalhesCarro(){
        System.out.println("Informações do Carro:\n");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano + "\n");
        System.out.println("---------------------------------------");
        System.out.println("Informações do Motor:\n");
        motor.exibirDetalhesMotor();
    }

}
