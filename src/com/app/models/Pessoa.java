package com.app.models;

public abstract class Pessoa {

    private Integer id;
    private String nome;
    private String email;
    private String fone;
    private TipoPessoa tipoPessoa;

    public Integer getId ( ) {
        return id;
    }

    public String getNome ( ) {
        return nome;
    }

    public void setNome ( String nome ) {
        this.nome = nome;
    }

    public String getEmail ( ) {
        return email;
    }

    public void setEmail ( String email ) {
        this.email = email;
    }

    public String getFone ( ) {
        return fone;
    }

    public void setFone ( String fone ) {
        this.fone = fone;
    }

    public TipoPessoa getTipoPessoa ( ) {
        return tipoPessoa;
    }

    public void setTipoPessoa ( TipoPessoa tipoPessoa ) {
        this.tipoPessoa = tipoPessoa;
    }

    public Pessoa ( Integer id, String nome, String email, String fone, TipoPessoa tipoPessoa ) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.fone = fone;
        this.tipoPessoa = tipoPessoa;
    }
}
