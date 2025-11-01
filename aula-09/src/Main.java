class DividirPorZeroException extends Exception {
    public DividirPorZeroException(String msg) {
        super(msg);
    }
}

class Calculadora {
    public void dividir(int a, int b) throws DividirPorZeroException {
        if (b == 0) {
            throw new DividirPorZeroException("Não é possível dividir por zero");
        }
        int c = a / b;
    }
}

public class Main{
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        try{
            calculadora.dividir(10,0);
        }

        catch (DividirPorZeroException e){
            System.out.println("Error: " + e.getMessage());

        }


        Conta contausuario1 = new Conta(1650.80);
        Conta contausuario2 = new Conta(123.45);

        try {
            contausuario1.sacar();
        } catch (ValorInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            contausuario2.sacar();
        } catch (ValorInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}