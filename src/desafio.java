import java.util.Scanner;

public class desafio {
    static void main(String[] args) {
        String nome = "Walter white";
        String tipoDaConta = "corrente";
        double saldoDaConta = 1250000;
        int opcao = 0;

        System.out.println("****************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("tipo da conta: " + tipoDaConta);
        System.out.println("saldo total: " + saldoDaConta);
        System.out.println("\n****************");

        String menu = """
                ** Digite sua opção                
                1- Consultar o saldo
                2- Transferir saldo
                3- Receber saldo
                4- Sair
                
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("o saldo da conta é de R$" + saldoDaConta);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja enviar ");
               double valor = leitura.nextDouble();
               if (valor > saldoDaConta) {
                   System.out.println("Não foi possivel concluir a transferência");
               } else {
                double saldoTotal = saldoDaConta - valor;
                   System.out.println("o Saldo atualizado é de R$" + saldoTotal);
               }
            } else if (opcao == 3) {
                System.out.println("valor recebido: ");
            double valorRecebido = leitura.nextDouble();
            double saldoTotal = saldoDaConta + valorRecebido;
                System.out.println("o Saldo atual é de R$: " + saldoTotal);

            } else if (opcao != 4) {
                System.out.println("opção invalida");
            }
        }
    }
}
