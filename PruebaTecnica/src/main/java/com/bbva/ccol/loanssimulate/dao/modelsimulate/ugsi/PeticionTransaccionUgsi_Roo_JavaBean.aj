// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.bbva.ccol.loanssimulate.dao.modelsimulate.ugsi;

import com.bbva.ccol.loanssimulate.dao.modelsimulate.ugsi.PeticionTransaccionUgsi;
import com.bbva.jee.arq.spring.core.host.CuerpoMultiparte;

privileged aspect PeticionTransaccionUgsi_Roo_JavaBean {
    
    /**
     * Sets cuerpo value
     * 
     * @param cuerpo
     * @return PeticionTransaccionUgsi
     */
    public PeticionTransaccionUgsi PeticionTransaccionUgsi.setCuerpo(CuerpoMultiparte cuerpo) {
        this.cuerpo = cuerpo;
        return this;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String PeticionTransaccionUgsi.toString() {
        return "PeticionTransaccionUgsi {" + 
        "}" + super.toString();
    }
    
}
