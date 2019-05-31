package com.app;

import com.app.models.TipoPessoa;
import com.app.models.Vendedor;

public class Main {

    public static void main(String[] args) {
	    var vendedor = new Vendedor(1,
                "Newton",
                "newton@gmail.com",
                "3221232",
                TipoPessoa.FISICA,
                "newton",
                "123");

        System.out.println(vendedor.autentica(vendedor,"123"));

    }
}
