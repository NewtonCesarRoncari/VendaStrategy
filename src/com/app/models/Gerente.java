package com.app.models;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Autenticavel {

    private List<Vendedor> vendedores;

    public Gerente ( Integer id, String nome, String email, String fone, TipoPessoa tipoPessoa, String login, String senha ) {
        super(id, nome, email, fone, tipoPessoa, login, senha);
        this.vendedores = new ArrayList<>();
    }

}
