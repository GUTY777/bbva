package com.bbva.ccol.loanssimulate.dao;

import com.bbva.ccol.loanssimulate.business.dto.DTOIntDataListProposalLoanAdd;
import com.bbva.ccol.loanssimulate.business.dto.DTOIntProposalSimulate;

public interface ILoansproposalSimulateDAO {

	/**
	 * Metodo encargado de llamar a host
	 *
	 * @param dtoIntProposalSimulate
	 * @return DTOIntDataListProposalLoanAdd
	 */
	DTOIntDataListProposalLoanAdd createLoanProposalSimulateV1(DTOIntProposalSimulate dtoIntProposalSimulate);


}
