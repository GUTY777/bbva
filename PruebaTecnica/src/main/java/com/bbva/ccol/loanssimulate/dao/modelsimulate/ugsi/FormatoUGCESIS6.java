package com.bbva.ccol.loanssimulate.dao.modelsimulate.ugsi;

import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.TipoCampo;
import com.bbva.jee.arq.spring.core.host.Formato;

import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;



/**
 * Formato de datos <code>UGCESIS6</code> de la transacci&oacute;n <code>UGSI</code>
 * 
 * @author Arquitectura Spring BBVA
 */
@Formato(nombre = "UGCESIS6")
@RooJavaBean
@RooToString
@RooSerializable
public class FormatoUGCESIS6 {
	
	/**
	 * <p>Campo <code>FEPLAN</code>, &iacute;ndice: <code>1</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 1, nombre = "FEPLAN", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 7, longitudMaxima = 7)
	private String feplan;
	
	/**
	 * <p>Campo <code>FRECNUM</code>, &iacute;ndice: <code>2</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 2, nombre = "FRECNUM", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String frecnum;
	
	/**
	 * <p>Campo <code>FCANTID</code>, &iacute;ndice: <code>3</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 3, nombre = "FCANTID", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 17, longitudMaxima = 17)
	private String fcantid;
	
}