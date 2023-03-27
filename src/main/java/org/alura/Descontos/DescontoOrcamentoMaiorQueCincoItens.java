package org.alura.Descontos;

import org.alura.Orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoMaiorQueCincoItens extends  Desconto{
    public DescontoOrcamentoMaiorQueCincoItens(Desconto proximo) {
        super(proximo);
    }
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQtdItens() > 5;
    }
}
