//Nome: Caio Pertence
//Matrícula: 1261935273

public class App {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.titulo = "Interestelar";
        filme.diretor = "Christopher Nolan";
        filme.anoLancamento = 2014;
        filme.duracao = 169;
        filme.nota = 9.2;

        filme.exibirDetalhes();
    }
}
