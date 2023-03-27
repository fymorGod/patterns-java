package org.alura.Situacao;

import org.alura.DomainException;
import org.alura.Orcamento.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento {
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }
    @Override
    public void aprovar(Orcamento orcamento) throws DomainException {
        orcamento.setSituacao(new Aprovado());
    }

    @Override
    public void reprovar(Orcamento orcamento) throws DomainException {
        orcamento.setSituacao(new Reprovado());
    }
}
