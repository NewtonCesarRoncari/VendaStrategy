package com.app.models;

public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public String getCnpj ( ) {
        return cnpj;
    }

    public PessoaJuridica ( Integer id, String nome, String email, String fone, TipoPessoa tipoPessoa ) {
        super(id, nome, email, fone, tipoPessoa);
        this.cnpj = cnpj;
    }
}
