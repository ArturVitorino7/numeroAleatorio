import java.util.Scanner;

public class leitura {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("digite o filme que deseja assistir");
         String filme = leitura.nextLine();
        System.out.println("Ano de lançamento do filme");
        int anoDelançamento = leitura.nextInt();
        System.out.println("Qual a avaliação do filme");
        double avaliação = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDelançamento);
        System.out.println(avaliação);

    }
}
