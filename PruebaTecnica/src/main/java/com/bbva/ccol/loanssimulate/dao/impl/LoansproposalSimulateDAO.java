package com.bbva.ccol.loanssimulate.dao.impl;

import com.bbva.ccol.loanssimulate.business.dto.DTOIntDataListProposalLoanAdd;
import com.bbva.ccol.loanssimulate.business.dto.DTOIntProposalSimulate;
import com.bbva.ccol.loanssimulate.dao.ILoansproposalSimulateDAO;
import com.bbva.ccol.loanssimulate.dao.tx.TxCreateSimulateV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoansproposalSimulateDAO implements ILoansproposalSimulateDAO {

    @Autowired
    private TxCreateSimulateV1 txCreateSimulateV1;

    /**
     * @param dtoIntProposalSimulate
     * @see ILoansproposalSimulateDAO#createLoanProposalSimulateV1(DTOIntProposalSimulate)
     */
    @Override
    public DTOIntDataListProposalLoanAdd createLoanProposalSimulateV1(DTOIntProposalSimulate dtoIntProposalSimulate) {
        return txCreateSimulateV1.invoke(dtoIntProposalSimulate);
    }

}