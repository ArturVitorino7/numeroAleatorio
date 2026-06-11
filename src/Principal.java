import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa p1 = new Pessoa("Artur", 17);
        Pessoa p2 = new Pessoa("Cristiano Ronaldo", 41);
        Pessoa p3 = new Pessoa("Mike Tyson", 68);

        listaDePessoas.add(p1);
        listaDePessoas.add(p2);
        listaDePessoas.add(p3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());

        System.out.println("primeira pessoa da lista: " + listaDePessoas.getFirst());
        System.out.println(listaDePessoas);
    }
}