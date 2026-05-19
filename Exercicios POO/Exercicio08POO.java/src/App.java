//Nome: Caio Martins Pertence
//Matrícula: 1261935273

public class App {
    public static void main(String[] args) {
        Personagem heroi = new Personagem();

        heroi.nome = "Aragorn";
        heroi.classe = "Guerreiro";
        heroi.nivel = 5;
        heroi.ptsVidaMax = 100;
        heroi.ptsVida = 100;
        heroi.ataque = 35;
        heroi.defesa = 20;

        Personagem inimigo = new Personagem();

        inimigo.nome = "Orc Selvagem";
        inimigo.classe = "Inimigo";
        inimigo.nivel = 3;
        inimigo.ptsVidaMax = 60;
        inimigo.ptsVida = 60;
        inimigo.ataque = 25;
        inimigo.defesa = 10;

        heroi.atacar(inimigo);
        inimigo.atacar(heroi);
        heroi.exibirStatus();;
        inimigo.exibirStatus();
    }
}
