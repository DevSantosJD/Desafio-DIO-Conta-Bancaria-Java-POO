package org.example;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extratoBancario() {
        System.out.println("=== Extrato Conta Poupaça ===");
        super.extratoBancario();
    }
}
