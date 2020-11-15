package com.produtos.apirest.models;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "TB_ARMAZENAMENTO")
public class Armazenamento implements Serializable {

    private static final long serialVersionUID = -5701848135639287945L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="ARMAZEM_SEQ")
    private long id;

    @Column(length = 5)
    private String lote;

    private BigDecimal quantidade;

    @Value("${some.key:false}")
    private Boolean bloqueado;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "produto_id", referencedColumnName = "id", nullable = false)
    private Produto produto;

}
