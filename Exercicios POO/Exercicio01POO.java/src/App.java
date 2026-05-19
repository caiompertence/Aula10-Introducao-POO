// Nome: Caio Martins Pertence
// Matrícula: 1261935273

public class App {
    public static void main(String[] args) throws Exception {
        Carro meuCarro = new Carro ();
        meuCarro.marca = "Fiat";
        meuCarro.modelo = "Uno";
        meuCarro.ano = 2019;
        
        meuCarro.acelerar(40);
        meuCarro.acelerar(30);
        meuCarro.exibirDados();
        
    }
}

