package com.bbva.ccol.loanssimulate.facade.v1.dto;

import java.io.Serializable;

public class Customer implements Serializable {
    private String namecustomer;
    private String lastnamecustomer;
    private String phonecustomer;
    private Document document;

    public String getNamecustomer() {
        return namecustomer;
    }

    public void setNamecustomer(String namecustomer) {
        this.namecustomer = namecustomer;
    }

    public String getLastnamecustomer() {
        return lastnamecustomer;
    }

    public void setLastnamecustomer(String lastnamecustomer) {
        this.lastnamecustomer = lastnamecustomer;
    }

    public String getPhonecustomer() {
        return phonecustomer;
    }

    public void setPhonecustomer(String phonecustomer) {
        this.phonecustomer = phonecustomer;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}
