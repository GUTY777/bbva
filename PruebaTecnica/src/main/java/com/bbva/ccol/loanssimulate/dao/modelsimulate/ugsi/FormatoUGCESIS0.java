package com.bbva.ccol.loanssimulate.dao.modelsimulate.ugsi;

import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.Formato;
import com.bbva.jee.arq.spring.core.host.TipoCampo;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;

import java.math.BigDecimal;
import java.util.Date;



/**
 * Formato de datos <code>UGCESIS0</code> de la transacci&oacute;n <code>UGSI</code>
 * 
 * @author Arquitectura Spring BBVA
 */
@Formato(nombre = "UGCESIS0")
@RooJavaBean
@RooToString
@RooSerializable
public class FormatoUGCESIS0 {
	
	/**
	 * <p>Campo <code>DESCRIP</code>, &iacute;ndice: <code>1</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 1, nombre = "DESCRIP", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 60, longitudMaxima = 60)
	private String descrip;
	
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
	 * <p>Campo <code>NUMCUOT</code>, &iacute;ndice: <code>4</code>, tipo: <code>ENTERO</code>
	 */
	@Campo(indice = 4, nombre = "NUMCUOT", tipo = TipoCampo.ENTERO, longitudMinima = 3, longitudMaxima = 3)
	private Integer numcuot;
	
	/**
	 * <p>Campo <code>FRECUEN</code>, &iacute;ndice: <code>5</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 5, nombre = "FRECUEN", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 9, longitudMaxima = 9)
	private String frecuen;
	
	/**
	 * <p>Campo <code>SCORE</code>, &iacute;ndice: <code>6</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 6, nombre = "SCORE", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 14, longitudMaxima = 14)
	private String score;
	
	/**
	 * <p>Campo <code>DESPRET</code>, &iacute;ndice: <code>7</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 7, nombre = "DESPRET", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 25, longitudMaxima = 25)
	private String despret;
	
	/**
	 * <p>Campo <code>PRESTIP</code>, &iacute;ndice: <code>8</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 8, nombre = "PRESTIP", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 18, longitudMaxima = 18)
	private String prestip;
	
	/**
	 * <p>Campo <code>PGRACIA</code>, &iacute;ndice: <code>9</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 9, nombre = "PGRACIA", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 7, longitudMaxima = 7)
	private String pgracia;
	
	/**
	 * <p>Campo <code>CPGRACI</code>, &iacute;ndice: <code>10</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 10, nombre = "CPGRACI", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String cpgraci;
	
	/**
	 * <p>Campo <code>PAGOSST</code>, &iacute;ndice: <code>11</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 11, nombre = "PAGOSST", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 7, longitudMaxima = 7)
	private String pagosst;
	
	/**
	 * <p>Campo <code>CANTPER</code>, &iacute;ndice: <code>12</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 12, nombre = "CANTPER", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String cantper;
	
	/**
	 * <p>Campo <code>FECHSIM</code>, &iacute;ndice: <code>13</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 13, nombre = "FECHSIM", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 19, longitudMaxima = 19)
	private String fechsim;
	
	/**
	 * <p>Campo <code>FECHLIM</code>, &iacute;ndice: <code>14</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 14, nombre = "FECHLIM", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 2, longitudMaxima = 2)
	private String fechlim;
	
	/**
	 * <p>Campo <code>FECHAAP</code>, &iacute;ndice: <code>15</code>, tipo: <code>FECHA</code>
	 */
	@Campo(indice = 15, nombre = "FECHAAP", tipo = TipoCampo.FECHA, longitudMinima = 10, longitudMaxima = 10, formato = "yyyy-MM-dd")
	private Date fechaap;
	
	/**
	 * <p>Campo <code>NOMCOMP</code>, &iacute;ndice: <code>16</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 16, nombre = "NOMCOMP", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 20, longitudMaxima = 20)
	private String nomcomp;
	
	/**
	 * <p>Campo <code>NOMCOMS</code>, &iacute;ndice: <code>17</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 17, nombre = "NOMCOMS", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 20, longitudMaxima = 20)
	private String nomcoms;
	
	/**
	 * <p>Campo <code>SUBPROS</code>, &iacute;ndice: <code>18</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 18, nombre = "SUBPROS", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 4, longitudMaxima = 4)
	private String subpros;
	
	/**
	 * <p>Campo <code>PRODID</code>, &iacute;ndice: <code>19</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 19, nombre = "PRODID", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 2, longitudMaxima = 2)
	private String prodid;
	
	/**
	 * <p>Campo <code>TIPSUBP</code>, &iacute;ndice: <code>20</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 20, nombre = "TIPSUBP", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 10, longitudMaxima = 10)
	private String tipsubp;
	
	/**
	 * <p>Campo <code>VALPRES</code>, &iacute;ndice: <code>21</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 21, nombre = "VALPRES", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 17, longitudMaxima = 17)
	private String valpres;
	
	/**
	 * <p>Campo <code>DIVPRES</code>, &iacute;ndice: <code>22</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 22, nombre = "DIVPRES", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String divpres;
	
}