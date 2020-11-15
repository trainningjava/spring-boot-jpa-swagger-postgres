package com.produtos.apirest.repository;

import com.produtos.apirest.models.ValorProd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ValorProdRepository extends JpaRepository<ValorProd, Long> {
    ValorProd findById(long id);

    @Query("FROM ValorProd v WHERE v.armazenamento.id = :id")
    ValorProd findbyArmazemId(long id);
}
