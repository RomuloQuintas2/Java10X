package desafio001;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }


}
