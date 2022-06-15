package com.amintas6.TesteJPA.domain.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


public class Cliente {

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public Cliente(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Cliente() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
