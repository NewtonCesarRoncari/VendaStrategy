package com.app.models;

public class ICMS implements Imposto {
    @Override
    public Double calculaImposto ( Venda venda ) {
        if (venda.getValor() > 500){
            return venda.getValor() * 0.18;
    } else {
        return Double.valueOf(0);
    }
  }
}
