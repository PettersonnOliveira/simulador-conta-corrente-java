package desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Dados Do cliente

        double saldoInicial = 1000.00;
        int opcao;
        double saldoAtualizado = 0;
        System.out.println("**************************************************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("Nome:                      Petterson Oliveira ");
        System.out.println("Tipo conta:                Corrente ");
        System.out.println("Saldo Inicial:             R$ 1000,00");
        System.out.println("**************************************************");


        do {
            System.out.println("Operações");

            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println("Digite a opção desejada: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo Inicial: " + saldoInicial);
                    break;
                case 2:
                    System.out.println("Informe o valor que irá receber: ");
                    double saldoRecebido = leitor.nextDouble();
                    saldoAtualizado = saldoInicial + saldoRecebido;
                    saldoInicial = saldoInicial + saldoRecebido;
                    System.out.println("Saldo Atualizado: " + saldoAtualizado);
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir:");
                    double valorTransferido = leitor.nextDouble();
                    saldoAtualizado = saldoAtualizado - valorTransferido;
                    saldoInicial = saldoAtualizado;

                    System.out.println("Saldo Atualizado: " + saldoAtualizado);
                    break;
                case 4:
                    System.out.println("Saindo do app....");
                    break;
                default:
                    System.out.println("Opção inválida!");
            };
        }while (opcao != 4);

        leitor.close();
    };

};
