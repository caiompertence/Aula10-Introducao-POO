public class Celular {

    String marca;
    String modelo;
    int bateria;
    boolean ligado;
    double armazenamentoUsado;
    double armazenamentoTotal;

    void ligar() {
        if (bateria > 0){
            ligado = true;
            System.out.println("Celular ligado.");
        } else{
            System.out.println("Bateria descarregada.");
        }
    }

    void desligar(){
        ligado = false;
        System.out.println("Celular desligado.");
    }

    void carregarBateria(int percentual){

        bateria += percentual;
        if (bateria > 100) {
            bateria = 100;
        }
        System.out.println("Bateria carregada.");
    }

    void usarArmazenamento(double gb) {
        if(armazenamentoUsado + gb <= armazenamentoTotal) {
            armazenamentoUsado += gb;
            System.out.println("Armazenamento utilizado com sucesso.");
        } else{
            System.out.println("Espaço insuficiente.");
        }
    }

    void exibirStatus(){

        System.out.println(marca + " " + modelo);
        if(ligado) {
            System.out.println("Status: LIGADO");
        } else {
            System.out.println("Status: DESLIGADO");
        }
        System.out.println("Bateria: " + bateria + "%");
        System.out.println("Armazenamento: " + armazenamentoUsado + " GB / " + armazenamentoTotal + " GB usados");
    }
}
