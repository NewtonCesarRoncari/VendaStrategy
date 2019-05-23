package com.app.models;

public class IPI implements Imposto {
    @Override
    public Double calculaImposto ( Venda venda ) {
        if (venda.getProdutos().size() > 5){
            return venda.getValor() * 0.10;
        } else {
            return Double.valueOf(0);
        }
    }
}
