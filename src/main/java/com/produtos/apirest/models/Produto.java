package com.produtos.apirest.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "TB_PRODUTO")
public class Produto implements Serializable {

    private static final long serialVersionUID = 7132052742287885635L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="PRODUTO_SEQ")
    private long id;
    private String nome;
    private Boolean ativo;
}
