//Nome: Caio Pertence
//Matrícula: 1261935273

public class Filme {
    String titulo;
    String diretor;
    int anoLancamento;
    int duracao;
    double nota;
    int horas;
    int minutos;

    String duracaoCompleta(){
        horas = duracao / 60;
        minutos = duracao % 60;
        return horas + "h " + minutos + "min";
    }

    boolean recomendado(){
        return nota >= 7.0;
    }
    
    void exibirDetalhes(){
        System.out.println("Título: " + titulo + " (" + anoLancamento + ")");
        System.out.println("Diretor: " + diretor);
        System.out.println("Duração: " + duracaoCompleta());
        System.out.println("Nota: " + nota);
        
        if(recomendado()){
            System.out.println("Recomendado: SIM");
        } else{
            System.out.println("Recomendado: NAO");
        }
    }
}
