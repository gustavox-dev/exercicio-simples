package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        Integer conta = sc.nextInt();

        sc.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite seu nome!");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite seu saldo!");
        Double saldo = sc.nextDouble();

        ContaBanco contaBanco = new ContaBanco(conta, agencia, nomeCliente, saldo);

        contaBanco.mensagemAberturaDeConta();

        sc.close();
    }
}