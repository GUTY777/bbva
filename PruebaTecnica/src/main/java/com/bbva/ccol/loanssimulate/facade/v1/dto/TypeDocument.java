package com.bbva.ccol.loanssimulate.facade.v1.dto;

import java.io.Serializable;

public class TypeDocument implements Serializable {
    private String id;
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

