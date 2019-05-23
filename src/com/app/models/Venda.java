package com.app.models;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private Integer id;
    private Pessoa clente;
    private Double valorTotal;
    private List<Produto> produtos;

    public void addProduto( Produto produto){
        this.produtos.add(produto);
        this.valorTotal += produto.getValor();
    }

    public Integer getId ( ) {
        return id;
    }

    public Double getValor ( ) {
        return valorTotal;
    }

    public List<Produto> getProdutos ( ) {
        return produtos;
    }

    public Pessoa getClente ( ) {
        return clente;
    }

    public void setClente ( Pessoa clente ) {
        this.clente = clente;
    }

    public Venda ( Integer id, Pessoa clente, Double valorTotal ) {
        this.id = id;
        this.clente = clente;
        this.valorTotal = valorTotal;
        this.produtos = new ArrayList<>();
    }


}
