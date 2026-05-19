//Nome: Caio Pertence
//Matrícula: 1261935273

public class App {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Carlos Souza";
        conta.numeroConta = "0042-7";
        conta.saldo = 0;
        conta.depositar(1500.0);
        conta.depositar(250.0);
        conta.sacar(300.0);
        conta.exibirExtrato();
    }
}
