package bank;

import java.util.Scanner;

public class ATMApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Usuario usuario = new Usuario("Marcus", "1234", 1000);
        ATM atm = new ATM(usuario);

        System.out.print("Digite seu PIN: ");
        String pinDigitado = scanner.nextLine();

        if (!usuario.autenticar(pinDigitado)) {
            System.out.println("PIN invalidor. Acesso negado.");
            return;
        }

        int escolha;
        do {
            atm.exibirMenu();
            System.out.println("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha){
                case 1:
                    atm.consultarSaldo();
                    break;
                case 2:
                System.out.println("Digite o valor a depositar: ");
                double valorDeposito = scanner.nextDouble();
                atm.depositarDinheiro(valorDeposito);
                break;
                case 3:
                    System.out.println("Digite o valor a sacar: ");
                    double valorSaque = scanner.nextDouble();
                    atm.sacarDinheiro(valorSaque);
                    break;
                case 4:
                    System.out.println("Obrigado por usar o bank.ATM. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        while (escolha != 4);

        scanner.close();

    }
}
//Responsável por controlar a interação com o usuário, exibindo
// o menu e gerenciando o fluxo de escolhas
// (consultar saldo, sacar, depositar).
//Usará uma instância da classe bank.ATM para realizar as operações
// de depósito, saque e consulta de saldo.