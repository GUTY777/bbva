package com.bbva.ccol.loanssimulate.business;

import com.bbva.ccol.loanssimulate.business.dto.DTOIntDataListProposalLoanAdd;
import com.bbva.ccol.loanssimulate.business.dto.DTOIntProposalSimulate;

public interface ISrvIntLoansproposalSimulate {
	/**
	 * Metodo que valida los parametros de entrada y salida
	 *
	 * @param dtoIntProposalSimulate Objeto
	 * @return {@link DTOIntDataListProposalLoanAdd}
	 */
	DTOIntDataListProposalLoanAdd createLoanProposalSimulateV1(DTOIntProposalSimulate dtoIntProposalSimulate);

}