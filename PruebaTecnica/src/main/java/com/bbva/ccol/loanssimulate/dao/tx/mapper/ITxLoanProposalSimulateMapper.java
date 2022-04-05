package com.bbva.ccol.loanssimulate.dao.tx.mapper;

import com.bbva.ccol.loanssimulate.business.dto.DTOIntDataListProposalLoanAdd;
import com.bbva.ccol.loanssimulate.business.dto.DTOIntProposalSimulate;
import com.bbva.ccol.loanssimulate.dao.modelsimulate.ugsi.*;

/**
 * Created by Entelgy on 02/08/2016.
 */
public interface ITxLoanProposalSimulateMapper {
	/**
	 * Metodo encargado de mapear los atributos de un objeto interno al formato de entrada de host
	 *
	 * @param dtoIn Objeto con la informacion del prestamo
	 * @return {@link FormatoUGCESIE0} Objeto de entrada con la informacion del contrato
	 */
	FormatoUGCESIE0 mapInCreateLoanProposalSimulateV1(DTOIntProposalSimulate dtoIn);

	/**
	 * Metodo encargado de mapear los atributos del formato de salida de host a un objeto interno
	 *
	 * @param formatOutput Objeto de salida con la informacion del contrato relacionado del prestamo
	 * @return {@link DTOIntDataListProposalLoanAdd} Objeto de salida con la informacion de los
	 * contratos relacionados del prestamo
	 */
	DTOIntDataListProposalLoanAdd mapOutCreateLoanProposalSimulateV1FormatoUGCESIS0(FormatoUGCESIS0 formatOutput, DTOIntDataListProposalLoanAdd dtoOut);

	/**
	 * Metodo encargado de mapear los atributos del formato de salida de host a un objeto interno
	 *
	 * @param formatOutput Objeto de salida con la informacion del contrato relacionado del prestamo
	 * @return {@link DTOIntDataListProposalLoanAdd} Objeto de salida con la informacion de los
	 * contratos relacionados del prestamo
	 */
	DTOIntDataListProposalLoanAdd mapOutCreateLoanProposalSimulateV1FormatoUGCESIS1(FormatoUGCESIS1 formatOutput, DTOIntDataListProposalLoanAdd dtoOut);

	/**
	 * Metodo encargado de mapear los atributos del formato de salida de host a un objeto interno
	 *
	 * @param formatOutput Objeto de salida con la informacion del contrato relacionado del prestamo
	 * @return {@link DTOIntDataListProposalLoanAdd} Objeto de salida con la informacion de los
	 * contratos relacionados del prestamo
	 */
	DTOIntDataListProposalLoanAdd mapOutCreateLoanProposalSimulateV1FormatoUGCESIS2(FormatoUGCESIS2 formatOutput, DTOIntDataListProposalLoanAdd dtoOut);

	/**
	 * Metodo encargado de mapear los atributos del formato de salida de host a un objeto interno
	 *
	 * @param formatOutput Objeto de salida con la informacion del contrato relacionado del prestamo
	 * @return {@link DTOIntDataListProposalLoanAdd} Objeto de salida con la informacion de los
	 * contratos relacionados del prestamo
	 */
	DTOIntDataListProposalLoanAdd mapOutCreateLoanProposalSimulateV1FormatoUGCESIS3(FormatoUGCESIS3 formatOutput, DTOIntDataListProposalLoanAdd dtoOut);

	/**
	 * Metodo encargado de mapear los atributos del formato de salida de host a un objeto interno
	 *
	 * @param formatOutput Objeto de salida con la informacion del contrato relacionado del prestamo
	 * @return {@link DTOIntDataListProposalLoanAdd} Objeto de salida con la informacion de los
	 * contratos relacionados del prestamo
	 */
	DTOIntDataListProposalLoanAdd mapOutCreateLoanProposalSimulateV1FormatoUGCESIS4(FormatoUGCESIS4 formatOutput, DTOIntDataListProposalLoanAdd dtoOut);

	/**
	 * Metodo encargado de mapear los atributos del formato de salida de host a un objeto interno
	 *
	 * @param formatOutput Objeto de salida con la informacion del contrato relacionado del prestamo
	 * @return {@link DTOIntDataListProposalLoanAdd} Objeto de salida con la informacion de los
	 * contratos relacionados del prestamo
	 */
	DTOIntDataListProposalLoanAdd mapOutCreateLoanProposalSimulateV1FormatoUGCESIS5(FormatoUGCESIS5 formatOutput, DTOIntDataListProposalLoanAdd dtoOut);

	/**
	 * Metodo encargado de mapear los atributos del formato de salida de host a un objeto interno
	 *
	 * @param formatOutput Objeto de salida con la informacion del contrato relacionado del prestamo
	 * @return {@link DTOIntDataListProposalLoanAdd} Objeto de salida con la informacion de los
	 * contratos relacionados del prestamo
	 */
	DTOIntDataListProposalLoanAdd mapOutCreateLoanProposalSimulateV1FormatoUGCESIS6(FormatoUGCESIS6 formatOutput, DTOIntDataListProposalLoanAdd dtoOut);

	/**
	 * Metodo encargado de mapear los atributos del formato de salida de host a un objeto interno
	 *
	 * @param formatOutput Objeto de salida con la informacion del contrato relacionado del prestamo
	 * @return {@link DTOIntDataListProposalLoanAdd} Objeto de salida con la informacion de los
	 * contratos relacionados del prestamo
	 */
	DTOIntDataListProposalLoanAdd mapOutCreateLoanProposalSimulateV1FormatoUGCESIS7(FormatoUGCESIS7 formatOutput, DTOIntDataListProposalLoanAdd dtoOut);

	/**
	 * Metodo encargado de mapear los atributos del formato de salida de host a un objeto interno
	 *
	 * @param formatOutput Objeto de salida con la informacion del contrato relacionado del prestamo
	 * @return {@link DTOIntDataListProposalLoanAdd} Objeto de salida con la informacion de los
	 * contratos relacionados del prestamo
	 */
	DTOIntDataListProposalLoanAdd mapOutCreateLoanProposalSimulateV1FormatoUGCESIS8(FormatoUGCESIS8 formatOutput, DTOIntDataListProposalLoanAdd dtoOut);

	/**
	 * Metodo encargado de mapear los atributos del formato de salida de host a un objeto interno
	 *
	 * @param formatOutput Objeto de salida con la informacion del contrato relacionado del prestamo
	 * @return {@link DTOIntDataListProposalLoanAdd} Objeto de salida con la informacion de los
	 * contratos relacionados del prestamo
	 */
	DTOIntDataListProposalLoanAdd mapOutCreateLoanProposalSimulateV1FormatoUGCESIS9(FormatoUGCESIS9 formatOutput, DTOIntDataListProposalLoanAdd dtoOut);
	/**
	 * Metodo encargado de mapear los atributos del formato de salida de host a un objeto interno
	 *
	 * @param formatOutput Objeto de salida con la informacion del contrato relacionado del prestamo
	 * @return {@link DTOIntDataListProposalLoanAdd} Objeto de salida con la informacion de los
	 * contratos relacionados del prestamo
	 */
	DTOIntDataListProposalLoanAdd mapOutCreateLoanProposalSimulateV1FormatoUGCESI10(FormatoUGCESI10 formatOutput, DTOIntDataListProposalLoanAdd dtoOut);

}