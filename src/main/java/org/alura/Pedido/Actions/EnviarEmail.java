package org.alura.Pedido.Actions;

import org.alura.Pedido.Pedido;

public class EnviarEmail implements ActionsAfterGeneratingOrder{
    @Override
    public void executeAction(Pedido pedido) {
        System.out.println("Enviando email com dados do pedido");
    }
}
