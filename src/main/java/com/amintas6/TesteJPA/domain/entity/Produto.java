package com.amintas6.TesteJPA.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Produto {
    @Id
    private Integer id;
    private String descricao;
    private BigDecimal Preco_unitario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco_unitario() {
        return Preco_unitario;
    }

    public void setPreco_unitario(BigDecimal preco_unitario) {
        Preco_unitario = preco_unitario;
    }
}
