package Bancos;

public abstract class ContaBancaria {
    protected String agencia;
    protected String conta;
    protected float saldo;

    public void depositar (float quantia) {
        saldo += quantia;
    }

    public float getSaldo() {
        return saldo;
    }

    public abstract boolean sacar (float quantia);
}
