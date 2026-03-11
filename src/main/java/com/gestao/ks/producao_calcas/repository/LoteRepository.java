package com.gestao.ks.producao_calcas.repository;

import com.gestao.ks.producao_calcas.model.Lote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Indica que esta interface é um componente de acesso a dados
public interface LoteRepository extends JpaRepository<Lote, Long> {
    // Aqui o Spring já nos dá métodos como: save(), findAll(), findById(), delete()...
}