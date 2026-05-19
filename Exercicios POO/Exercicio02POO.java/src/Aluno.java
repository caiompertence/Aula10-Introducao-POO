//Nome: Caio Pertence
//Matrícula: 1261935273

public class Aluno {
    
    public String nome;
    public String matricula;
    public double nota1;
    public double nota2;

    private double media;

    public Aluno() {
    }

    public void calcularMedia () {
        media = (nota1 + nota2) / 2.0;
    }

    public void aprovacao() {

        }
    

    public void exibirBoletim() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Media: " + media);
        if (media >= 6){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
    }
  }
}

