// Nome: Caio Martins Pertence
// Matrícula: 1261935273

public class Carro { 
    public String marca;
    public String modelo;
    public int ano;

    private int velocidade;

    public Carro() {
    }

    public void acelerar(int velTempo) {
        velocidade += velTempo;
    }

    public void frear(int velTempo) {
        velocidade -= velTempo;
    }

    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidade);
    }
    
}

