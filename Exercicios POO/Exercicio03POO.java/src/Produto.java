//Nome: Caio Pertence
//Matrícula: 1261935273

public class Produto {


    String nome;
    double preco;
    int qtdEstoque;

    void vender (int quantidade){
        if (quantidade <= qtdEstoque){
            qtdEstoque -= quantidade;
        } else{
            System.out.println("Estoque insuficiente!");
        }
    }

    void repor (int quantidade){
        qtdEstoque += quantidade;
    }

    double calcularTotal(){
        return preco * qtdEstoque;
    }

    public void exibirDados(){
        System.out.println("Produto: " + nome + " | Preço: " + preco + " | Estoque: " + qtdEstoque + " unidades");
        System.out.println("Valor total em estoque: R$" + calcularTotal());
    }
}
