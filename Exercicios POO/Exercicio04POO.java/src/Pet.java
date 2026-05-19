//Nome: Caio Pertence
//Matrícula: 1261935273

public class Pet {

    String nome;
    String especie;
    String raca;
    int idade;
    double peso;

    void apresentar(){
        System.out.println("Olá! Meu nome é " + nome + ", sou um " + especie + " da raca " + raca);
        System.out.println("Tenho " + idade + " anos e peso " + peso + " kg.");
    }

    void aniversario(){
        idade++;
        System.out.println(nome + "fez aniversario!");
    }

    void avaliarPeso(double pesoIdeal){
        if (peso < pesoIdeal){
            System.out.println(nome + " está abaixo do peso ideal!");
        } else if(peso == pesoIdeal){
            System.out.println(nome + " está no peso ideal!");
        } else {
            System.out.println(nome + " está acima do peso ideal (" + pesoIdeal + ")." );
        }
    }
}
