package bank;

public class Conta {
    double saldo;

    Conta(double saldoInicial) { //Construtor inicializar o saldo e tem que ter letra maiuscula
        this.saldo = saldoInicial;
    }

    double consultarSaldo() {
        return saldo;
    }

    void depositar(double valor) {//usando void aqui porque nao retorna nada
        if (valor > 0) {
            saldo += valor;
        }
    }

    void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }


}
/*
Responsável por armazenar e manipular o saldo de um cliente.
Pode ter métodos como depositar, sacar e consultarSaldo.
Aqui, você pode colocar a lógica que cuida diretamente da
conta do cliente, separando-a da lógica do bank.ATM.
*/
