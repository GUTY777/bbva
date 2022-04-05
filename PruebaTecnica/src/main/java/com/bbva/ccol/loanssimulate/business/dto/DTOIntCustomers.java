package com.bbva.ccol.loanssimulate.business.dto;

import com.bbva.ccol.loanssimulate.business.validations.IDTOIntCreateCustomer;

import javax.validation.constraints.NotNull;

public class DTOIntCustomers  {
    @NotNull(groups = IDTOIntCreateCustomer.class)
    private String dtoIntnamecustomer;
    private String dtoIntlastnamecustomer;
    private String dtoIntphonecustomer;
    private DTOIntDocument dtoIntDocument;

    public String getDtoIntnamecustomer() {
        return dtoIntnamecustomer;
    }

    public void setDtoIntnamecustomer(String dtoIntnamecustomer) {
        this.dtoIntnamecustomer = dtoIntnamecustomer;
    }

    public String getDtoIntlastnamecustomer() {
        return dtoIntlastnamecustomer;
    }

    public void setDtoIntlastnamecustomer(String dtoIntlastnamecustomer) {
        this.dtoIntlastnamecustomer = dtoIntlastnamecustomer;
    }

    public String getDtoIntphonecustomer() {
        return dtoIntphonecustomer;
    }

    public void setDtoIntphonecustomer(String dtoIntphonecustomer) {
        this.dtoIntphonecustomer = dtoIntphonecustomer;
    }

    public DTOIntDocument getDtoIntDocument() {
        return dtoIntDocument;
    }

    public void setDtoIntDocument(DTOIntDocument dtoIntDocument) {
        this.dtoIntDocument = dtoIntDocument;
    }
}
