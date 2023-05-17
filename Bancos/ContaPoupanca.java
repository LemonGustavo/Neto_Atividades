package Bancos;

public class ContaPoupanca  extends ContaBancaria {
    public ContaPoupanca (float saldo) {
        this.saldo = saldo;
    }

    private float limite;

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(float quantia) {
        boolean analise = false;
        if (quantia > limite) {
            System.out.println("Não foi possível sacar esse valor");
            if (quantia > saldo) {
            System.out.println("Não foi possível sacar esse valor");
        }} else if (quantia <= limite) {
            System.out.println("Realizando sua transferência");
            saldo -= quantia;
            System.out.println("Restam R$"+saldo+" na conta");
            return analise = true;
        }
        return analise;
    }
}
