import java.util.Random;
import java.util.Scanner;

public class numeroAleatorio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100);
        int palpite = 0;

        int tentativas = 0;
        for (tentativas = 1; tentativas <= 5; tentativas++){
            System.out.println("Digite um numero de 0 a 100");
            palpite = entrada.nextInt();
            if (numeroSecreto == palpite){
                System.out.println("Parabens você acertou");
                break;
            }

            if (numeroSecreto > palpite){
                System.out.println("tente mais alto  ");
            } else{
                System.out.println("Tente mais baixo ");
            }




        }


    }
}
