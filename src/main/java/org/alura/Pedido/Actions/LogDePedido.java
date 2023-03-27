package org.alura.Pedido.Actions;

import org.alura.Pedido.Pedido;

public class LogDePedido implements ActionsAfterGeneratingOrder {

    @Override
    public void executeAction(Pedido pedido) {
        System.out.println("Pedido foi gerado: "+pedido);
    }
}
