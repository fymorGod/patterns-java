package org.alura.Pedido;

import java.math.BigDecimal;

public class GeraPedido {
    private String nameCliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

    public GeraPedido(String nameCliente, BigDecimal valorOrcamento, int quantidadeItens) {
        this.nameCliente = nameCliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }
    public String getNameCliente() {
        return nameCliente;
    }
    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }
    public int getQuantidadeItens() {
        return quantidadeItens;
    }
}
