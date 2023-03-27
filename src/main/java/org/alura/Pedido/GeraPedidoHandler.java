package org.alura.Pedido;

import org.alura.Orcamento.ItemOrcamento;
import org.alura.Orcamento.Orcamento;
import org.alura.Pedido.Actions.ActionsAfterGeneratingOrder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<ActionsAfterGeneratingOrder> actions;

    public GeraPedidoHandler(List<ActionsAfterGeneratingOrder> actions) {
        this.actions = actions;
    }
    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        Pedido pedido = new Pedido(dados.getNameCliente(), LocalDateTime.now(), orcamento);

        actions.forEach(action -> action.executeAction(pedido));
    }
}
