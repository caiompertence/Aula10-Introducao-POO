//Nome: Caio Martins Pertence
//Matrícula: 1261935273

public class Jogador {
    String nome;
    String posicao;
    int numeroCamisa;
    int gols;

    public void marcarGol(){
        gols++;
        System.out.println("GOOOOL! " + nome + " marcou! Total: " + gols + " gols.");
    }

    public void exibirJogador(){
        System.out.println(nome + " | " + posicao + " | Camisa " + numeroCamisa + " | Gols: " + gols);
    }
}
