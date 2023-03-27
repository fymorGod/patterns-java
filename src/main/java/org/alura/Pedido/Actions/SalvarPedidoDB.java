package org.alura.Pedido.Actions;

import org.alura.Pedido.Pedido;

public class SalvarPedidoDB implements ActionsAfterGeneratingOrder{
    @Override
    public void executeAction(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados");
    }
}
