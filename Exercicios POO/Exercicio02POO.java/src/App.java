//Nome: Caio Pertence
//Matrícula: 1261935273

public class App {
    public static void main(String[] args) throws Exception {
        
        Aluno aluno = new Aluno ();
        aluno.nome = "Maria Clara";
        aluno.matricula = "2024001";
        aluno.nota1 = 7.5;
        aluno.nota2 = 8.0;

        aluno.calcularMedia();
        aluno.aprovacao();
        aluno.exibirBoletim();
        
    }
}

