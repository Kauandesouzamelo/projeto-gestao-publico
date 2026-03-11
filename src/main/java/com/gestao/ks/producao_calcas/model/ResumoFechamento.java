package com.gestao.ks.producao_calcas.model;

// Este record define que cada linha do relatório terá: Tamanho, Qtd e Valor Total
public record ResumoFechamento(
        String tamanho,
        Integer quantidadeTotal,
        Double valorTotal
) {}