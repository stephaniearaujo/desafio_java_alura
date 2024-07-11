import java.util.Scanner;

public class Condicional {
    public double exibirCondicional(int opcao, double saldo, Scanner leitura) {
        switch (opcao) {
            case 1:
                System.out.println("Seu saldo é de R$ " + saldo);
                break;
            case 2:
                System.out.println("Digite o valor a receber: ");
                double valorRecebimento = leitura.nextDouble();

                saldo += valorRecebimento;

                System.out.println("Saldo atualizado: R$ " + saldo);
                break;
            case 3:
                System.out.println("Digite o valor a transferir: ");
                double valorTransferencia = leitura.nextDouble();

                if (valorTransferencia > saldo){
                    System.out.println("Você não tem saldo suficiente.");
                } else {
                    saldo -= valorTransferencia;
                }

                System.out.println("Saldo atualizado: R$ " + saldo);
                break;
            case 4:
                System.out.println("Fechando...");
                break;
            default:
                System.out.println("Digite uma opção válida ou digite 4 para sair.");
        } return saldo;  // Retornar o saldo atualizado
    }
}
