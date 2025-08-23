/*      1 - Crie um programa que calcule a soma de 2 números inteiros e exiba o resultado.
        2 - Calcule a média de 3 notas e verifique se é maior ou igual a 7.0
        3 - Faça um programa que receba 2 números e exiba se os 2 números são positivos
        4 - Crie um programa que peça um número e mostre a tabuada de 1 a 10
        5 - Faça um programa que exiba todos os números pares de 0 a 50 utilizando o "for"    */

import java.util.Scanner; //Biblioteca necessária para input em Java

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Insira um número de 1 a 5\n" +
                "1 - Soma entre 2 números\n" +
                "2 - Média de 3 números\n" +
                "3 - Insira 2 números para conferir se são positivos\n" +
                "4 - Insira um número e veja a tabuada dele, de 1 a 10\n" +
                "5 - Veja todos os números pares de 0 a 50\n");

        System.out.print("Insira o número aqui: ");
        int selecao = sc.nextInt();

        switch (selecao) {
            case 1: {
                System.out.println("Item 1 selecionado");
                System.out.println("Insira o primeiro número inteiro: ");
                int num1 = sc.nextInt();
                System.out.println("Insira o segundo número inteiro: ");
                int num2 = sc.nextInt();
                int num3 = num1 + num2;
                System.out.printf("A soma entre os números inseridos é: %d", num3);
                break;
            }

            case 2: {
                System.out.println("Item 2 selecionado");
                System.out.println("Insira o primeiro número: ");
                double num1 = sc.nextDouble();
                System.out.println("Insira o segundo número: ");
                double num2 = sc.nextDouble();
                System.out.println("Insira o terceiro número: ");
                double num3 = sc.nextDouble();
                double media = (num1 + num2 + num3) / 3;
                System.out.printf("A media entre os números inseridos é: %f \n", media);
                if (media >= 7.0) {
                    System.out.println("Sua média é maior que 7.0");
                } else {
                    System.out.println("Sua média é menor que 7.0");
                }
                break;
            }

            case 3: {
                System.out.println("Item 3 selecionado");
                System.out.println("Insira o primeiro número: ");
                double num1 = sc.nextDouble();
                System.out.println("Insira o segundo número: ");
                double num2 = sc.nextDouble();


                if (num1 >= 0 && num2 >= 0) {
                    System.out.println("Ambos os números são positivos!");
                } else {
                    System.out.println("Pelo menos um dos números é negativo ou igual a zero");
                }
                break;
            }

            case 4: {
                System.out.println("Item 4 selecionado");
                System.out.println("Insira o número inteiro: ");
                int num1 = sc.nextInt();


                for (int i = 0; i <= 10; i++) {
                    int valor = num1 * i;
                    System.out.printf("%d x %d = %d\n",num1,i,valor);


                }
                break;
            }

            case 5: {
                System.out.println("Item 5 selecionado");

                for (int i = 0; i <= 50; i++) {
                    if (i != 0 && i % 2 == 0) {
                        System.out.println(i);
                    }
                }
                break;
            }

            default: {
                System.out.println("Número inválido");
            }
        }
    }
}
