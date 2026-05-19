//Nome: Caio Martins Pertence
//Matrícula: 1261935273

public class Pedido {
    int numeroPedido;
    String nomeCliente;
    Hamburguer item1;
    Hamburguer item2;
    boolean pago;

    public double calcularTotal(){
        double total = 0;
        if(item1 != null){
            total += item1.preco;
        }
        if(item2 != null){
            total += item2.preco;
        }
        return total;
    }

    public void pagar(){
        pago = true;
        System.out.println("O pedido foi pago com sucesso!");
    }

    public void exibirPedido(){
        System.out.println("===== PEDIDO #" + numeroPedido + " =====");
        System.out.println("Cliente: " + nomeCliente);
        if(item1 != null){
            System.out.println("Item 1: " + item1.nome + " R$" + item1.preco);
        }
        if(item2 != null){
            System.out.println("Item 2: " + item2.nome + " R$" + item2.preco);
        }
        System.out.println("Total: R$" + calcularTotal());
        if(pago){
            System.out.println("Status: PAGO");
        } else{
            System.out.println("Status: PENDENTE");
        }
    }
}
