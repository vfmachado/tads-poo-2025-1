package Banco;

import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    /*
     *    - NOME 
     *    - CPF
     *    - SALDO
     *    - LISTA DE TRANSACOES (STRING)
     * 
     *     + CONSTRUTOR
     *     + DEPOSITAR
     *     + SACAR
     *     + EXTRATO
     *     + TOSTRING
     */

    private String nome;
    private String cpf;
    private float saldo;
    private List<String> transacoes;

    public ContaBancaria(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0;
        this.transacoes = new ArrayList<String>();
    }

    public void depositar(float valor) {
        this.saldo = this.saldo + valor;
        transacoes.add("DEPOSITO NO VALOR DE R$ " + valor);
    }

    public void sacar(float valor) throws Exception {
        if (valor > this.saldo) {
            throw new Exception("SALDO INSUFICIENTE");
        }
        this.saldo = this.saldo - valor;
        this.transacoes.add("SAQUE FEITO NO VALOR DE "  + valor);
    }

    public float getSaldo() {
        return this.saldo;
    }

    public String extrato() {
        String texto = "\n\n=== EXTRATO ====\n"+ this.nome + "\nSALDO " + saldo;
        for (String string : transacoes) {
            texto += "\n" + string;
        }
        return texto;
    }
}
