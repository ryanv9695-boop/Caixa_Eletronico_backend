//O projeto do simulador de caixa eletrônico foi estruturado com a intenção de aprendizado sobre o desenvolvimento
// backend utilizando comandos simples. A função do sistema é simular as funcionalidades de um caixa eletrônico real,
// com as principais ações que ele pode ter. Para isso, foram declaradas variáveis do tipo (inteiro e double)
// para serem utilizadas dentro do laço de repetição (do-while).
// É dentro dessa estrutura que tudo acontece: a entrada de dados pelo usuário, as operações matemáticas
// validadas por estruturas condicionais (if/else e switch/case), e finalmente a saída de dados, imprimindo os resultados na tela.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double saldo_atual = 0.00;
        int op = 0;

        do {
            System.out.println("1- Consultar saldo");
            System.out.println("2- Depositar dinheiro");
            System.out.println("3- Sacar dinheiro");
            System.out.println("4- sair do siatema ");
            System.out.print("Informe uma opção: ");
            op = sc.nextInt();

            switch (op) {

                case 1:
                    System.out.println("saldo atual R$: " + saldo_atual);
                    break;

                case 2:
                    System.out.println("informe o valor a ser depositado: ");
                    double deposito = sc.nextDouble();
                    saldo_atual = saldo_atual + deposito;
                    break;

                case 3:
                    System.out.print("Informe o valor a ser sacado: ");
                    double saque = sc.nextDouble();
                    if (saque > saldo_atual) {
                        System.out.println("valor insuficente!");

                    } else {
                        System.out.println("ok");
                        saldo_atual = saldo_atual - saque;
                    }
                    break;

                case 4:
                    for (int i = 3; i > 0; i--) {
                        System.out.println("Encerrando o sistema...");

                    }
                    break;

                default:
                    System.out.println("Numero invalido!");
                    break;

            }
        }while (op != 4) ;
        System.out.println("Sistema Encerrado!");

    }

}


