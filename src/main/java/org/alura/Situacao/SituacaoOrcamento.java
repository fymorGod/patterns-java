package org.alura.Situacao;

import org.alura.DomainException;
import org.alura.Orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {
    public abstract BigDecimal calcularValorDescontoExtra(Orcamento orcamento);
    public void aprovar(Orcamento orcamento) {
        throw new DomainException("Orcamento não pode ser Aprovado!");
    }
    public void reprovar(Orcamento orcamento) {
        throw new DomainException("Orcamento não pode ser Reprovado");
    }
    public void finalizar(Orcamento orcamento) {
        throw new DomainException("Orcamento não pode ser Finalizado");
    }
}
