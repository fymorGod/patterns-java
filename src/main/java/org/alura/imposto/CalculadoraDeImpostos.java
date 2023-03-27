package org.alura.imposto;

import org.alura.Orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
       return imposto.calcular(orcamento);
    }
}
