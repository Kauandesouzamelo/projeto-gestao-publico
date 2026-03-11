package com.gestao.ks.producao_calcas.service;

import com.gestao.ks.producao_calcas.model.ResumoFechamento;
import java.util.stream.Collectors;
import java.util.Map;
import com.gestao.ks.producao_calcas.model.Lote;
import com.gestao.ks.producao_calcas.repository.LoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LoteService {

    @Autowired // O Spring "injeta" o repositório aqui automaticamente
    private LoteRepository repository;

    public Lote salvar(Lote lote) {
        // Aqui você poderia colocar validações no futuro
        return repository.save(lote);
    }

    public List<Lote> listarTodos() {
        return repository.findAll();
    }

    // Método para o "Total de Calças" que aparece no seu desenho
    public Integer calcularTotalProduzido() {
        return repository.findAll().stream()
                .mapToInt(Lote::getQuantidade)
                .sum();
    }
    public List<ResumoFechamento> gerarRelatorio() {
        return repository.findAll().stream()
                .collect(Collectors.groupingBy(Lote::getTamanho)) // Agrupa por P, M, G, GG
                .entrySet().stream()
                .map(entry -> new ResumoFechamento(
                        entry.getKey(),
                        entry.getValue().stream().mapToInt(Lote::getQuantidade).sum(), // Soma a Qtd
                        entry.getValue().stream().mapToDouble(l -> l.getQuantidade() * l.getValorUnitario()).sum() // Soma o Valor
                ))
                .collect(Collectors.toList());
    }
}