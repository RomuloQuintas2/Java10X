package desafio001;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        double valorComTaxa = valor * 0.99;
        this.saldo += valorComTaxa;
    }

 




}
