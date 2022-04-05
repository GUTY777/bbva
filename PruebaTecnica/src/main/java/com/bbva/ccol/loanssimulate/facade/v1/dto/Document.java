package com.bbva.ccol.loanssimulate.facade.v1.dto;

public class Document {
    private String numberDocument;
    private TypeDocument TypeDocumente;

    public String getNumberDocument() {
        return numberDocument;
    }

    public void setNumberDocument(String numberDocument) {
        this.numberDocument = numberDocument;
    }

    public TypeDocument getTypeDocumente() {
        return TypeDocumente;
    }

    public void setTypeDocumente(TypeDocument typeDocumente) {
        TypeDocumente = typeDocumente;
    }
}
