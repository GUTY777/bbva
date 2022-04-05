package com.bbva.ccol.loanssimulate.dao.modelsimulate.ugsi;

import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.TipoCampo;
import com.bbva.jee.arq.spring.core.host.Formato;

import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;



/**
 * Formato de datos <code>UGCESIS7</code> de la transacci&oacute;n <code>UGSI</code>
 * 
 * @author Arquitectura Spring BBVA
 */
@Formato(nombre = "UGCESIS7")
@RooJavaBean
@RooToString
@RooSerializable
public class FormatoUGCESIS7 {
	
	/**
	 * <p>Campo <code>PRODUID</code>, &iacute;ndice: <code>1</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 1, nombre = "PRODUID", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 4, longitudMaxima = 4)
	private String produid;
	
	/**
	 * <p>Campo <code>PRONAME</code>, &iacute;ndice: <code>2</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 2, nombre = "PRONAME", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 15, longitudMaxima = 15)
	private String proname;
	
	/**
	 * <p>Campo <code>PROTIPO</code>, &iacute;ndice: <code>3</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 3, nombre = "PROTIPO", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 11, longitudMaxima = 11)
	private String protipo;
	
	/**
	 * <p>Campo <code>TIPNAME</code>, &iacute;ndice: <code>4</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 4, nombre = "TIPNAME", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 15, longitudMaxima = 15)
	private String tipname;
	
	/**
	 * <p>Campo <code>PROCOMP</code>, &iacute;ndice: <code>5</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 5, nombre = "PROCOMP", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 30, longitudMaxima = 30)
	private String procomp;
	
	/**
	 * <p>Campo <code>COMNAME</code>, &iacute;ndice: <code>6</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 6, nombre = "COMNAME", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 30, longitudMaxima = 30)
	private String comname;
	
	/**
	 * <p>Campo <code>PROCONT</code>, &iacute;ndice: <code>7</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 7, nombre = "PROCONT", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 18, longitudMaxima = 18)
	private String procont;
	
	/**
	 * <p>Campo <code>CONTIPO</code>, &iacute;ndice: <code>8</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 8, nombre = "CONTIPO", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 14, longitudMaxima = 14)
	private String contipo;
	
	/**
	 * <p>Campo <code>CONNAME</code>, &iacute;ndice: <code>9</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 9, nombre = "CONNAME", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 20, longitudMaxima = 20)
	private String conname;
	
	/**
	 * <p>Campo <code>METPAGO</code>, &iacute;ndice: <code>10</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 10, nombre = "METPAGO", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 2, longitudMaxima = 2)
	private String metpago;
	
	/**
	 * <p>Campo <code>METNAME</code>, &iacute;ndice: <code>11</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 11, nombre = "METNAME", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 20, longitudMaxima = 20)
	private String metname;
	
	/**
	 * <p>Campo <code>PRODOBL</code>, &iacute;ndice: <code>12</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 12, nombre = "PRODOBL", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String prodobl;
	
	/**
	 * <p>Campo <code>ADCMONT</code>, &iacute;ndice: <code>13</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 13, nombre = "ADCMONT", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 17, longitudMaxima = 17)
	private String adcmont;
	
	/**
	 * <p>Campo <code>ADCDIVS</code>, &iacute;ndice: <code>14</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 14, nombre = "ADCDIVS", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String adcdivs;
	
	/**
	 * <p>Campo <code>ADCMONP</code>, &iacute;ndice: <code>15</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 15, nombre = "ADCMONP", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 17, longitudMaxima = 17)
	private String adcmonp;
	
	/**
	 * <p>Campo <code>ADCDIVP</code>, &iacute;ndice: <code>16</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 16, nombre = "ADCDIVP", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String adcdivp;
	
	/**
	 * <p>Campo <code>ADCPORP</code>, &iacute;ndice: <code>17</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 17, nombre = "ADCPORP", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 8, longitudMaxima = 8)
	private String adcporp;
	
	/**
	 * <p>Campo <code>DEFECTO</code>, &iacute;ndice: <code>18</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 18, nombre = "DEFECTO", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String defecto;
	
}