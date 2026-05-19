//Nome: Caio Martins Pertence
//Matrícula: 1261935273

public class App {
    public static void main(String[] args) {
        Jogador ponta = new Jogador();
        ponta.nome = "Alan Minda 👅";
        ponta.posicao = "Ponta-direita";
        ponta.numeroCamisa = 27;
        ponta.gols = 37;

        Jogador goleiro = new Jogador();
        goleiro.nome = "Everson";
        goleiro.posicao = "Goleiro";
        goleiro.numeroCamisa = 22;
        goleiro.gols = 0;

        Time time = new Time();
        time.nome = "Clube Atlético Mineiro";
        time.cidade = "Belo Horizonte";
        time.titulos = 81;
        time.artilheiro = ponta;
        time.goleiro = goleiro;

        time.apresentarTime();
        time.exibirDestaques();
        ponta.marcarGol();
        time.ganharTitulo("Copa Libertadores da América 2027");
    }
}
