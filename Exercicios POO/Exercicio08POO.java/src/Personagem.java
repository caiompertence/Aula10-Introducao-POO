//Nome: Caio Martins Pertence
//Matrícula: 1261935273

public class Personagem {
    String nome;
    String classe;
    int nivel;
    int ptsVida;
    int ptsVidaMax;
    int ataque;
    int defesa;

    public void atacar (Personagem alvo){
        int dano = ataque - alvo.defesa;
        if(dano < 1){
            dano = 1;
        }
        alvo.receberDano(dano);
        System.out.println(nome + " atacou " + alvo.nome + " causando " + dano + " de dano." );
    }

    public void receberDano(int dano){
        ptsVida -= dano;
        if(ptsVida < 0){
            ptsVida = 0;
        }
    }

    public void curar(int valor){
        ptsVida += valor;
        if(ptsVida > ptsVidaMax){
            ptsVida = ptsVidaMax;
        }
        System.out.println(nome + " recuperou vida.");
    }

    public boolean estaVivo(){
        return ptsVida > 0;
    }

    public void subirNivel(){
        nivel++;
        ataque += 5;
        defesa += 3;
        ptsVidaMax += 10;
        ptsVida = ptsVidaMax;
        System.out.println(nome + " subiu para o nível " + nivel);
    }

    public void exibirStatus(){
        System.out.println("[" + nome + " - " + classe + " Nv. " + nivel + "]");
        System.out.println("HP: " + ptsVida + "/" + ptsVidaMax);
        System.out.println("ATK: " + ataque);
        System.out.println("DEF: " + defesa);
    }
}
