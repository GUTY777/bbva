package com.bbva.ccol.loanssimulate.dao.modelsimulate.ugsi;

import java.math.BigDecimal;

import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.TipoCampo;
import com.bbva.jee.arq.spring.core.host.Formato;

import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;



/**
 * Formato de datos <code>UGCESIS9</code> de la transacci&oacute;n <code>UGSI</code>
 * 
 * @author Arquitectura Spring BBVA
 */
@Formato(nombre = "UGCESIS9")
@RooJavaBean
@RooToString
@RooSerializable
public class FormatoUGCESIS9 {
	
	/**
	 * <p>Campo <code>IDAMORT</code>, &iacute;ndice: <code>1</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 1, nombre = "IDAMORT", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String idamort;
	
	/**
	 * <p>Campo <code>IDSEGUR</code>, &iacute;ndice: <code>2</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 2, nombre = "IDSEGUR", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 10, longitudMaxima = 10)
	private String idsegur;
	
	/**
	 * <p>Campo <code>SEGURO</code>, &iacute;ndice: <code>3</code>, tipo: <code>DECIMAL</code>
	 */
	@Campo(indice = 3, nombre = "SEGURO", tipo = TipoCampo.DECIMAL, longitudMinima = 15, longitudMaxima = 15, decimales = 2)
	private BigDecimal seguro;
	
	/**
	 * <p>Campo <code>CURRENC</code>, &iacute;ndice: <code>4</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 4, nombre = "CURRENC", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String currenc;
	
}