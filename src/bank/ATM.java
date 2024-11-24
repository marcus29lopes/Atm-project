package bank;

public class ATM {
    Usuario usuario;

    ATM(Usuario usuario) {
        this.usuario = usuario;
    }

    void exibirMenu() {
        System.out.println("\n--- bank.ATM ---");
        System.out.println("1. Consultar Saldo");
        System.out.println("2. Despositar Dinheiro");
        System.out.println("3. Sacar Dinheiro");
        System.out.println("4. Sair");
    }

    void consultarSaldo() { //metodo para consultar saldo
        System.out.println("Seu saldo atual é: $" + usuario.getConta().consultarSaldo());// dps testar indo direto na conta
    }

    void depositarDinheiro(double valor) {
        usuario.getConta().depositar(valor);
        System.out.println("Deposito de $" + valor + " realizado com sucesso");
    }

    void sacarDinheiro(double valor) {
        usuario.getConta().sacar(valor);
        System.out.println("Saque de $" + valor + " realizado com sucesso.");
    }
}



/*
Responsável por gerenciar a lógica do caixa eletrônico.
A classe pode conter métodos para checar saldo, depositar e sacar dinheiro.
Pode manter o saldo do usuário.
*/
