//Nome: Caio Pertence
//Matrícula: 1261935273

public class ContaBancaria {
    
    String titular;
    String numeroConta;
    double saldo;

    void depositar(double valor){
        if (valor > 0){
            saldo += valor;
        }
    }

    void sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
        } else{
            System.out.println("Saldo insuficiente");
        }
    }

    void exibirExtrato(){
        System.out.println("====== Extrato ======");
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("=====================");
    }
}
