package com.app.models;

public class Produto {

    private Integer id;
    private String descricao;
    private Double valor;

    public Integer getId ( ) {
        return id;
    }

    public String getDescricao ( ) {
        return descricao;
    }

    public void setDescricao ( String descricao ) {
        this.descricao = descricao;
    }

    public Double getValor ( ) {
        return valor;
    }

    public void setValor ( Double valor ) {
        this.valor = valor;
    }
}
