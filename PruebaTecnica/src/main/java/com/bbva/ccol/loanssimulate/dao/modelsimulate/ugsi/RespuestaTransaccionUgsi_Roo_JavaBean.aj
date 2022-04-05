// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.bbva.ccol.loanssimulate.dao.modelsimulate.ugsi;

import com.bbva.ccol.loanssimulate.dao.modelsimulate.ugsi.RespuestaTransaccionUgsi;
import com.bbva.jee.arq.spring.core.host.CuerpoMultiparte;

privileged aspect RespuestaTransaccionUgsi_Roo_JavaBean {
    
    /**
     * Gets codigoRetorno value
     * 
     * @return String
     */
    public String RespuestaTransaccionUgsi.getCodigoRetorno() {
        return this.codigoRetorno;
    }
    
    /**
     * Sets codigoRetorno value
     * 
     * @param codigoRetorno
     * @return RespuestaTransaccionUgsi
     */
    public RespuestaTransaccionUgsi RespuestaTransaccionUgsi.setCodigoRetorno(String codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
        return this;
    }
    
    /**
     * Gets codigoControl value
     * 
     * @return String
     */
    public String RespuestaTransaccionUgsi.getCodigoControl() {
        return this.codigoControl;
    }
    
    /**
     * Sets codigoControl value
     * 
     * @param codigoControl
     * @return RespuestaTransaccionUgsi
     */
    public RespuestaTransaccionUgsi RespuestaTransaccionUgsi.setCodigoControl(String codigoControl) {
        this.codigoControl = codigoControl;
        return this;
    }
    
    /**
     * Sets cuerpo value
     * 
     * @param cuerpo
     * @return RespuestaTransaccionUgsi
     */
    public RespuestaTransaccionUgsi RespuestaTransaccionUgsi.setCuerpo(CuerpoMultiparte cuerpo) {
        this.cuerpo = cuerpo;
        return this;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String RespuestaTransaccionUgsi.toString() {
        return "RespuestaTransaccionUgsi {" + 
                "codigoRetorno='" + codigoRetorno + '\'' + 
                ", codigoControl='" + codigoControl + '\'' + "}" + super.toString();
    }
    
}
