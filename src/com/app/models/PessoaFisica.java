package com.app.models;

public class PessoaFisica extends Pessoa {

    private String cpf;

    public String getCpf ( ) {
        return cpf;
    }

    public PessoaFisica ( Integer id, String nome, String email, String fone, TipoPessoa tipoPessoa ) {
        super(id, nome, email, fone, tipoPessoa);
        this.cpf = cpf;
    }
}
