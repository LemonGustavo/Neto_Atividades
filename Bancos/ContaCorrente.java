package Bancos;

public class ContaCorrente extends ContaBancaria{
    public ContaCorrente (float saldo) {
        super();
        this.saldo = saldo;
    }

    @Override
    public boolean sacar (float quantia) {
        boolean analise = false;
        if (saldo < quantia) {
            System.out.println("Saldo insuficiente");
        } else {
            System.out.println("Saldo suficiente!");
            saldo -= quantia;
            System.out.println("Restam R$"+saldo+" na sua conta");
            analise = true;
        }
        return analise;
    }

}
