public class Main {
    public static void main(String[] args) {
        /*  Todo projeto Java se inicia com uma pasta "Main" e precisa do método "public static void main(String[] args){}
        * "Hello World" exige o comando System.out.print("Hello World)
        * Todo fim de linha em Java necessita de um ; */

        System.out.println("Linha 7 - Hello World");

        /* Java é uma linguagem fortemente tipada, toda variável deve ser escrita com: tipo nome
        * os tipos mais comuns são: String, int, double, boolean */

        int x;
        int y;

        // É possível atribuir valor para uma variável com um = sendo possível atribuir após criar a variável ou criá-la com o valor

        x = 42;
        y = 2;
        String z = "Guia do Mochileiro das Galáxias";

        /* Para realizar operações de matemática, o Java apresenta os seguintes operadores + - * / %   */
        int soma = x + y; // soma = 44
        int sub = x - y; // sub = 40
        int mult = x * y; // mult = 84
        int div = x / y; // div = 21
        int res = x % y; // res = 0

        /* Para realizar operações de comparação entre números o Java apresenta os seguintes operadores < > == <= >= != */
        boolean menorQ = y < x; // Expressão Y menor que X, resultado True
        boolean maiorQ = y > x; // Expressão Y maior que X, resultado False
        boolean igual = y == x; // Expressão Y igual X, resultado False
        boolean menorOuIgual = y <= x; // Expressão Y menor ou igual X, resultado True
        boolean maiorOuIgual = y >= x; // Expressão Y aior ou igual X, resultado False
        boolean diferente = y != x; // Expressão Y diferente de X, resultado True

        /* Para realizar condições o Java utiliza if, else, else if, switch */
        // if é um "se" caso a condição tenha valor True, executa a ação
        // else if é um "se" para condições diferentes, seria como utilizar 2 ou mais if
        // else é quando nenhum dos if e else if satisfaz a condição
        // switch case é usado para variáveis que você espera um valor específico
        if (x >= y) { // Escrita do if é if(condição) {ação}; dessa forma utiliza () e também {}
            System.out.println("Linha 42 - X é maior ou igual a Y");
            if (x == y) {
                System.out.println("Linha 44 - X é igual a Y");
            } else if (x > y) { // Escrita do else if é igual a do if
                System.out.println("Linha 46 - X é maior que Y");
            }

        }
        else{ //Escrita do else é else{ação}; visto que só ocorre quando nada satisfaz a condição
            System.out.println("Linha 51 - X é menor que Y");
        }

        switch (x) { /* Escrita do switch é switch(variavel){case:} case é o valor da variável para ocorrer a ação
                     É necessário colocar o break ao fim de um case, caso não coloque roda todos os casos após
                     default é um case caso nenhum satisfaça a condição */
            case 42:
                System.out.println("Linha 58 - X tem o valor 42");
                break;
            case 40:
                System.out.println("Linha 61 - X tem o valor 40");
                break;
            default:
                System.out.println("Linha 64 - X tem um valor diferente de todos os Cases");
        }

        /* é possível concatenar comparações em Java utilizando os seguintes operadores && || */
        if (x != y && x > y) { // && é um AND lógico, um E condicional
            System.out.println("Linha 69 - X é diferente de Y e é maior que Y");
        }
        else if(x == y || x < y){ // || é um OR lógico, um OU condicional
            System.out.println("Linha 72 - X é igual a Y ou X é menor que Y");
        }
        else {
            System.out.println("Linha 75 - Nenhuma condição satisfeita");
        }

        /* Para não reescrever ações, é possível criar loops, há loops do tipo while e do tipo for
           while é usado quando você não sabe exatamente quantas vezes você quer repetir o código
           sua escrita é while(condicao){ação} e isso se repete N vezes, até a condição se tornar false
           for é usado quando você sabe quantas vezes você quer repetir o código
           sua escrita é for(condição){ação}, porém sua condição tem uma peculiaridade:
                condição for = (int i = 0; i < 5; i++) isso quer dizer: (variável;condição;mudança na variável)
                (variável = i; condição = i < 5; mudança = i = i + 1) */
        while(y < x){
            System.out.printf("Linha 86 - Valor de Y é %d\n ", y);
            System.out.println("Linha 87 - Y é menor que X");
            y += 10;
            System.out.printf("Linha 89 - Agora o valor de Y é %d\n ", y);
        }

        for(int i = 0; i < x; i += 20){
            System.out.printf("Linha 93 - O valor de i é: %d\n",i);
        }

    }
}