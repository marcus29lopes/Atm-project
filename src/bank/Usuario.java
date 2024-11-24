package bank;

public class Usuario {
    String nome;
    String pin;
    Conta conta; //why

    Usuario(String nome, String pin, double saldoInicial) {
        this.nome = nome;
        this.pin = pin;
        this.conta = new Conta(saldoInicial); //cria a conta do usuario
    }

    boolean autenticar(String pin) {
        return this.pin.equals(pin);
    }

    Conta getConta() {   //metodo para acessar a conta
        return conta;
    }

    String getNome() {   //metodo para acessar o nome
        return nome;
    }

}

/*
Responsável por armazenar as informações do cliente
 (por exemplo, nome e número da conta).
Pode ter um método para autenticar o usuário
 (por exemplo, via PIN).
*/
