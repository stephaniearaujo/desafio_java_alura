import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitura.nextLine();

        System.out.println("Digite seu saldo inicial: ");
        double saldo = leitura.nextDouble();

        String textoInicial = """
                *************************************

                Dados iniciais do cliente:

                Nome:""" + nome +
                """

                Saldo inicial:""" + saldo +
                """


                *************************************

                """;

        System.out.println(textoInicial);

        //  Criar uma instância de Menu e chamar o método exibirMenu
        Menu menu = new Menu();
        menu.exibirMenu(nome, saldo);
    }
}
