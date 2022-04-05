package com.bbva.ccol.loanssimulate.dao.tx;

import com.bbva.ccol.commons.rm.utils.tx.impl.ElevenBbvaTransactionToObject;
import com.bbva.ccol.loanssimulate.business.dto.DTOIntDataListProposalLoanAdd;
import com.bbva.ccol.loanssimulate.business.dto.DTOIntProposalSimulate;
import com.bbva.ccol.loanssimulate.dao.modelsimulate.ugsi.*;
import com.bbva.ccol.loanssimulate.dao.tx.mapper.ITxLoanProposalSimulateMapper;
import com.bbva.jee.arq.spring.core.host.InvocadorTransaccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
 * Clic and Pay Canales
 * Fecha: 26/09/2020
 * @author GFI
 *
 */
@Service
public class TxCreateSimulateV1 extends
		ElevenBbvaTransactionToObject<DTOIntProposalSimulate, FormatoUGCESIE0, DTOIntDataListProposalLoanAdd, FormatoUGCESIS0, FormatoUGCESIS1, FormatoUGCESIS2, FormatoUGCESIS3, FormatoUGCESIS4, FormatoUGCESIS5, FormatoUGCESIS6, FormatoUGCESIS7, FormatoUGCESIS8, FormatoUGCESIS9, FormatoUGCESI10> {

	@Autowired
    private ITxLoanProposalSimulateMapper txLoanMapper;

    @Resource(name = "transaccionUgsi")
    private InvocadorTransaccion<PeticionTransaccionUgsi, RespuestaTransaccionUgsi> transaccionUgsi;

	@Override
	protected InvocadorTransaccion<PeticionTransaccionUgsi, RespuestaTransaccionUgsi> getTransaction() {
		return transaccionUgsi;
	}

	@Override
	protected FormatoUGCESIE0 mapDtoInToRequestFormat(DTOIntProposalSimulate dtoIn) {
		return txLoanMapper.mapInCreateLoanProposalSimulateV1(dtoIn);
	}

	@Override
	protected DTOIntDataListProposalLoanAdd mapResponseFormatAToDtoOut(FormatoUGCESIS0 formatOutput,
			DTOIntProposalSimulate dtoIn, DTOIntDataListProposalLoanAdd dtoOut) {
		return txLoanMapper.mapOutCreateLoanProposalSimulateV1FormatoUGCESIS0(formatOutput, dtoOut);
	}

	@Override
	protected DTOIntDataListProposalLoanAdd mapResponseFormatBToDtoOut(FormatoUGCESIS1 formatOutput,
			DTOIntProposalSimulate dtoIn, DTOIntDataListProposalLoanAdd dtoOut) {
		return txLoanMapper.mapOutCreateLoanProposalSimulateV1FormatoUGCESIS1(formatOutput, dtoOut);
	}

	@Override
	protected DTOIntDataListProposalLoanAdd mapResponseFormatCToDtoOut(FormatoUGCESIS2 formatOutput,
			DTOIntProposalSimulate dtoIn, DTOIntDataListProposalLoanAdd dtoOut) {
		return txLoanMapper.mapOutCreateLoanProposalSimulateV1FormatoUGCESIS2(formatOutput, dtoOut);
	}

	@Override
	protected DTOIntDataListProposalLoanAdd mapResponseFormatDToDtoOut(FormatoUGCESIS3 formatOutput,
			DTOIntProposalSimulate dtoIn, DTOIntDataListProposalLoanAdd dtoOut) {
		return txLoanMapper.mapOutCreateLoanProposalSimulateV1FormatoUGCESIS3(formatOutput, dtoOut);
	}

	@Override
	protected DTOIntDataListProposalLoanAdd mapResponseFormatEToDtoOut(FormatoUGCESIS4 formatOutput,
			DTOIntProposalSimulate dtoIn, DTOIntDataListProposalLoanAdd dtoOut) {
		return txLoanMapper.mapOutCreateLoanProposalSimulateV1FormatoUGCESIS4(formatOutput, dtoOut);
	}

	@Override
	protected DTOIntDataListProposalLoanAdd mapResponseFormatFToDtoOut(FormatoUGCESIS5 formatOutput,
			DTOIntProposalSimulate dtoIn, DTOIntDataListProposalLoanAdd dtoOut) {
		return txLoanMapper.mapOutCreateLoanProposalSimulateV1FormatoUGCESIS5(formatOutput, dtoOut);
	}

	@Override
	protected DTOIntDataListProposalLoanAdd mapResponseFormatGToDtoOut(FormatoUGCESIS6 formatOutput,
			DTOIntProposalSimulate dtoIn, DTOIntDataListProposalLoanAdd dtoOut) {
		return txLoanMapper.mapOutCreateLoanProposalSimulateV1FormatoUGCESIS6(formatOutput, dtoOut);
	}

	@Override
	protected DTOIntDataListProposalLoanAdd mapResponseFormatHToDtoOut(FormatoUGCESIS7 formatOutput,
			DTOIntProposalSimulate dtoIn, DTOIntDataListProposalLoanAdd dtoOut) {
		return txLoanMapper.mapOutCreateLoanProposalSimulateV1FormatoUGCESIS7(formatOutput, dtoOut);
	}

	@Override
	protected DTOIntDataListProposalLoanAdd mapResponseFormatIToDtoOut(FormatoUGCESIS8 formatOutput,
			DTOIntProposalSimulate dtoIn, DTOIntDataListProposalLoanAdd dtoOut) {
		return txLoanMapper.mapOutCreateLoanProposalSimulateV1FormatoUGCESIS8(formatOutput, dtoOut);
	}

	@Override
	protected DTOIntDataListProposalLoanAdd mapResponseFormatJToDtoOut(FormatoUGCESIS9 formatOutput,
			DTOIntProposalSimulate dtoIn, DTOIntDataListProposalLoanAdd dtoOut) {
		return txLoanMapper.mapOutCreateLoanProposalSimulateV1FormatoUGCESIS9(formatOutput, dtoOut);
	}

	@Override
	protected DTOIntDataListProposalLoanAdd mapResponseFormatKToDtoOut(FormatoUGCESI10 formatOutput,
			DTOIntProposalSimulate dtoIn, DTOIntDataListProposalLoanAdd dtoOut) {
		return txLoanMapper.mapOutCreateLoanProposalSimulateV1FormatoUGCESI10(formatOutput, dtoOut);
	}

}
