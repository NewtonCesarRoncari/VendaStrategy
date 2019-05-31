package com.app.models;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Autenticavel{

    private List<Venda> vendas;


    public Vendedor ( Integer id, String nome, String email, String fone, TipoPessoa tipoPessoa, String login, String senha ) {
        super(id, nome, email, fone, tipoPessoa, login, senha);
        this.vendas = new ArrayList<>();
    }

}
