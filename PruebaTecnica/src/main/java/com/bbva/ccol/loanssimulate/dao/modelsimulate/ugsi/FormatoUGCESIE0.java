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
 * Formato de datos <code>UGCESIE0</code> de la transacci&oacute;n <code>UGSI</code>
 * 
 * @author Arquitectura Spring BBVA
 */
@Formato(nombre = "UGCESIE0")
@RooJavaBean
@RooToString
@RooSerializable
public class FormatoUGCESIE0 {

	/**
	 * <p>Campo <code>RATEID</code>, &iacute;ndice: <code>1</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 1, nombre = "RATEID", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 27, longitudMaxima = 27)
	private String rateid;
	
	/**
	 * <p>Campo <code>MODE</code>, &iacute;ndice: <code>2</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 2, nombre = "MODE", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 10, longitudMaxima = 10)
	private String mode;
	
	/**
	 * <p>Campo <code>PERCENT</code>, &iacute;ndice: <code>3</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 3, nombre = "PERCENT", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 8, longitudMaxima = 8)
	private String percent;
	
	/**
	 * <p>Campo <code>TIPOCRE</code>, &iacute;ndice: <code>4</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 4, nombre = "TIPOCRE", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 18, longitudMaxima = 18)
	private String tipocre;
	
	/**
	 * <p>Campo <code>VLRSOLI</code>, &iacute;ndice: <code>5</code>, tipo: <code>ENTERO</code>
	 */
	@Campo(indice = 5, nombre = "VLRSOLI", tipo = TipoCampo.ENTERO, longitudMinima = 17, longitudMaxima = 17)
	private Long vlrsoli;
	
	/**
	 * <p>Campo <code>DIVSOL</code>, &iacute;ndice: <code>6</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 6, nombre = "DIVSOL", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String divsol;
	
	/**
	 * <p>Campo <code>NCUOTAS</code>, &iacute;ndice: <code>7</code>, tipo: <code>ENTERO</code>
	 */
	@Campo(indice = 7, nombre = "NCUOTAS", tipo = TipoCampo.ENTERO, longitudMinima = 3, longitudMaxima = 3)
	private Integer ncuotas;
	
	/**
	 * <p>Campo <code>FRECUEN</code>, &iacute;ndice: <code>8</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 8, nombre = "FRECUEN", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 9, longitudMaxima = 9)
	private String frecuen;
	
	/**
	 * <p>Campo <code>INGTIPO</code>, &iacute;ndice: <code>9</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 9, nombre = "INGTIPO", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 50, longitudMaxima = 50)
	private String ingtipo;
	
	/**
	 * <p>Campo <code>INGDESC</code>, &iacute;ndice: <code>10</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 10, nombre = "INGDESC", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 50, longitudMaxima = 50)
	private String ingdesc;
	
	/**
	 * <p>Campo <code>INGRESO</code>, &iacute;ndice: <code>11</code>, tipo: <code>ENTERO</code>
	 */
	@Campo(indice = 11, nombre = "INGRESO", tipo = TipoCampo.ENTERO, longitudMinima = 17, longitudMaxima = 17)
	private Long ingreso;
	
	/**
	 * <p>Campo <code>DIVING</code>, &iacute;ndice: <code>12</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 12, nombre = "DIVING", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String diving;
	
	/**
	 * <p>Campo <code>INGCONC</code>, &iacute;ndice: <code>13</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 13, nombre = "INGCONC", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 50, longitudMaxima = 50)
	private String ingconc;
	
	/**
	 * <p>Campo <code>INGFREC</code>, &iacute;ndice: <code>14</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 14, nombre = "INGFREC", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 9, longitudMaxima = 9)
	private String ingfrec;
	
	/**
	 * <p>Campo <code>FECNACI</code>, &iacute;ndice: <code>15</code>, tipo: <code>FECHA</code>
	 */
	@Campo(indice = 15, nombre = "FECNACI", tipo = TipoCampo.FECHA, longitudMinima = 10, longitudMaxima = 10, formato = "yyyy-MM-dd")
	private Date fecnaci;
	
	/**
	 * <p>Campo <code>AUTBURO</code>, &iacute;ndice: <code>16</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 16, nombre = "AUTBURO", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String autburo;
	
	/**
	 * <p>Campo <code>BURO</code>, &iacute;ndice: <code>17</code>, tipo: <code>ENTERO</code>
	 */
	@Campo(indice = 17, nombre = "BURO", tipo = TipoCampo.ENTERO, longitudMinima = 4, longitudMaxima = 4)
	private Integer buro;
	
	/**
	 * <p>Campo <code>TIPDOCU</code>, &iacute;ndice: <code>18</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 18, nombre = "TIPDOCU", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 8, longitudMaxima = 8)
	private String tipdocu;
	
	/**
	 * <p>Campo <code>CLAIDEN</code>, &iacute;ndice: <code>19</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 19, nombre = "CLAIDEN", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 15, longitudMaxima = 15)
	private String claiden;
	
	/**
	 * <p>Campo <code>SUBPROD</code>, &iacute;ndice: <code>20</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 20, nombre = "SUBPROD", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 4, longitudMaxima = 4)
	private String subprod;
	
	/**
	 * <p>Campo <code>GAMAVEH</code>, &iacute;ndice: <code>21</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 21, nombre = "GAMAVEH", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 12, longitudMaxima = 12)
	private String gamaveh;
	
	/**
	 * <p>Campo <code>TIPOVEH</code>, &iacute;ndice: <code>22</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 22, nombre = "TIPOVEH", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 14, longitudMaxima = 14)
	private String tipoveh;
	
	/**
	 * <p>Campo <code>ESTAVEH</code>, &iacute;ndice: <code>23</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 23, nombre = "ESTAVEH", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String estaveh;
	
	/**
	 * <p>Campo <code>PGRACIA</code>, &iacute;ndice: <code>24</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 24, nombre = "PGRACIA", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 7, longitudMaxima = 7)
	private String pgracia;
	
	/**
	 * <p>Campo <code>CPGRACI</code>, &iacute;ndice: <code>25</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 25, nombre = "CPGRACI", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String cpgraci;
	
	/**
	 * <p>Campo <code>PAGOPST</code>, &iacute;ndice: <code>26</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 26, nombre = "PAGOPST", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 7, longitudMaxima = 7)
	private String pagopst;
	
	/**
	 * <p>Campo <code>CANTPER</code>, &iacute;ndice: <code>27</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 27, nombre = "CANTPER", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String cantper;
	
	/**
	 * <p>Campo <code>INDICID</code>, &iacute;ndice: <code>28</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 28, nombre = "INDICID", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 33, longitudMaxima = 33)
	private String indicid;
	
	/**
	 * <p>Campo <code>PARTCID</code>, &iacute;ndice: <code>29</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 29, nombre = "PARTCID", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 4, longitudMaxima = 4)
	private String partcid;
	
	/**
	 * <p>Campo <code>TIPOPAR</code>, &iacute;ndice: <code>30</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 30, nombre = "TIPOPAR", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 10, longitudMaxima = 10)
	private String tipopar;
	
	/**
	 * <p>Campo <code>FNACPAR</code>, &iacute;ndice: <code>31</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 31, nombre = "FNACPAR", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 10, longitudMaxima = 10)
	private String fnacpar;
	
	/**
	 * <p>Campo <code>MUESCUO</code>, &iacute;ndice: <code>32</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 32, nombre = "MUESCUO", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String muescuo;
	
	/**
	 * <p>Campo <code>FECHCAL</code>, &iacute;ndice: <code>33</code>, tipo: <code>FECHA</code>
	 */
	@Campo(indice = 33, nombre = "FECHCAL", tipo = TipoCampo.FECHA, longitudMinima = 10, longitudMaxima = 10, formato = "yyyy-MM-dd")
	private Date fechcal;
	
	/**
	 * <p>Campo <code>NUMCHAS</code>, &iacute;ndice: <code>34</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 34, nombre = "NUMCHAS", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 20, longitudMaxima = 20)
	private String numchas;
	
	/**
	 * <p>Campo <code>MODELOV</code>, &iacute;ndice: <code>35</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 35, nombre = "MODELOV", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 4, longitudMaxima = 4)
	private String modelov;
	
	/**
	 * <p>Campo <code>MARCAVE</code>, &iacute;ndice: <code>36</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 36, nombre = "MARCAVE", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 15, longitudMaxima = 15)
	private String marcave;
	
	/**
	 * <p>Campo <code>PLACAVE</code>, &iacute;ndice: <code>37</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 37, nombre = "PLACAVE", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 7, longitudMaxima = 7)
	private String placave;
	
	/**
	 * <p>Campo <code>ANIOVEH</code>, &iacute;ndice: <code>38</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 38, nombre = "ANIOVEH", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 4, longitudMaxima = 4)
	private String anioveh;
	
	/**
	 * <p>Campo <code>VALVEHI</code>, &iacute;ndice: <code>39</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 39, nombre = "VALVEHI", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 17, longitudMaxima = 17)
	private String valvehi;
	
	/**
	 * <p>Campo <code>DIVISVE</code>, &iacute;ndice: <code>40</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 40, nombre = "DIVISVE", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String divisve;
	
	/**
	 * <p>Campo <code>TIPSUBP</code>, &iacute;ndice: <code>41</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 41, nombre = "TIPSUBP", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 4, longitudMaxima = 4)
	private String tipsubp;
	
	/**
	 * <p>Campo <code>PRODID</code>, &iacute;ndice: <code>42</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 42, nombre = "PRODID", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 2, longitudMaxima = 2)
	private String prodid;
	
	/**
	 * <p>Campo <code>LIMFECH</code>, &iacute;ndice: <code>43</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 43, nombre = "LIMFECH", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 2, longitudMaxima = 2)
	private String limfech;
	
	/**
	 * <p>Campo <code>APLFECH</code>, &iacute;ndice: <code>44</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 44, nombre = "APLFECH", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 10, longitudMaxima = 10)
	private String aplfech;
	
	/**
	 * <p>Campo <code>IDPRODU</code>, &iacute;ndice: <code>45</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 45, nombre = "IDPRODU", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 4, longitudMaxima = 4)
	private String idprodu;
	
	/**
	 * <p>Campo <code>TIPOPRO</code>, &iacute;ndice: <code>46</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 46, nombre = "TIPOPRO", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 11, longitudMaxima = 11)
	private String tipopro;
	
	/**
	 * <p>Campo <code>COMPPRO</code>, &iacute;ndice: <code>47</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 47, nombre = "COMPPRO", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 30, longitudMaxima = 30)
	private String comppro;
	
	/**
	 * <p>Campo <code>NUMCONT</code>, &iacute;ndice: <code>48</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 48, nombre = "NUMCONT", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 18, longitudMaxima = 18)
	private String numcont;
	
	/**
	 * <p>Campo <code>TIPOCON</code>, &iacute;ndice: <code>49</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 49, nombre = "TIPOCON", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 14, longitudMaxima = 14)
	private String tipocon;
	
	/**
	 * <p>Campo <code>METPAGO</code>, &iacute;ndice: <code>50</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 50, nombre = "METPAGO", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 2, longitudMaxima = 2)
	private String metpago;
	
	/**
	 * <p>Campo <code>DETENTR</code>, &iacute;ndice: <code>51</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 51, nombre = "DETENTR", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 8, longitudMaxima = 8)
	private String detentr;
	
	/**
	 * <p>Campo <code>FECPLAN</code>, &iacute;ndice: <code>52</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 52, nombre = "FECPLAN", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 7, longitudMaxima = 7)
	private String fecplan;
	
	/**
	 * <p>Campo <code>NUMFREC</code>, &iacute;ndice: <code>53</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 53, nombre = "NUMFREC", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String numfrec;
	
	/**
	 * <p>Campo <code>CANTVAL</code>, &iacute;ndice: <code>54</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 54, nombre = "CANTVAL", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 17, longitudMaxima = 17)
	private String cantval;
	
	/**
	 * <p>Campo <code>HASAUTH</code>, &iacute;ndice: <code>55</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 55, nombre = "HASAUTH", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 1, longitudMaxima = 1)
	private String hasauth;
	
	/**
	 * <p>Campo <code>IDVEHIC</code>, &iacute;ndice: <code>56</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 56, nombre = "IDVEHIC", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String idvehic;
	
	/**
	 * <p>Campo <code>AMONTO</code>, &iacute;ndice: <code>57</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 57, nombre = "AMONTO", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 17, longitudMaxima = 17)
	private String amonto;
	
	/**
	 * <p>Campo <code>CURRENC</code>, &iacute;ndice: <code>58</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 58, nombre = "CURRENC", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String currenc;
	
	/**
	 * <p>Campo <code>TIPBIEN</code>, &iacute;ndice: <code>59</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 59, nombre = "TIPBIEN", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 10, longitudMaxima = 10)
	private String tipbien;
	
	/**
	 * <p>Campo <code>VALORV</code>, &iacute;ndice: <code>60</code>, tipo: <code>DECIMAL</code>
	 */
	@Campo(indice = 60, nombre = "VALORV", tipo = TipoCampo.DECIMAL, longitudMinima = 15, longitudMaxima = 15, decimales = 2)
	private BigDecimal valorv;
	
	/**
	 * <p>Campo <code>CURRENV</code>, &iacute;ndice: <code>61</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 61, nombre = "CURRENV", tipo = TipoCampo.ALFANUMERICO, longitudMinima = 3, longitudMaxima = 3)
	private String currenv;
	
}