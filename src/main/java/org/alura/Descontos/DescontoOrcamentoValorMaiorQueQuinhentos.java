package org.alura.Descontos;

import org.alura.Orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoValorMaiorQueQuinhentos extends Desconto{
    public DescontoOrcamentoValorMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }
    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
