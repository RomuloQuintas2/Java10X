package desafio001;

public abstract class ContaBancaria implements Conta{

    double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public abstract void depositar(double valor);


}
