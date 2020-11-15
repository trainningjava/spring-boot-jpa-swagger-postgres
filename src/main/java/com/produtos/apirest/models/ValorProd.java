package com.produtos.apirest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "TB_VALOR")
public class ValorProd implements Serializable {
    private static final long serialVersionUID = -3574749976427742503L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="VALOR_SEQ")
    private long id;

    private BigDecimal valor;

    @Getter
    @LastModifiedDate
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "pt-BR", timezone = "Brazil/East")
    @Column(name = "ultima_alteracao")
    private Date lastModifiedDate=new Date();

    @OneToOne
    @NotNull
    @JoinColumn(name = "armazenamento_id", referencedColumnName = "id", nullable = false)
    private Armazenamento armazenamento;

}
