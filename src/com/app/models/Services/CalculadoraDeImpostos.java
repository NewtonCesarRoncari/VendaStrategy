package com.app.models.Services;

import com.app.models.Imposto;
import com.app.models.Venda;

public class CalculadoraDeImpostos {

    public void calculaImposto( Venda venda, Imposto imposto ){
        System.out.println(imposto.calculaImposto(venda));
    }
}
