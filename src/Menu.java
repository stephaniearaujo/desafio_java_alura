import java.util.Scanner;

public class Menu {
    public void exibirMenu(String nome, double saldoInicial) {
        Scanner leitura = new Scanner(System.in);
        Condicional condicao = new Condicional();

        double saldoAtual = saldoInicial;

        String operacoes = """
                Operações:

                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair""";

        while (true) {
            System.out.println(operacoes);
            System.out.println("Digite a opção desejada: ");
            int opcao = leitura.nextInt();

            // Processar a opção com a classe Condicional e atualizar o saldo
            saldoInicial = condicao.exibirCondicional(opcao, saldoInicial, leitura);

            if (opcao == 4) {
                break;  // Sai do loop e encerra o menu
            } else if (opcao < 1 || opcao > 4) {
                System.out.println("Digite uma opção válida ou digite 4 para sair.");
            }
        }
    }
}