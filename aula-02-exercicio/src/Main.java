/*Desenvolva um programa que represente um **Carro** e seu **Motor**. A classe `Carro` deve conter um objeto da classe `Motor` como parte de sua composição. O programa deve permitir:
1. Criar um carro com um motor, especificando atributos como:
   - Para o carro: marca (String) e ano (int).
   - Para o motor: tipo de combustível (String, ex.: "Gasolina" ou "Diesel") e potência (int, em cavalos).
2. Exibir as informações do carro e de seu motor.
3. Ligar o motor do carro, exibindo uma mensagem indicando que o motor foi ligado.
4. Desligar o motor do carro, exibindo uma mensagem indicando que o motor foi desligado.

Requisitos
- Utilize o conceito de **composição** (o motor é parte integrante do carro e não existe sem ele).
- Não utilize arrays, listas ou qualquer tipo de coleção.
- Crie uma classe principal ('Main') com um método 'main' para testar a funcionalidade. */

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Motor motorCarro1 = new Motor();

        carro1.marca = "Ford";
        carro1.modelo = "Fusion";
        carro1.ano = 2013;

        motorCarro1.combustivel = "Gasolina";
        motorCarro1.potencia = 240;

        carro1.motor = motorCarro1;

        carro1.exibirDetalhesCarro();


        Carro carro2 = new Carro();
        Motor motorCarro2 = new Motor();

        carro2.marca = "Fiat";
        carro2.modelo = "Uno";
        carro2.ano = 2020;

        motorCarro2.combustivel = "Gasolina";
        motorCarro2.potencia = 110;

        carro2.motor = motorCarro2;
        carro2.motor.ligarMotor();

        carro2.exibirDetalhesCarro();


        Carro carro3 = new Carro();
        Motor motorCarro3 = new Motor();

        carro3.marca = "Fiat";
        carro3.modelo = "Gol";
        carro3.ano = 2025;

        motorCarro3.combustivel = "Gasolina";
        motorCarro3.potencia = 120;

        carro3.motor = motorCarro3;

        carro3.motor.ligarMotor();
        carro3.motor.desligarMotor();

        carro3.exibirDetalhesCarro();
    }
}