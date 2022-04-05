package com.bbva.ccol.loanssimulate.dao.modelsimulate.ugsi;

import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.TipoCampo;
import com.bbva.jee.arq.spring.core.host.Formato;

import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;



/**
 * Formato de datos <code>UGCESIS1</code> de la transacci&oacute;n <code>UGSI</code>
 * 
 * @author Arquitectura Spring BBVA
 */
@Formato(nombre = "UGCESIS1")
@RooJavaBean
@RooToString
@RooSerializable
public class FormatoUGCESIS1 {
	
	/**
	 * <p>Campo <code>TITULO</code>, &iacute;ndice: <code>1</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 1, nombre = "TITULO", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 50, longitudMaxima = 50)
	private String titulo;
	
	/**
	 * <p>Campo <code>DESCRIP</code>, &iacute;ndice: <code>2</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 2, nombre = "DESCRIP", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 100, longitudMaxima = 100)
	private String descrip;
	
}