package com.bbva.ccol.loanssimulate.dao.modelsimulate.ugsi;

import java.math.BigDecimal;
import java.util.Date;

import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.TipoCampo;
import com.bbva.jee.arq.spring.core.host.Formato;

import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;



/**
 * Formato de datos <code>UGCESIS4</code> de la transacci&oacute;n <code>UGSI</code>
 * 
 * @author Arquitectura Spring BBVA
 */
@Formato(nombre = "UGCESIS4")
@RooJavaBean
@RooToString
@RooSerializable
public class FormatoUGCESIS4 {
	
	/**
	 * <p>Campo <code>NUMCUOT</code>, &iacute;ndice: <code>1</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 1, nombre = "NUMCUOT", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String numcuot;
	
	/**
	 * <p>Campo <code>VLRCUOT</code>, &iacute;ndice: <code>2</code>, tipo: <code>DECIMAL</code>
	 */
	@Campo(indice = 2, nombre = "VLRCUOT", tipo = TipoCampo.DECIMAL, longitudMinima = 17, longitudMaxima = 17, decimales = 2)
	private BigDecimal vlrcuot;
	
	/**
	 * <p>Campo <code>DIVCUOT</code>, &iacute;ndice: <code>3</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 3, nombre = "DIVCUOT", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String divcuot;
	
	/**
	 * <p>Campo <code>INTERES</code>, &iacute;ndice: <code>4</code>, tipo: <code>DECIMAL</code>
	 */
	@Campo(indice = 4, nombre = "INTERES", tipo = TipoCampo.DECIMAL, longitudMinima = 17, longitudMaxima = 17, decimales = 2)
	private BigDecimal interes;
	
	/**
	 * <p>Campo <code>DIVINTE</code>, &iacute;ndice: <code>5</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 5, nombre = "DIVINTE", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String divinte;
	
	/**
	 * <p>Campo <code>SEGURO</code>, &iacute;ndice: <code>6</code>, tipo: <code>DECIMAL</code>
	 */
	@Campo(indice = 6, nombre = "SEGURO", tipo = TipoCampo.DECIMAL, longitudMinima = 17, longitudMaxima = 17, decimales = 2)
	private BigDecimal seguro;
	
	/**
	 * <p>Campo <code>DIVSEGU</code>, &iacute;ndice: <code>7</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 7, nombre = "DIVSEGU", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String divsegu;
	
	/**
	 * <p>Campo <code>CAPITAL</code>, &iacute;ndice: <code>8</code>, tipo: <code>DECIMAL</code>
	 */
	@Campo(indice = 8, nombre = "CAPITAL", tipo = TipoCampo.DECIMAL, longitudMinima = 17, longitudMaxima = 17, decimales = 2)
	private BigDecimal capital;
	
	/**
	 * <p>Campo <code>DIVCAPI</code>, &iacute;ndice: <code>9</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 9, nombre = "DIVCAPI", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String divcapi;
	
	/**
	 * <p>Campo <code>PENDIEN</code>, &iacute;ndice: <code>10</code>, tipo: <code>DECIMAL</code>
	 */
	@Campo(indice = 10, nombre = "PENDIEN", tipo = TipoCampo.DECIMAL, longitudMinima = 17, longitudMaxima = 17, decimales = 2)
	private BigDecimal pendien;
	
	/**
	 * <p>Campo <code>DIVPEND</code>, &iacute;ndice: <code>11</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 11, nombre = "DIVPEND", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String divpend;
	
	/**
	 * <p>Campo <code>FECHAEX</code>, &iacute;ndice: <code>12</code>, tipo: <code>FECHA</code>
	 */
	@Campo(indice = 12, nombre = "FECHAEX", tipo = TipoCampo.FECHA, longitudMinima = 10, longitudMaxima = 10, formato = "yyyy-MM-dd")
	private Date fechaex;
	
	/**
	 * <p>Campo <code>HONOVAL</code>, &iacute;ndice: <code>13</code>, tipo: <code>DECIMAL</code>
	 */
	@Campo(indice = 13, nombre = "HONOVAL", tipo = TipoCampo.DECIMAL, longitudMinima = 17, longitudMaxima = 17, decimales = 2)
	private BigDecimal honoval;
	
	/**
	 * <p>Campo <code>HONODIV</code>, &iacute;ndice: <code>14</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 14, nombre = "HONODIV", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String honodiv;
	
	/**
	 * <p>Campo <code>GASTVAL</code>, &iacute;ndice: <code>15</code>, tipo: <code>DECIMAL</code>
	 */
	@Campo(indice = 15, nombre = "GASTVAL", tipo = TipoCampo.DECIMAL, longitudMinima = 17, longitudMaxima = 17, decimales = 2)
	private BigDecimal gastval;
	
	/**
	 * <p>Campo <code>GASTDIV</code>, &iacute;ndice: <code>16</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 16, nombre = "GASTDIV", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String gastdiv;
	
	/**
	 * <p>Campo <code>SUBVVAL</code>, &iacute;ndice: <code>17</code>, tipo: <code>DECIMAL</code>
	 */
	@Campo(indice = 17, nombre = "SUBVVAL", tipo = TipoCampo.DECIMAL, longitudMinima = 17, longitudMaxima = 17, decimales = 2)
	private BigDecimal subvval;
	
	/**
	 * <p>Campo <code>SUBVDIV</code>, &iacute;ndice: <code>18</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 18, nombre = "SUBVDIV", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String subvdiv;
	
}