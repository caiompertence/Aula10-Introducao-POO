//Nome: Caio Pertence
//Matrícula: 1261935273

public class App {
    public static void main(String[] args) {
        
        Produto produto = new Produto();

        produto.nome = "Caneta Azul";
        produto.preco = 2.50;
        produto.qtdEstoque = 100;

        produto.vender(30);

        produto.exibirDados();

    } 
}
