package org.example;

public class ContaBanco {
    /*
    *   Atributo	Tipo	Exemplo
        Numero	Inteiro	1021
        Agencia	Texto	067-8
        Nome Cliente	Texto	MARIO ANDRADE
        Saldo	Decimal	237.48
     */
    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    public ContaBanco() {
    }

    public ContaBanco(Integer numero, String agencia, String nomeCliente, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void mensagemAberturaDeConta(){
        System.out.println("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                " conta " + numero +
                " e seu saldo " + saldo +
                " já está disponível para saque.");
    }
}
