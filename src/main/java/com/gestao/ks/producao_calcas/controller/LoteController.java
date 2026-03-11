package com.gestao.ks.producao_calcas.controller;

import com.gestao.ks.producao_calcas.model.Lote;
import com.gestao.ks.producao_calcas.model.ResumoFechamento;
import com.gestao.ks.producao_calcas.service.LoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController // Diz que essa classe responde requisições WEB
@RequestMapping("/api/lotes") // A URL base será http://localhost:8080/api/lotes
public class LoteController {

    @Autowired
    private LoteService service;

    @GetMapping // Rota para listar todos os lotes
    public List<Lote> listar() {
        return service.listarTodos();
    }

    @PostMapping // Rota para salvar um novo lote
    public Lote salvar(@RequestBody Lote lote) {
        return service.salvar(lote);
    }

    // ROTA 3: Gera o resumo agrupado (para o seu relatório de fechamento)
    @GetMapping("/relatorio")
    public List<ResumoFechamento> obterRelatorio() {
        return service.gerarRelatorio();
    }
}