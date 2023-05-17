package Bancos;

public class CaixaEletronico {
    public static void main(String[] args) {
        //Conta Corrente
        ContaCorrente cr = new ContaCorrente(1000);
        cr.sacar(100);

        //Conta Poupança Impossibilitada
        ContaPoupanca cp = new ContaPoupanca(1000);
        cp.setLimite(100);
        cp.sacar(101);
        //Conta Poupança Liberada
        cp.sacar(100);
    }
}
 