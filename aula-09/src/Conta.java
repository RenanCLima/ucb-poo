class ValorInsuficienteException extends Exception {
    ValorInsuficienteException(String msg) {
        super(msg);
    }
}

public class Conta {
    private double valor;

    Conta(double valor){
        this.valor = valor;
    }

    public void sacar() throws ValorInsuficienteException {
        if (getValor() <= 900){
            throw new ValorInsuficienteException("Saldo Insuficiente para sacar!");

        }
        System.out.println("Saldo suficiente para sacar!");
    }



    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
