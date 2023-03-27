package org.alura.imposto;

import org.alura.Orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS extends Imposto{
    public ISS(Imposto outro) {
        super(outro);
    }
    @Override
    public BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
