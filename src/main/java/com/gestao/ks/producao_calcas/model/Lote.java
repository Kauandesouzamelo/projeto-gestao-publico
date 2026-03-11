package com.gestao.ks.producao_calcas.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity //Avisamos ao Spring que essa classe @Entity vai virar uma tabela no banco de dados.
@Data //Usamos o Lombok para não ter que escrever manualmente os Getters e Setters.
public class Lote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate data;
    private Integer quantidade;
    private String tamanho; // P, M, G ou GG
    private Double valorUnitario;

    public Double getValorTotal() {
        if (this.quantidade == null || this.valorUnitario == null) return 0.0;
        return this.quantidade * this.valorUnitario;
    }
}