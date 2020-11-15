package com.produtos.apirest.repository;

import com.produtos.apirest.dto.ProdutoResposta;
import com.produtos.apirest.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Produto findById(long id);

    @Query("SELECT new com.produtos.apirest.dto.ProdutoResposta(p.id, p.nome, a.lote, a.quantidade, v.valor, v.lastModifiedDate) FROM Produto p \n" +
            "INNER JOIN Armazenamento a ON p.id = a.produto.id \n" +
            "INNER JOIN ValorProd v On a.id = v.armazenamento.id order by p.id")
    List<ProdutoResposta> getJoinInformation();
}
