package com.produtos.apirest.repository;

import com.produtos.apirest.models.Armazenamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArmazenamentoRepository extends JpaRepository<Armazenamento, Long> {
    Armazenamento findById(long id);
}
