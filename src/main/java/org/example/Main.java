package org.example;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.setNome("Biro");

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cc.depositar(100);
        cc.extratoBancario();

        cc.transferir(50, poupanca);

        cc.extratoBancario();
        poupanca.depositar(45);

        poupanca.extratoBancario();
    }
}
