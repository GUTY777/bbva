package com.bbva.ccol.loanssimulate.business.impl;

import com.bbva.ccol.commons.rm.utils.CallSequenceMessageEnum;
import com.bbva.ccol.commons.rm.utils.LogUtils;
import com.bbva.ccol.commons.rm.utils.validator.DtoValidator;
import com.bbva.ccol.loanssimulate.business.ISrvIntLoansproposalSimulate;
import com.bbva.ccol.loanssimulate.dao.ILoansproposalSimulateDAO;
import com.bbva.ccol.loanssimulate.business.dto.DTOIntDataListProposalLoanAdd;
import com.bbva.ccol.loanssimulate.business.dto.DTOIntProposalSimulate;
import com.bbva.jee.arq.spring.core.servicing.utils.BusinessServicesToolKit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SrvIntLoansproposalSimulate implements ISrvIntLoansproposalSimulate {

    private static Log log = LogFactory.getLog(SrvIntLoansproposalSimulate.class);

    @Autowired
    private ILoansproposalSimulateDAO loansSimulateDAO;

    @Autowired
    BusinessServicesToolKit bussinesToolKit;
    /**
     * @see ISrvIntLoansproposalSimulate#createLoanProposalSimulateV1(DTOIntProposalSimulate) DTOIntProposalSimulateAdd, HashMap)
     */
    @Override
    public DTOIntDataListProposalLoanAdd createLoanProposalSimulateV1(DTOIntProposalSimulate dtoIntProposalSimulate) {

        log.info(LogUtils.buildLogMessage(CallSequenceMessageEnum.SERVICE_REQUEST, dtoIntProposalSimulate));

        DtoValidator.validate(dtoIntProposalSimulate, IDTOInCreateSimulate.class);
        final DTOIntDataListProposalLoanAdd dtoIntDataListProposalLoan = loansSimulateDAO.createLoanProposalSimulateV1(dtoIntProposalSimulate);
        DtoValidator.validate(dtoIntDataListProposalLoan, IDTOOutCreateSimulate.class);
        log.info(LogUtils.buildLogMessage(CallSequenceMessageEnum.SERVICE_RESPONSE, dtoIntDataListProposalLoan));

        return dtoIntDataListProposalLoan;
    }
}
