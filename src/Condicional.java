import java.util.Scanner;

public class Condicional {
    public double exibirCondicional(int opcao, double saldoInicial, Scanner leitura) {
        switch (opcao) {
            case 1:
                System.out.println("Seu saldo é de R$ " + saldoInicial);
                break;
            case 2:
                System.out.println("Digite o valor a receber: ");
                double valorRecebimento = leitura.nextDouble();

                saldoInicial += valorRecebimento;

                System.out.println("Saldo atualizado: R$ " + saldoInicial);
                break;
            case 3:
                System.out.println("Digite o valor a transferir: ");
                double valorTransferencia = leitura.nextDouble();

                saldoInicial -= valorTransferencia;

                System.out.println("Saldo atualizado: R$ " + saldoInicial);
                break;
            case 4:
                System.out.println("Fechando...");
                break;
            default:
                System.out.println("Digite uma opção válida ou digite 4 para sair.");
        } return saldoInicial;  // Retornar o saldo atualizado
    }
}
