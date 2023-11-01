import java.util.Scanner;

public class Desafio01 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println(("Tipo de conta: "));
        String tipoConta = scanner.nextLine();

        System.out.println("Informe valor inicial: ");
        Double saldo = scanner.nextDouble();

        System.out.println("***************************************");
        System.out.println("Nome:           "+nome);
        System.out.println("Tipo de conta:  "+tipoConta);
        System.out.println("Saldo Inicial:  "+saldo);
        System.out.println("***************************************");


        int opcao = 0;

        while (opcao!=4){
            System.out.println("Operações");
            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Receber valores");
            System.out.println("3 - Tranferir valores");
            System.out.println("4 - Sair do programa");

            System.out.println("Selecione uma das opções");
            opcao = scanner.nextInt();

            if (opcao==1){
                System.out.println("O saldo atual é R$ "+saldo);
            } else if (opcao ==2) {
                System.out.println("Informe o valor de entrada: ");
                double entrada = scanner.nextDouble();
                saldo+=entrada;
                System.out.println("O valor atual é R$ "+ saldo);
            } else if (opcao==3) {
                System.out.println("Informe o valor para transferencia: ");
                double valorTransferir = scanner.nextDouble();
                if (valorTransferir>saldo){
                    System.out.println("Não é possível realizar transferencia com valor maior do que saldo");
                }else {
                    saldo -=valorTransferir;
                    System.out.println("O valor atual é R$ "+ saldo); }
            } else if (opcao==4) {
                break;
            } else {
                System.out.println("Valor incorreto, por favor escolha umas das oções disponíveis");
            }
            System.out.println("Selecione uma das opções");
        }

    }
}
