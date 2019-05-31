package com.app.models;

public class Autenticavel extends Pessoa {

    private String senha;
    private String login;

    public Autenticavel ( Integer id, String nome, String email, String fone, TipoPessoa tipoPessoa, String login, String senha ) {
        super(id, nome, email, fone, tipoPessoa);
        this.senha = senha;
        this.login = login;
    }

    public String getSenha ( ) {
        return senha;
    }

    public void setSenha ( String senha ) {
        this.senha = senha;
    }

    public String getLogin ( ) {
        return login;
    }

    public void setLogin ( String login ) {
        this.login = login;
    }

    public boolean autentica( Autenticavel autenticavel, String senha){
        return autenticavel.getSenha().equals(senha);
    }
}
