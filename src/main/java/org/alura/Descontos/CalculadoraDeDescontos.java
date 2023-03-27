package org.alura.Descontos;

import org.alura.Orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoOrcamentoMaiorQueCincoItens(
                new DescontoOrcamentoValorMaiorQueQuinhentos(
                        new SemDesconto()
                )
        );

        return desconto.calcular(orcamento);
    }
}
