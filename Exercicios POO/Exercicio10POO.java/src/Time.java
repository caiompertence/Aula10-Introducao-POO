//Nome: Caio Martins Pertence
//Matrícula: 1261935273

public class Time {
    String nome;
    String cidade;
    int titulos;
    Jogador artilheiro;
    Jogador goleiro;

    public void apresentarTime(){
        System.out.println("⚽ " + nome + " - " + cidade + " | Títulos: " + titulos);
    }

    public void exibirDestaques(){
        System.out.println("=== Destaques ===");
        if(artilheiro != null){
            System.out.println("Artilheiro: ");
            artilheiro.exibirJogador();
        }
        if (goleiro != null){
            System.out.println("Goleiro: ");
            goleiro.exibirJogador();
        }
    }

    public void ganharTitulo(String nomeTitulo){
        titulos++;
        System.out.println("🏆 " + nome + " conquistou " + nomeTitulo + "!");
        System.out.println("Agora possui " + titulos + " titulos!");
    }
}
