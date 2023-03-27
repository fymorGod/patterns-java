package org.alura.Orcamento;

import org.alura.DomainException;
import org.alura.Http.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento {
    private HttpAdapter httpAdapter;

    public RegistroDeOrcamento(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void registrar(Orcamento orcamento) {
        //chamada http para a API externa
        if(!orcamento.isFinalizado()){
            throw new DomainException("Orcamento não finalizado");
        }

        String url = "http://api.externa/orcamento";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQtdItens()
        );

        httpAdapter.post(url, dados);

    }
}
