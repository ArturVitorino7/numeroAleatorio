import java.util.Scanner;

public class calculoDeArea {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        while ( escolha != 3);
        System.out.println("menu de escolha");
        System.out.println("1. area do quadrado");
        System.out.println("2. area do circulo");
        System.out.println("3. sair");

        escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("calcular area do quadrado");
        } else if (escolha == 2) {
            System.out.println("calcular area do circulo");
        } else if (escolha == 3) {
            System.out.println("sair do menu");

        }
    }

    public static class Calculador {
        public Calculador() {
        }

        static void main(String[] args) {
            int dinheiro = 100000;
            boolean shape = false;

            if (shape == true && dinheiro >= 50000) {
                System.out.println("Tá sobrando pro betinha");
            } else System.out.println("Não sobrou nada");




        }
        }
}

