//Nome: Caio Pertence
//Matrícula: 1261935273

public class App {
    public static void main(String[] args) {
        Pet pet = new Pet();

        pet.nome = "Thor";
        pet.especie = "Cachorro";
        pet.raca = "Golden Retriever";
        pet.idade = 10;
        pet.peso = 32;

        pet.apresentar();

        pet.avaliarPeso(30);
    }
}
