package org.alura;

import org.alura.Descontos.CalculadoraDeDescontos;
import org.alura.Orcamento.ItemOrcamento;
import org.alura.Orcamento.Orcamento;
import org.alura.imposto.CalculadoraDeImpostos;
import org.alura.imposto.ISS;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento();
        primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        System.out.println("-------------Sistema Inicial------------");

        Orcamento segundo = new Orcamento();
        segundo.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));

        Orcamento terceiro = new Orcamento();
        terceiro.adicionarItem(new ItemOrcamento(new BigDecimal("500")));

        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        System.out.println(calculadoraDeDescontos.calcular(primeiro));
        System.out.println(calculadoraDeDescontos.calcular(segundo));
        System.out.println(calculadoraDeDescontos.calcular(terceiro));
    }
}