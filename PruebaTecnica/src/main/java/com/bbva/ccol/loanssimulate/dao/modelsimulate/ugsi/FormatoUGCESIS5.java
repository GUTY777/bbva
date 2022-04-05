package com.bbva.ccol.loanssimulate.dao.modelsimulate.ugsi;

import java.math.BigDecimal;

import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.TipoCampo;
import com.bbva.jee.arq.spring.core.host.Formato;

import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;



/**
 * Formato de datos <code>UGCESIS5</code> de la transacci&oacute;n <code>UGSI</code>
 * 
 * @author Arquitectura Spring BBVA
 */
@Formato(nombre = "UGCESIS5")
@RooJavaBean
@RooToString
@RooSerializable
public class FormatoUGCESIS5 {
	
	/**
	 * <p>Campo <code>TOTSEGU</code>, &iacute;ndice: <code>1</code>, tipo: <code>DECIMAL</code>
	 */
	@Campo(indice = 1, nombre = "TOTSEGU", tipo = TipoCampo.DECIMAL, longitudMinima = 17, longitudMaxima = 17, decimales = 2)
	private BigDecimal totsegu;
	
	/**
	 * <p>Campo <code>DIVSEGU</code>, &iacute;ndice: <code>2</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 2, nombre = "DIVSEGU", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String divsegu;
	
	/**
	 * <p>Campo <code>TOTCAPI</code>, &iacute;ndice: <code>3</code>, tipo: <code>DECIMAL</code>
	 */
	@Campo(indice = 3, nombre = "TOTCAPI", tipo = TipoCampo.DECIMAL, longitudMinima = 17, longitudMaxima = 17, decimales = 2)
	private BigDecimal totcapi;
	
	/**
	 * <p>Campo <code>DIVCAPI</code>, &iacute;ndice: <code>4</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 4, nombre = "DIVCAPI", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String divcapi;
	
	/**
	 * <p>Campo <code>TOTCSEG</code>, &iacute;ndice: <code>5</code>, tipo: <code>DECIMAL</code>
	 */
	@Campo(indice = 5, nombre = "TOTCSEG", tipo = TipoCampo.DECIMAL, longitudMinima = 17, longitudMaxima = 17, decimales = 2)
	private BigDecimal totcseg;
	
	/**
	 * <p>Campo <code>DIVTSEG</code>, &iacute;ndice: <code>6</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 6, nombre = "DIVTSEG", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String divtseg;
	
	/**
	 * <p>Campo <code>INTERES</code>, &iacute;ndice: <code>7</code>, tipo: <code>DECIMAL</code>
	 */
	@Campo(indice = 7, nombre = "INTERES", tipo = TipoCampo.DECIMAL, longitudMinima = 17, longitudMaxima = 17, decimales = 2)
	private BigDecimal interes;
	
	/**
	 * <p>Campo <code>DIVINTE</code>, &iacute;ndice: <code>8</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 8, nombre = "DIVINTE", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String divinte;
	
	/**
	 * <p>Campo <code>RESTPRE</code>, &iacute;ndice: <code>9</code>, tipo: <code>DECIMAL</code>
	 */
	@Campo(indice = 9, nombre = "RESTPRE", tipo = TipoCampo.DECIMAL, longitudMinima = 17, longitudMaxima = 17, decimales = 2)
	private BigDecimal restpre;
	
	/**
	 * <p>Campo <code>DIVRESP</code>, &iacute;ndice: <code>10</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 10, nombre = "DIVRESP", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String divresp;
	
	/**
	 * <p>Campo <code>VALHONO</code>, &iacute;ndice: <code>11</code>, tipo: <code>DECIMAL</code>
	 */
	@Campo(indice = 11, nombre = "VALHONO", tipo = TipoCampo.DECIMAL, longitudMinima = 17, longitudMaxima = 17, decimales = 2)
	private BigDecimal valhono;
	
	/**
	 * <p>Campo <code>DIVHONO</code>, &iacute;ndice: <code>12</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 12, nombre = "DIVHONO", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String divhono;
	
	/**
	 * <p>Campo <code>VALGAST</code>, &iacute;ndice: <code>13</code>, tipo: <code>DECIMAL</code>
	 */
	@Campo(indice = 13, nombre = "VALGAST", tipo = TipoCampo.DECIMAL, longitudMinima = 17, longitudMaxima = 17, decimales = 2)
	private BigDecimal valgast;
	
	/**
	 * <p>Campo <code>DIVGAST</code>, &iacute;ndice: <code>14</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 14, nombre = "DIVGAST", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String divgast;
	
	/**
	 * <p>Campo <code>VALSUBV</code>, &iacute;ndice: <code>15</code>, tipo: <code>DECIMAL</code>
	 */
	@Campo(indice = 15, nombre = "VALSUBV", tipo = TipoCampo.DECIMAL, longitudMinima = 17, longitudMaxima = 17, decimales = 2)
	private BigDecimal valsubv;
	
	/**
	 * <p>Campo <code>DIVSUBV</code>, &iacute;ndice: <code>16</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 16, nombre = "DIVSUBV", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String divsubv;
	
}