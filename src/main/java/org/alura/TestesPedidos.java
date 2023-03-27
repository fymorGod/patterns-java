package org.alura;

import org.alura.Pedido.Actions.EnviarEmail;
import org.alura.Pedido.Actions.LogDePedido;
import org.alura.Pedido.Actions.SalvarPedidoDB;
import org.alura.Pedido.GeraPedido;
import org.alura.Pedido.GeraPedidoHandler;
import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {
    public static void main(String[] args) {
       String client = "Fylip";
       BigDecimal valorOrcamento = new BigDecimal("300");
       int quantidadeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(client, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(
                        new SalvarPedidoDB(),
                        new EnviarEmail(),
                        new LogDePedido()
                )
        );
        handler.execute(gerador);
    }
}
