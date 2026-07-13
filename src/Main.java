import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double saldo_atual = 0.00;
        int op = 0;

        do{
            System.out.println("1- Consultar saldo");
            System.out.println("2- Depositar dinheiro");
            System.out.println("3- Sacar dinheiro");
            System.out.println("4- sair do siatema ");
            System.out.print("Informe uma opção: ");
            op = sc.nextInt();
            
        switch (op){
            
            case 1:
                System.out.println("saldo atual R$: " + saldo_atual);
                break;

            case 2:
                System.out.println("informe o valor a ser depositado: ");
                double deposito = sc.nextDouble();
                saldo_atual = saldo_atual + deposito;
                break;

            case 3:
                System.out.print("informe o valor a ser sacado: ");
                double saque = sc.nextDouble();
                if(saque > saldo_atual ){
                    System.out.println("valor insuficente!");

                }else{
                    System.out.println("ok");
                saldo_atual = saldo_atual - saque;
                }
                break;

            case 4:
                break;

            default:
                System.out.println("Numero invalido!");
                break;
            
        }


        }while(op !=4);
            System.out.println("Sistema Encerrado!");
        }
    }

