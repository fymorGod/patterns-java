package org.alura;

import org.alura.Orcamento.ItemOrcamento;
import org.alura.Orcamento.Orcamento;
import org.alura.imposto.CalculadoraDeImpostos;
import org.alura.imposto.ICMS;
import org.alura.imposto.ISS;

import java.math.BigDecimal;

public class TesteImposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento( new BigDecimal("200")));

        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ISS(new ICMS(null))) );
    }
}
