package com.bbva.ccol.loanssimulate.dao.tx.mapper.impl;

import com.bbva.ccol.commons.rm.utils.converters.DateConverter;
import com.bbva.ccol.commons.rm.utils.converters.DateFormatEnum;
import com.bbva.ccol.commons.rm.utils.converters.NumberConverter;
import com.bbva.ccol.loanssimulate.business.dto.*;
import com.bbva.ccol.loanssimulate.dao.modelsimulate.ugsi.*;
import com.bbva.ccol.loanssimulate.dao.tx.mapper.ITxLoanProposalSimulateMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class TxLoanProposalSimulateMapper implements ITxLoanProposalSimulateMapper {

    private static Log log = LogFactory.getLog(TxLoanProposalSimulateMapper.class);

    /**
     * @see ITxLoanProposalSimulateMapper#mapInCreateLoanProposalSimulateV1(DTOIntProposalSimulate)
     */
    @Override
    public FormatoUGCESIE0 mapInCreateLoanProposalSimulateV1(DTOIntProposalSimulate dtoIn) {

        //Entrada del servicio
        final FormatoUGCESIE0 format = new FormatoUGCESIE0();
        if (dtoIn != null) {
            format.setAutburo(enumCondicion(dtoIn.getIsBureauValidationAuthorized()));
            format.setHasauth(enumCondicion(dtoIn.getHasStoredAuthorized()));
            format.setFecnaci(dtoIn.getBirthDate());
            format.setAplfech(new DateConverter().toString(new DateConverter().toDateTime(dtoIn.getApplicationDate()), DateFormatEnum.YYYY_MM_DD_TIME_FORMAT.getFormat()));
            format.setLimfech(new NumberConverter().toString(dtoIn.getPaymentDueDay()));
            format.setMuescuo(enumCondicion(dtoIn.getIsReducedSchedule()));
            mapInProduct(dtoIn, format);
            mapInIncome(dtoIn, format);
            mapInInstallmentPlan(dtoIn, format);
            mapInRequestedAmount(dtoIn, format);
            mapInIdentityDocument(dtoIn, format);
            mapInRates(dtoIn, format);
            mapInGoods(dtoIn, format);
            mapintLoanType(dtoIn, format);
            mapInAdditionalPaymentsInstallments(dtoIn, format);
            mapInParticipants(dtoIn, format);
            mapInPeriods(dtoIn, format);
            mapInIndicators(dtoIn, format);
            mapInAddtionalProducts(dtoIn, format);
            mapInStatementDeliveries(dtoIn, format);
        }
        return format;
    }

    private String enumCondicion(Boolean var)
    {
        if (var!=null) {
            if (var) {
                return "S";
            }
        }
        return "N";
    }
    private void mapintLoanType(DTOIntProposalSimulate dtoIn, FormatoUGCESIE0 format) {
        //LoanType
        if (dtoIn.getLoanType() != null) {
            format.setTipocre(dtoIn.getLoanType().getIdLoan());
        }
    }

    private void mapInGoods(DTOIntProposalSimulate dtoIn, FormatoUGCESIE0 format) {
        //Goods
        if (dtoIn.getGoods() != null) {
            format.setIdvehic(dtoIn.getGoods().getId());
            if (dtoIn.getGoods().getDtoIntGoodType() != null) {
                format.setTipbien(dtoIn.getGoods().getDtoIntGoodType().getId());
            }
            if (dtoIn.getGoods().getDtoIntDetail() != null) {
                if (dtoIn.getGoods().getDtoIntDetail() instanceof DTOIntProperty) {
                    format.setValorv(((DTOIntProperty) dtoIn.getGoods().getDtoIntDetail()).getDtoIntEstimatedValue().getAmount());
                    format.setCurrenv(((DTOIntProperty) dtoIn.getGoods().getDtoIntDetail()).getDtoIntEstimatedValue().getCurrency());
                }
                mapInGoodsDetail(dtoIn, format);
            }
        }
    }

    private void mapInGoodsDetail(DTOIntProposalSimulate dtoIn, FormatoUGCESIE0 format) {
        if (dtoIn.getGoods().getDtoIntDetail() instanceof DTOIntDetail) {
            format.setGamaveh(formatoStringCeros(((DTOIntDetail) dtoIn.getGoods().getDtoIntDetail()).getVersionDetail(), 12));
            format.setEstaveh(((DTOIntDetail) dtoIn.getGoods().getDtoIntDetail()).getIsNewDetail() != null ? (((DTOIntDetail) dtoIn.getGoods().getDtoIntDetail()).getIsNewDetail() ? "S" : "N") : null);
            format.setTipoveh(((DTOIntDetail) dtoIn.getGoods().getDtoIntDetail()).getUseDetail());
            format.setNumchas(((DTOIntDetail) dtoIn.getGoods().getDtoIntDetail()).getChassisNumber());
            format.setPlacave(((DTOIntDetail) dtoIn.getGoods().getDtoIntDetail()).getPlate());
            format.setAnioveh(((DTOIntDetail) dtoIn.getGoods().getDtoIntDetail()).getYear());
            if (((DTOIntDetail) dtoIn.getGoods().getDtoIntDetail()).getModel() != null) {
                format.setModelov(((DTOIntDetail) dtoIn.getGoods().getDtoIntDetail()).getModel().getId());
            }
            if (((DTOIntDetail) dtoIn.getGoods().getDtoIntDetail()).getBrand() != null) {
                format.setMarcave(((DTOIntDetail) dtoIn.getGoods().getDtoIntDetail()).getBrand().getId());
            }
            if (((DTOIntDetail) dtoIn.getGoods().getDtoIntDetail()).getMarketValue() != null) {
                format.setValvehi(formatoStringCeros(new NumberConverter().toString(((DTOIntDetail) dtoIn.getGoods().getDtoIntDetail()).getMarketValue().getAmountMoney()), 17));
                format.setDivisve(((DTOIntDetail) dtoIn.getGoods().getDtoIntDetail()).getMarketValue().getCurrencyMoney());
            }
        }
    }

    private void mapInProduct(DTOIntProposalSimulate dtoIn, FormatoUGCESIE0 format) {
        //Product
        if (dtoIn.getProduct() != null) {
            format.setProdid(dtoIn.getProduct().getId());
            if (dtoIn.getProduct().getSubProduct() != null) {
                format.setSubprod(dtoIn.getProduct().getSubProduct().getId());
                if (dtoIn.getProduct().getSubProduct().getSubProductType() != null) {
                    format.setTipsubp(dtoIn.getProduct().getSubProduct().getSubProductType().getId());
                }
            }

        }
    }

    private void mapInRates(DTOIntProposalSimulate dtoIn, FormatoUGCESIE0 format) {
        //Rates
        if (dtoIn.getRates() != null && !dtoIn.getRates().isEmpty()) {
            format.setFechcal(dtoIn.getRates().get(0).getCalculationDate());
            if (dtoIn.getRates().get(0).getRateTypeAdd() != null) {
                format.setRateid(dtoIn.getRates().get(0).getRateTypeAdd().getIdRateType());
            }
            if (dtoIn.getRates().get(0).getMode() != null) {
                format.setMode(dtoIn.getRates().get(0).getMode().getId());
            }
            if (dtoIn.getRates().get(0).getRateUnit() != null) {

                if (dtoIn.getRates().get(0).getRateUnit() instanceof DTOIntRatePercentage) {
                    format.setPercent(formatoStringCeros(new NumberConverter().toString(((DTOIntRatePercentage) dtoIn.getRates().get(0).getRateUnit()).getPercentage()), 8));
                }
                if (dtoIn.getRates().get(0).getRateUnit() instanceof DTOIntRateAmount) {
                    format.setAmonto(formatoStringCeros(new NumberConverter().toString(((DTOIntRateAmount) dtoIn.getRates().get(0).getRateUnit()).getAmountRate()), 17));
                    format.setCurrenc(((DTOIntRateAmount) dtoIn.getRates().get(0).getRateUnit()).getCurrencyRate());
                }
            }
        }
    }

    private void mapInIdentityDocument(DTOIntProposalSimulate dtoIn, FormatoUGCESIE0 format) {
        //IdentityDocument
        if (dtoIn.getIdentityDocument() != null) {
            format.setClaiden(formatoStringCeros(dtoIn.getIdentityDocument().getDocumentNumber(), 15));
            if (dtoIn.getIdentityDocument().getDocumentType() != null) {
                format.setTipdocu(dtoIn.getIdentityDocument().getDocumentType().getId());
            }
        }
    }

    private void mapInRequestedAmount(DTOIntProposalSimulate dtoIn, FormatoUGCESIE0 format) {
        //RequestedAmount
        if (dtoIn.getRequestedAmount() != null) {
            format.setVlrsoli(new NumberConverter().toLong(dtoIn.getRequestedAmount().getAmount()));
            format.setDivsol(dtoIn.getRequestedAmount().getCurrency());
        }
    }

    private void mapInInstallmentPlan(DTOIntProposalSimulate dtoIn, FormatoUGCESIE0 format) {
        //InstallmentPlan
        if (dtoIn.getInstallmentPlan() != null && dtoIn.getInstallmentPlan().getTerms() != null ) {
                format.setNcuotas(dtoIn.getInstallmentPlan().getTerms().getNumberTerms());
                format.setFrecuen(dtoIn.getInstallmentPlan().getTerms().getFrequencyTerms());
        }
    }

    private void mapInIncome(DTOIntProposalSimulate dtoIn, FormatoUGCESIE0 format) {
        //Income
        if (dtoIn.getIncome() != null) {
            if (dtoIn.getIncome().getIncomeType() != null) {
                format.setIngtipo(dtoIn.getIncome().getIncomeType().getId());
            }
            if (dtoIn.getIncome().getIncomeValues() != null && !dtoIn.getIncome().getIncomeValues().isEmpty()) {
                format.setIngreso(new NumberConverter().toLong(dtoIn.getIncome().getIncomeValues().get(0).getAmountIncome()));
                format.setIngfrec(dtoIn.getIncome().getIncomeValues().get(0).getFrecuencyIncome());
                format.setDiving(dtoIn.getIncome().getIncomeValues().get(0).getCurrencyIncome());
            }
        }
    }

    private void mapInAdditionalPaymentsInstallments(DTOIntProposalSimulate dtoIn, FormatoUGCESIE0 format) {
        //AdditionalPaymentInstallments
        if (dtoIn.getAdditionalPaymentInstallments() != null && !dtoIn.getAdditionalPaymentInstallments().isEmpty()) {
            format.setFecplan(dtoIn.getAdditionalPaymentInstallments().get(0).getFrequencyPayment());
            format.setNumfrec(new NumberConverter().toString(dtoIn.getAdditionalPaymentInstallments().get(0).getUnitNumberPayment()));
            format.setCantval(new NumberConverter().toString(dtoIn.getAdditionalPaymentInstallments().get(0).getQuantityPayment()));
        }
    }

    private void mapInParticipants(DTOIntProposalSimulate dtoIn, FormatoUGCESIE0 format) {
        //Participants
        if (dtoIn.getParticipants() != null && !dtoIn.getParticipants().isEmpty()) {
            format.setPartcid(dtoIn.getParticipants().get(0).getParticipantId());
            format.setFnacpar(new DateConverter().toString(new DateConverter().toDateTime(dtoIn.getParticipants().get(0).getBirthDate()), DateFormatEnum.YYYY_MM_DD_TIME_FORMAT.getFormat()));
            if (dtoIn.getParticipants().get(0).getParticipantType() != null) {
                format.setTipopar(dtoIn.getParticipants().get(0).getParticipantType().getId());
            }
        }
    }

    private void mapInPeriods(DTOIntProposalSimulate dtoIn, FormatoUGCESIE0 format) {
        //Periods
        if (dtoIn.getPeriods() != null) {
            if (dtoIn.getPeriods().getGracePeriod() != null) {
                format.setPgracia(dtoIn.getPeriods().getGracePeriod().getIdGrace());
                format.setCpgraci(new NumberConverter().toString(dtoIn.getPeriods().getGracePeriod().getNumberGrace().intValue()));
            }
            if (dtoIn.getPeriods().getCapitalGracePeriod() != null) {
                format.setPagopst(dtoIn.getPeriods().getCapitalGracePeriod().getIdGrace());
                format.setCantper(new NumberConverter().toString(dtoIn.getPeriods().getCapitalGracePeriod().getNumberGrace().intValue()));
            }
        }
    }

    private void mapInIndicators(DTOIntProposalSimulate dtoIn, FormatoUGCESIE0 format) {
        //Indicators
        if (dtoIn.getIndicators() != null && !dtoIn.getIndicators().isEmpty()) {
            format.setIndicid(dtoIn.getIndicators().get(0).getIndicatorId());
        }
    }

    private void mapInAddtionalProducts(DTOIntProposalSimulate dtoIn, FormatoUGCESIE0 format) {
        //AdditionalProducts
        if (dtoIn.getAdditionalProducts() != null && !dtoIn.getAdditionalProducts().isEmpty()) {
            format.setIdprodu(dtoIn.getAdditionalProducts().get(0).getId());
            format.setNumcont(dtoIn.getAdditionalProducts().get(0).getNumber());
            if (dtoIn.getAdditionalProducts().get(0).getProductType() != null) {
                format.setTipopro(dtoIn.getAdditionalProducts().get(0).getProductType().getId());
            }
            if (dtoIn.getAdditionalProducts().get(0).getManagementCompany() != null) {
                format.setComppro(dtoIn.getAdditionalProducts().get(0).getManagementCompany().getIdCompany());
            }
            if (dtoIn.getAdditionalProducts().get(0).getNumberType() != null) {
                format.setTipocon(dtoIn.getAdditionalProducts().get(0).getNumberType().getId());
            }
            if (dtoIn.getAdditionalProducts().get(0).getPaymentMethod() != null) {
                format.setMetpago(dtoIn.getAdditionalProducts().get(0).getPaymentMethod().getIdMethod());
            }
        }
    }

    private void mapInStatementDeliveries(DTOIntProposalSimulate dtoIn, FormatoUGCESIE0 format) {
        //StatementDeliveries
        if (dtoIn.getStatementDeliveries() != null && !dtoIn.getStatementDeliveries().isEmpty()) {
            format.setDetentr(dtoIn.getStatementDeliveries().get(0).getDeliveryType());
        }
    }

    /**
     * @see ITxLoanProposalSimulateMapper#mapOutCreateLoanProposalSimulateV1FormatoUGCESIS0(FormatoUGCESIS0, DTOIntDataListProposalLoanAdd) (FormatoUGCESIS0, DTOIntDataListProposalLoanAdd)
     */
    @Override
    //Formato Datos generales de salida
    public DTOIntDataListProposalLoanAdd mapOutCreateLoanProposalSimulateV1FormatoUGCESIS0(FormatoUGCESIS0 formatOutput, DTOIntDataListProposalLoanAdd dtoOut) {

        DTOIntProposalLoanAdd dtoIntProposalLoan;
        if (dtoOut.getData() == null || dtoOut.getData().isEmpty()) {
            dtoIntProposalLoan = new DTOIntProposalLoanAdd();
        } else {
            dtoIntProposalLoan = dtoOut.getData().get(dtoOut.getData().size() - 1);
        }

        dtoIntProposalLoan.setDescriptionLoanAdd(formatOutput.getDescrip());
        dtoIntProposalLoan.setScoreLoanAdd(formatOutput.getScore());
        dtoIntProposalLoan.setSimulationDateLoanAdd(new DateConverter().toDate(formatOutput.getFechsim(), DateFormatEnum.YYYY_MM_DD_TIME_FORMAT));
        dtoIntProposalLoan.setPaymentDueDayLoanAdd(new NumberConverter().toString(formatOutput.getFechlim()));
        dtoIntProposalLoan.setApplicationDateLoanAdd(formatOutput.getFechaap());

        //InstallmentPlan
        DTOIntInstallmentPlanSimulate dtoIntInstallmentPlan = new DTOIntInstallmentPlanSimulate();
        outProposalsSimulateInstallment(formatOutput, dtoIntInstallmentPlan);
        outProposalsSimulateTerms(formatOutput, dtoIntInstallmentPlan);
        if (dtoIntInstallmentPlan.getValue() != null) {
            dtoIntProposalLoan.setInstallmentPlan(dtoIntInstallmentPlan);
        }

        //Periods
        DTOIntPeriods dtoIntPeriods = new DTOIntPeriods();
        outProposalsSimulateGrace(formatOutput, dtoIntPeriods);
        outProposalsSimulateCapital(formatOutput, dtoIntPeriods);
        if (dtoIntPeriods.getGracePeriod() != null || dtoIntPeriods.getCapitalGracePeriod() != null) {
            dtoIntProposalLoan.setPeriods(dtoIntPeriods);
        }
        outProposalsSimulateLoanType(formatOutput, dtoIntProposalLoan);
        outProposalsSimulateRequested(formatOutput, dtoIntProposalLoan);
        outProposalsSimulateProduct(formatOutput, dtoIntProposalLoan);
        outProposalsSimulateSubProd(formatOutput, dtoIntProposalLoan);

        if (dtoOut.getData() == null || dtoOut.getData().isEmpty()) {
            dtoOut.setData(new ArrayList<>());
            dtoOut.getData().add(dtoIntProposalLoan);
        }

        return dtoOut;
    }

    private void outProposalsSimulateSubProd(FormatoUGCESIS0 formatOutput, DTOIntProposalLoanAdd dtoIntProposalLoan) {
        //Subproduct
        if (formatOutput.getSubpros() != null) {
            dtoIntProposalLoan.setSubProduct(new DTOIntSubProduct());
            dtoIntProposalLoan.getSubProduct().setId(formatOutput.getSubpros());
            dtoIntProposalLoan.getSubProduct().setName(formatOutput.getNomcoms());
            if (formatOutput.getTipsubp() != null) {
                dtoIntProposalLoan.getSubProduct().setSubProductType(new DTOIntType());
                dtoIntProposalLoan.getSubProduct().getSubProductType().setId(formatOutput.getTipsubp());
            }
        }
    }

    private void outProposalsSimulateProduct(FormatoUGCESIS0 formatOutput, DTOIntProposalLoanAdd dtoIntProposalLoan) {
        //Product
        if (formatOutput.getProdid() != null) {
            dtoIntProposalLoan.setProduct(new DTOIntProduct());
            dtoIntProposalLoan.getProduct().setId(formatOutput.getProdid());
            dtoIntProposalLoan.getProduct().setName(formatOutput.getNomcomp());
            subproduct(formatOutput, dtoIntProposalLoan);
        }
    }

    private void subproduct(FormatoUGCESIS0 formatOutput, DTOIntProposalLoanAdd dtoIntProposalLoan) {
        if (formatOutput.getSubpros() != null) {
            dtoIntProposalLoan.getProduct().setSubProduct(new DTOIntSubProduct());
            dtoIntProposalLoan.getProduct().getSubProduct().setId(formatOutput.getSubpros());
            dtoIntProposalLoan.getProduct().getSubProduct().setName(formatOutput.getNomcoms());
            productSubType(formatOutput, dtoIntProposalLoan);
        }
    }

    private void productSubType(FormatoUGCESIS0 formatOutput, DTOIntProposalLoanAdd dtoIntProposalLoan) {
        if (formatOutput.getTipsubp() != null) {
            dtoIntProposalLoan.getProduct().getSubProduct().setSubProductType(new DTOIntType());
            dtoIntProposalLoan.getProduct().getSubProduct().getSubProductType().setId(formatOutput.getTipsubp());
        }
    }

    private void outProposalsSimulateRequested(FormatoUGCESIS0 formatOutput, DTOIntProposalLoanAdd dtoIntProposalLoan) {
        //RequestedAmount
        if (formatOutput.getValpres() != null && formatOutput.getDivpres() != null) {
            dtoIntProposalLoan.setRequestedAmount(new DTOIntAmount());
            dtoIntProposalLoan.getRequestedAmount().setAmount(new NumberConverter().convert(formatOutput.getValpres()));
            dtoIntProposalLoan.getRequestedAmount().setCurrency(formatOutput.getDivpres());
        }
    }

    private void outProposalsSimulateLoanType(FormatoUGCESIS0 formatOutput, DTOIntProposalLoanAdd dtoIntProposalLoan) {
        //LoanType
        if (formatOutput.getPrestip() != null) {
            dtoIntProposalLoan.setLoanType(new DTOIntLoanType());
            dtoIntProposalLoan.getLoanType().setIdLoan(formatOutput.getPrestip());
            dtoIntProposalLoan.getLoanType().setNameLoan(formatOutput.getDespret());
        }
    }

    private void outProposalsSimulateCapital(FormatoUGCESIS0 formatOutput, DTOIntPeriods dtoIntPeriods) {
        if (formatOutput.getPagosst() != null && formatOutput.getCantper() != null) {
            dtoIntPeriods.setCapitalGracePeriod(new DTOIntGracePeriod());
            dtoIntPeriods.getCapitalGracePeriod().setIdGrace(formatOutput.getPagosst());
            dtoIntPeriods.getCapitalGracePeriod().setNumberGrace(new NumberConverter().toString(formatOutput.getCantper()));
        }
    }

    private void outProposalsSimulateGrace(FormatoUGCESIS0 formatOutput, DTOIntPeriods dtoIntPeriods) {
        if (formatOutput.getPgracia() != null && formatOutput.getCpgraci() != null) {
            dtoIntPeriods.setGracePeriod(new DTOIntGracePeriod());
            dtoIntPeriods.getGracePeriod().setIdGrace(formatOutput.getPgracia());
            dtoIntPeriods.getGracePeriod().setNumberGrace(new NumberConverter().toString(formatOutput.getCpgraci()));
        }
    }

    private void outProposalsSimulateTerms(FormatoUGCESIS0 formatOutput, DTOIntInstallmentPlanSimulate dtoIntInstallmentPlan) {
        if (formatOutput.getNumcuot() != null && formatOutput.getFrecuen() != null) {
            dtoIntInstallmentPlan.setTerms(new DTOIntTerms());
            dtoIntInstallmentPlan.getTerms().setNumberTerms(formatOutput.getNumcuot());
            dtoIntInstallmentPlan.getTerms().setFrequencyTerms(formatOutput.getFrecuen());
        }
    }

    private void outProposalsSimulateInstallment(FormatoUGCESIS0 formatOutput, DTOIntInstallmentPlanSimulate dtoIntInstallmentPlan) {
        if (formatOutput.getVlrcuot() != null && formatOutput.getDivcuot() != null) {
            dtoIntInstallmentPlan.setValue(new DTOIntAmount());
            dtoIntInstallmentPlan.getValue().setAmount(formatOutput.getVlrcuot());
            dtoIntInstallmentPlan.getValue().setCurrency(formatOutput.getDivcuot());
        }
    }

    /**
     * @see ITxLoanProposalSimulateMapper#mapOutCreateLoanProposalSimulateV1FormatoUGCESIS1(FormatoUGCESIS1, DTOIntDataListProposalLoanAdd) (FormatoUGCESIS1, DTOIntDataListProposalLoanAdd)
     */
    @Override
    public DTOIntDataListProposalLoanAdd mapOutCreateLoanProposalSimulateV1FormatoUGCESIS1(FormatoUGCESIS1 formatOutput, DTOIntDataListProposalLoanAdd dtoOut) {

        DTOIntProposalLoanAdd dtoIntProposalLoan;

        if (dtoOut.getData() == null || dtoOut.getData().isEmpty()) {
            dtoIntProposalLoan = new DTOIntProposalLoanAdd();
        } else {
            dtoIntProposalLoan = dtoOut.getData().get(dtoOut.getData().size() - 1);
        }

        //AdditionalInformation
        if (formatOutput.getTitulo() != null && formatOutput.getDescrip() != null) {
            dtoIntProposalLoan.setAdditionalInformation(new DTOIntAdditionalInformation());
            dtoIntProposalLoan.getAdditionalInformation().setTitle(formatOutput.getTitulo());
            dtoIntProposalLoan.getAdditionalInformation().setDescription(formatOutput.getDescrip());
        }

        if (dtoOut.getData() == null || dtoOut.getData().isEmpty()) {
            dtoOut.setData(new ArrayList<>());
            dtoOut.getData().add(dtoIntProposalLoan);
        }

        return dtoOut;
    }

    /**
     * @see ITxLoanProposalSimulateMapper#mapOutCreateLoanProposalSimulateV1FormatoUGCESIS2(FormatoUGCESIS2, DTOIntDataListProposalLoanAdd) (FormatoUGCESIS2, DTOIntDataListProposalLoanAdd)
     */
    @Override
    public DTOIntDataListProposalLoanAdd mapOutCreateLoanProposalSimulateV1FormatoUGCESIS2(FormatoUGCESIS2 formatOutput, DTOIntDataListProposalLoanAdd dtoOut) {
        DTOIntProposalLoanAdd dtoIntProposalLoan;
        DTOIntAdditionalInformation dtoIntAdditionalInformation;
        List<DTOIntMessage> messages;
        DTOIntMessage dtoIntMessage = new DTOIntMessage();

        if (dtoOut.getData() == null || dtoOut.getData().isEmpty()) {
            dtoIntProposalLoan = new DTOIntProposalLoanAdd();
        } else {
            dtoIntProposalLoan = dtoOut.getData().get(dtoOut.getData().size() - 1);
        }

        //AdditionalInformation.messages

        if (dtoIntProposalLoan.getAdditionalInformation() == null) {
            dtoIntAdditionalInformation = new DTOIntAdditionalInformation();
        } else {
            dtoIntAdditionalInformation = dtoIntProposalLoan.getAdditionalInformation();
        }

        if (dtoIntAdditionalInformation.getMessages() == null) {
            messages = new ArrayList<>();
        } else {
            messages = dtoIntAdditionalInformation.getMessages();
        }

        dtoIntMessage.setMessage(formatOutput.getDetalle());
        messages.add(dtoIntMessage);
        dtoIntAdditionalInformation.setMessages(messages);
        dtoIntProposalLoan.setAdditionalInformation(dtoIntAdditionalInformation);

        if (dtoOut.getData() == null || dtoOut.getData().isEmpty()) {
            dtoOut.setData(new ArrayList<>());
            dtoOut.getData().add(dtoIntProposalLoan);
        }

        return dtoOut;
    }


    /**
     * @see ITxLoanProposalSimulateMapper#mapOutCreateLoanProposalSimulateV1FormatoUGCESIS3(FormatoUGCESIS3, DTOIntDataListProposalLoanAdd) (FormatoUGCESIS3, DTOIntDataListProposalLoanAdd)
     */
    @Override
    public DTOIntDataListProposalLoanAdd mapOutCreateLoanProposalSimulateV1FormatoUGCESIS3(FormatoUGCESIS3 formatOutput, DTOIntDataListProposalLoanAdd dtoOut) {

        DTOIntProposalLoanAdd dtoIntProposalLoan;
        DTOIntRate dtoIntRate = new DTOIntRate();
        List<DTOIntRate> rates;

        if (dtoOut.getData() == null || dtoOut.getData().isEmpty()) {
            dtoIntProposalLoan = new DTOIntProposalLoanAdd();
        } else {
            dtoIntProposalLoan = dtoOut.getData().get(dtoOut.getData().size() - 1);
        }
        //Rates
        if (dtoIntProposalLoan.getRates() == null) {
            rates = new ArrayList<>();
        } else {
            rates = dtoIntProposalLoan.getRates();
        }

        dtoIntRate.setExpirationDate(new DateConverter().toDate(formatOutput.getExpfech(), DateFormatEnum.YYYY_MM_DD_TIME_FORMAT));
        dtoIntRate.setCalculationDate(new DateConverter().toDate(formatOutput.getCalfech(), DateFormatEnum.YYYY_MM_DD_TIME_FORMAT));

        if (formatOutput.getId() != null) {
            dtoIntRate.setRateTypeAdd(new DTOIntRateType());
            dtoIntRate.getRateTypeAdd().setIdRateType(formatOutput.getId());
            dtoIntRate.getRateTypeAdd().setNameRateType(formatOutput.getNomtipo());
        }

        if (formatOutput.getMode() != null) {
            dtoIntRate.setMode(new DTOIntType());
            dtoIntRate.getMode().setId(formatOutput.getMode());
            dtoIntRate.getMode().setName(formatOutput.getModtasa());
        }

        if (formatOutput.getPorcent() != null) {
            dtoIntRate.setRateUnit(new DTOIntRatePercentage());
            ((DTOIntRatePercentage) dtoIntRate.getRateUnit()).setPercentage(new NumberConverter().convert(formatOutput.getPorcent()));
        }
        if (formatOutput.getAmonto() != null && formatOutput.getCurrenc() != null) {
            dtoIntRate.setRateUnit(new DTOIntRateAmount());
            ((DTOIntRateAmount) dtoIntRate.getRateUnit()).setAmountRate(new NumberConverter().convert(formatOutput.getAmonto())); //campo de host
            ((DTOIntRateAmount) dtoIntRate.getRateUnit()).setCurrencyRate(formatOutput.getCurrenc()); //campo de host
        }

        rates.add(dtoIntRate);
        dtoIntProposalLoan.setRates(rates);

        if (dtoOut.getData() == null || dtoOut.getData().isEmpty()) {
            dtoOut.setData(new ArrayList<>());
            dtoOut.getData().add(dtoIntProposalLoan);
        }

        return dtoOut;
    }

    /**
     * @see ITxLoanProposalSimulateMapper#mapOutCreateLoanProposalSimulateV1FormatoUGCESIS4(FormatoUGCESIS4, DTOIntDataListProposalLoanAdd)
     */
    @Override //tabla de amortizacion
    public DTOIntDataListProposalLoanAdd mapOutCreateLoanProposalSimulateV1FormatoUGCESIS4(FormatoUGCESIS4 formatOutput, DTOIntDataListProposalLoanAdd dtoOut) {

        DTOIntProposalLoanAdd dtoIntProposalLoan;
        DTOIntInstallmentPlanSimulate dtoIntInstallmentPlanSimulate;
        List<DTOIntScheduledPayment> scheduledPayments;
        DTOIntScheduledPayment dtoIntScheduledPayment = new DTOIntScheduledPayment();

        if (dtoOut.getData() == null || dtoOut.getData().isEmpty()) {
            dtoIntProposalLoan = new DTOIntProposalLoanAdd();
        } else {
            dtoIntProposalLoan = dtoOut.getData().get(dtoOut.getData().size() - 1);
        }

        //InstallmentPlan.ScheduledPayments

        if (dtoIntProposalLoan.getInstallmentPlan() == null) {
            dtoIntInstallmentPlanSimulate = new DTOIntInstallmentPlanSimulate();
        } else {
            dtoIntInstallmentPlanSimulate = dtoIntProposalLoan.getInstallmentPlan();
        }

        if (dtoIntInstallmentPlanSimulate.getScheduledPayments() == null) {
            scheduledPayments = new ArrayList<>();
        } else {
            scheduledPayments = dtoIntInstallmentPlanSimulate.getScheduledPayments();
        }
        dtoIntScheduledPayment.setInstallmentNumber(new NumberConverter().toString(formatOutput.getNumcuot()));
        dtoIntScheduledPayment.setDueDate(formatOutput.getFechaex());
        intScheduledPaymentTotal(formatOutput, dtoIntScheduledPayment);
        intScheduledPaymentInteres(formatOutput, dtoIntScheduledPayment);
        intScheduledPaymentInsurance(formatOutput, dtoIntScheduledPayment);
        intScheduledPaymentCapital(formatOutput, dtoIntScheduledPayment);
        iintScheduledPaymentPendien(formatOutput, dtoIntScheduledPayment);
        intScheduledPaymentFees(formatOutput, dtoIntScheduledPayment);
        intScheduledPaymentconditions(formatOutput, dtoIntScheduledPayment);
        intScheduledPaymentSubvention(formatOutput, dtoIntScheduledPayment);
        scheduledPayments.add(dtoIntScheduledPayment);
        dtoIntInstallmentPlanSimulate.setScheduledPayments(scheduledPayments);
        dtoIntProposalLoan.setInstallmentPlan(dtoIntInstallmentPlanSimulate);

        if (dtoOut.getData() == null || dtoOut.getData().isEmpty()) {
            dtoOut.setData(new ArrayList<>());
            dtoOut.getData().add(dtoIntProposalLoan);
        }

        return dtoOut;
    }

    private void intScheduledPaymentSubvention(FormatoUGCESIS4 formatOutput, DTOIntScheduledPayment dtoIntScheduledPayment) {
        if (formatOutput.getSubvval() != null && formatOutput.getSubvdiv() != null) {
            dtoIntScheduledPayment.setSubvention(new DTOIntMoney());
            dtoIntScheduledPayment.getSubvention().setAmountMoney(formatOutput.getSubvval());
            dtoIntScheduledPayment.getSubvention().setCurrencyMoney(formatOutput.getSubvdiv());
        }
    }

    private void intScheduledPaymentconditions(FormatoUGCESIS4 formatOutput, DTOIntScheduledPayment dtoIntScheduledPayment) {
        if (formatOutput.getGastval() != null && formatOutput.getGastdiv() != null) {
            dtoIntScheduledPayment.setTotalConditionsApplied(new DTOIntMoney());
            dtoIntScheduledPayment.getTotalConditionsApplied().setAmountMoney(formatOutput.getGastval());
            dtoIntScheduledPayment.getTotalConditionsApplied().setCurrencyMoney(formatOutput.getGastdiv());
        }
    }

    private void intScheduledPaymentFees(FormatoUGCESIS4 formatOutput, DTOIntScheduledPayment dtoIntScheduledPayment) {
        if (formatOutput.getHonoval() != null && formatOutput.getHonodiv() != null) {
            dtoIntScheduledPayment.setFees(new DTOIntMoney());
            dtoIntScheduledPayment.getFees().setAmountMoney(formatOutput.getHonoval());
            dtoIntScheduledPayment.getFees().setCurrencyMoney(formatOutput.getHonodiv());
        }
    }

    private void iintScheduledPaymentPendien(FormatoUGCESIS4 formatOutput, DTOIntScheduledPayment dtoIntScheduledPayment) {
        if (formatOutput.getPendien() != null && formatOutput.getDivpend() != null) {
            dtoIntScheduledPayment.setRemaining(new DTOIntAmount());
            dtoIntScheduledPayment.getRemaining().setAmount(formatOutput.getPendien());
            dtoIntScheduledPayment.getRemaining().setCurrency(formatOutput.getDivpend());
        }
    }

    private void intScheduledPaymentCapital(FormatoUGCESIS4 formatOutput, DTOIntScheduledPayment dtoIntScheduledPayment) {
        if (formatOutput.getCapital() != null && formatOutput.getDivcapi() != null) {
            dtoIntScheduledPayment.setPrincipal(new DTOIntAmount());
            dtoIntScheduledPayment.getPrincipal().setAmount(formatOutput.getCapital());
            dtoIntScheduledPayment.getPrincipal().setCurrency(formatOutput.getDivcapi());
        }
    }

    private void intScheduledPaymentInsurance(FormatoUGCESIS4 formatOutput, DTOIntScheduledPayment dtoIntScheduledPayment) {
        if (formatOutput.getSeguro() != null && formatOutput.getDivsegu() != null) {
            dtoIntScheduledPayment.setInsurance(new DTOIntAmount());
            dtoIntScheduledPayment.getInsurance().setAmount(formatOutput.getSeguro());
            dtoIntScheduledPayment.getInsurance().setCurrency(formatOutput.getDivsegu());
        }
    }

    private void intScheduledPaymentInteres(FormatoUGCESIS4 formatOutput, DTOIntScheduledPayment dtoIntScheduledPayment) {
        if (formatOutput.getInteres() != null && formatOutput.getDivinte() != null) {
            dtoIntScheduledPayment.setInterest(new DTOIntAmount());
            dtoIntScheduledPayment.getInterest().setAmount(formatOutput.getInteres());
            dtoIntScheduledPayment.getInterest().setCurrency(formatOutput.getDivinte());
        }
    }

    private void intScheduledPaymentTotal(FormatoUGCESIS4 formatOutput, DTOIntScheduledPayment dtoIntScheduledPayment) {
        if (formatOutput.getVlrcuot() != null && formatOutput.getDivcuot() != null) {
            dtoIntScheduledPayment.setTotal(new DTOIntAmount());
            dtoIntScheduledPayment.getTotal().setAmount(formatOutput.getVlrcuot());
            dtoIntScheduledPayment.getTotal().setCurrency(formatOutput.getDivcuot());
        }
    }

    /**
     * @see ITxLoanProposalSimulateMapper#mapOutCreateLoanProposalSimulateV1FormatoUGCESIS5(FormatoUGCESIS5, DTOIntDataListProposalLoanAdd)
     */
    @Override
    public DTOIntDataListProposalLoanAdd mapOutCreateLoanProposalSimulateV1FormatoUGCESIS5(FormatoUGCESIS5 formatOutput, DTOIntDataListProposalLoanAdd dtoOut) {

        DTOIntProposalLoanAdd dtoIntProposalLoan;
        DTOIntInstallmentPlanSimulate dtoIntInstallmentPlanSimulate;
        if (dtoOut.getData() == null || dtoOut.getData().isEmpty()) {
            dtoIntProposalLoan = new DTOIntProposalLoanAdd();
        } else {
            dtoIntProposalLoan = dtoOut.getData().get(dtoOut.getData().size() - 1);
        }
        //InstallmentPlan
        if (dtoIntProposalLoan.getInstallmentPlan() == null) {
            dtoIntInstallmentPlanSimulate = new DTOIntInstallmentPlanSimulate();
        } else {
            dtoIntInstallmentPlanSimulate = dtoIntProposalLoan.getInstallmentPlan();
        }
        outTotalAmount(formatOutput, dtoIntInstallmentPlanSimulate);
        outIntere(formatOutput, dtoIntInstallmentPlanSimulate);
        outInsurance(formatOutput, dtoIntInstallmentPlanSimulate);
        outPrincipal(formatOutput, dtoIntInstallmentPlanSimulate);
        outRemaining(formatOutput, dtoIntInstallmentPlanSimulate);
        outFees(formatOutput, dtoIntInstallmentPlanSimulate);
        outTotalConditionApplied(formatOutput, dtoIntInstallmentPlanSimulate);
        outSubvention(formatOutput, dtoIntInstallmentPlanSimulate);
        dtoIntProposalLoan.setInstallmentPlan(dtoIntInstallmentPlanSimulate);

        if (dtoOut.getData() == null || dtoOut.getData().isEmpty()) {
            dtoOut.setData(new ArrayList<>());
            dtoOut.getData().add(dtoIntProposalLoan);
        }

        return dtoOut;
    }

    private void outSubvention(FormatoUGCESIS5 formatOutput, DTOIntInstallmentPlanSimulate dtoIntInstallmentPlanSimulate) {
        if (formatOutput.getValsubv() != null && formatOutput.getDivsubv() != null) {
            dtoIntInstallmentPlanSimulate.setSubvention(new DTOIntAmount());
            dtoIntInstallmentPlanSimulate.getSubvention().setAmount(formatOutput.getValsubv());
            dtoIntInstallmentPlanSimulate.getSubvention().setCurrency(formatOutput.getDivsubv());
        }
    }

    private void outTotalConditionApplied(FormatoUGCESIS5 formatOutput, DTOIntInstallmentPlanSimulate dtoIntInstallmentPlanSimulate) {
        if (formatOutput.getValgast() != null && formatOutput.getDivgast() != null) {
            dtoIntInstallmentPlanSimulate.setTotalConditionsApplied(new DTOIntAmount());
            dtoIntInstallmentPlanSimulate.getTotalConditionsApplied().setAmount(formatOutput.getValgast());
            dtoIntInstallmentPlanSimulate.getTotalConditionsApplied().setCurrency(formatOutput.getDivgast());
        }
    }

    private void outFees(FormatoUGCESIS5 formatOutput, DTOIntInstallmentPlanSimulate dtoIntInstallmentPlanSimulate) {
        if (formatOutput.getValhono() != null && formatOutput.getDivhono() != null) {
            dtoIntInstallmentPlanSimulate.setFees(new DTOIntAmount());
            dtoIntInstallmentPlanSimulate.getFees().setAmount(formatOutput.getValhono());
            dtoIntInstallmentPlanSimulate.getFees().setCurrency(formatOutput.getDivhono());
        }
    }

    private void outRemaining(FormatoUGCESIS5 formatOutput, DTOIntInstallmentPlanSimulate dtoIntInstallmentPlanSimulate) {
        if (formatOutput.getRestpre() != null && formatOutput.getDivresp() != null) {
            dtoIntInstallmentPlanSimulate.setRemaining(new DTOIntAmount());
            dtoIntInstallmentPlanSimulate.getRemaining().setAmount(formatOutput.getRestpre());
            dtoIntInstallmentPlanSimulate.getRemaining().setCurrency(formatOutput.getDivresp());
        }
    }

    private void outPrincipal(FormatoUGCESIS5 formatOutput, DTOIntInstallmentPlanSimulate dtoIntInstallmentPlanSimulate) {
        if (formatOutput.getTotcapi() != null && formatOutput.getDivcapi() != null) {
            dtoIntInstallmentPlanSimulate.setPrincipal(new DTOIntAmount());
            dtoIntInstallmentPlanSimulate.getPrincipal().setAmount(formatOutput.getTotcapi());
            dtoIntInstallmentPlanSimulate.getPrincipal().setCurrency(formatOutput.getDivcapi());
        }
    }

    private void outInsurance(FormatoUGCESIS5 formatOutput, DTOIntInstallmentPlanSimulate dtoIntInstallmentPlanSimulate) {
        if (formatOutput.getTotsegu() != null && formatOutput.getDivsegu() != null) {
            dtoIntInstallmentPlanSimulate.setInsurance(new DTOIntAmount());
            dtoIntInstallmentPlanSimulate.getInsurance().setAmount(formatOutput.getTotsegu());
            dtoIntInstallmentPlanSimulate.getInsurance().setCurrency(formatOutput.getDivsegu());
        }
    }

    private void outIntere(FormatoUGCESIS5 formatOutput, DTOIntInstallmentPlanSimulate dtoIntInstallmentPlanSimulate) {
        if (formatOutput.getInteres() != null && formatOutput.getDivinte() != null) {
            dtoIntInstallmentPlanSimulate.setInterest(new DTOIntAmount());
            dtoIntInstallmentPlanSimulate.getInterest().setAmount(formatOutput.getInteres());
            dtoIntInstallmentPlanSimulate.getInterest().setCurrency(formatOutput.getDivinte());
        }
    }

    private void outTotalAmount(FormatoUGCESIS5 formatOutput, DTOIntInstallmentPlanSimulate dtoIntInstallmentPlanSimulate) {
        if (formatOutput.getTotcseg() != null && formatOutput.getDivtseg() != null) {
            dtoIntInstallmentPlanSimulate.setTotalAmount(new DTOIntAmount());
            dtoIntInstallmentPlanSimulate.getTotalAmount().setAmount(formatOutput.getTotcseg());
            dtoIntInstallmentPlanSimulate.getTotalAmount().setCurrency(formatOutput.getDivtseg());
        }
    }

    /**
     * @see ITxLoanProposalSimulateMapper#mapOutCreateLoanProposalSimulateV1FormatoUGCESIS6(FormatoUGCESIS6, DTOIntDataListProposalLoanAdd)
     */

    @Override
    public DTOIntDataListProposalLoanAdd mapOutCreateLoanProposalSimulateV1FormatoUGCESIS6(FormatoUGCESIS6 formatOutput, DTOIntDataListProposalLoanAdd dtoOut) {

        DTOIntProposalLoanAdd dtoIntProposalLoan;
        DTOIntAdditionalPaymentInstallment dtoIntAdditionalPaymentInstallment = new DTOIntAdditionalPaymentInstallment();
        List<DTOIntAdditionalPaymentInstallment> additionalPaymentInstallments;

        if (dtoOut.getData() == null || dtoOut.getData().isEmpty()) {
            dtoIntProposalLoan = new DTOIntProposalLoanAdd();
        } else {
            dtoIntProposalLoan = dtoOut.getData().get(dtoOut.getData().size() - 1);
        }

        //AdditionalPaymentInstallment

        if (dtoIntProposalLoan.getAdditionalPaymentInstallments() == null) {
            additionalPaymentInstallments = new ArrayList<>();
        } else {
            additionalPaymentInstallments = dtoIntProposalLoan.getAdditionalPaymentInstallments();
        }

        dtoIntAdditionalPaymentInstallment.setFrequencyPayment(formatOutput.getFeplan());
        dtoIntAdditionalPaymentInstallment.setUnitNumberPayment(new NumberConverter().toString(formatOutput.getFrecnum()));
        dtoIntAdditionalPaymentInstallment.setQuantityPayment(new NumberConverter().convert(formatOutput.getFcantid()));

        additionalPaymentInstallments.add(dtoIntAdditionalPaymentInstallment);
        dtoIntProposalLoan.setAdditionalPaymentInstallments(additionalPaymentInstallments);

        if (dtoOut.getData() == null || dtoOut.getData().isEmpty()) {
            dtoOut.setData(new ArrayList<>());
            dtoOut.getData().add(dtoIntProposalLoan);
        }

        return dtoOut;
    }

    /**
     * @see ITxLoanProposalSimulateMapper#mapOutCreateLoanProposalSimulateV1FormatoUGCESIS7(FormatoUGCESIS7, DTOIntDataListProposalLoanAdd)
     */

    @Override
    public DTOIntDataListProposalLoanAdd mapOutCreateLoanProposalSimulateV1FormatoUGCESIS7(FormatoUGCESIS7 formatOutput, DTOIntDataListProposalLoanAdd dtoOut) {

        DTOIntProposalLoanAdd dtoIntProposalLoan;
        DTOIntAdditionalProduct dtoIntAdditionalProduct = new DTOIntAdditionalProduct();
        List<DTOIntAdditionalProduct> additionalProducts;

        if (dtoOut.getData() == null || dtoOut.getData().isEmpty()) {
            dtoIntProposalLoan = new DTOIntProposalLoanAdd();
        } else {
            dtoIntProposalLoan = dtoOut.getData().get(dtoOut.getData().size() - 1);
        }

        //AdditionalProducts
        if (dtoIntProposalLoan.getAdditionalProducts() == null) {
            additionalProducts = new ArrayList<>();
        } else {
            additionalProducts = dtoIntProposalLoan.getAdditionalProducts();
        }

        dtoIntAdditionalProduct.setId(formatOutput.getProduid());
        dtoIntAdditionalProduct.setName(formatOutput.getProname());
        dtoIntAdditionalProduct.setNumber(formatOutput.getProcont());

        if (formatOutput.getProtipo() != null) {
            dtoIntAdditionalProduct.setProductType(new DTOIntType());
            dtoIntAdditionalProduct.getProductType().setId(formatOutput.getProtipo());
            dtoIntAdditionalProduct.getProductType().setName(formatOutput.getTipname());
        }

        if (formatOutput.getProcomp() != null) {
            dtoIntAdditionalProduct.setManagementCompany(new DTOIntManagementCompany());
            dtoIntAdditionalProduct.getManagementCompany().setIdCompany(formatOutput.getProcomp());
            dtoIntAdditionalProduct.getManagementCompany().setNameCompany(formatOutput.getComname());
        }

        if (formatOutput.getContipo() != null) {
            dtoIntAdditionalProduct.setNumberType(new DTOIntType());
            dtoIntAdditionalProduct.getNumberType().setId(formatOutput.getContipo());
            dtoIntAdditionalProduct.getNumberType().setName(formatOutput.getConname());
        }

        if (formatOutput.getMetpago() != null) {
            dtoIntAdditionalProduct.setPaymentMethod(new DTOIntPaymentMethod());
            dtoIntAdditionalProduct.getPaymentMethod().setIdMethod(formatOutput.getMetpago());
            dtoIntAdditionalProduct.getPaymentMethod().setNameMethod(formatOutput.getMetname());
        }

        if (formatOutput.getAdcmont() != null && formatOutput.getAdcdivs() != null) {
            dtoIntAdditionalProduct.setAmountAdd(new DTOIntAdditionalProductAmountH());
            ((DTOIntAdditionalProductAmountH) dtoIntAdditionalProduct.getAmountAdd()).setAmount(new NumberConverter().convert(formatOutput.getAdcmont()));
            dtoIntAdditionalProduct.getAmountAdd().setCurrency(formatOutput.getAdcdivs());
        }

        if (formatOutput.getAdcmonp() != null && formatOutput.getAdcdivp() != null) {
            dtoIntAdditionalProduct.setAmountAdd(new DTOIntPremiumAmount());
            ((DTOIntPremiumAmount) dtoIntAdditionalProduct.getAmountAdd()).setValuePremium(new NumberConverter().convert(formatOutput.getAdcmonp()));
            dtoIntAdditionalProduct.getAmountAdd().setCurrency(formatOutput.getAdcdivp());
            ((DTOIntPremiumAmount) dtoIntAdditionalProduct.getAmountAdd()).setPercentagePremium(new NumberConverter().convert(formatOutput.getAdcporp()));

        }

        additionalProducts.add(dtoIntAdditionalProduct);
        dtoIntProposalLoan.setAdditionalProducts(additionalProducts);

        if (dtoOut.getData() == null || dtoOut.getData().isEmpty()) {
            dtoOut.setData(new ArrayList<>());
            dtoOut.getData().add(dtoIntProposalLoan);
        }

        return dtoOut;
    }

    /**
     * @see ITxLoanProposalSimulateMapper#mapOutCreateLoanProposalSimulateV1FormatoUGCESIS8(FormatoUGCESIS8, DTOIntDataListProposalLoanAdd)
     */

    @Override
    public DTOIntDataListProposalLoanAdd mapOutCreateLoanProposalSimulateV1FormatoUGCESIS8(FormatoUGCESIS8 formatOutput, DTOIntDataListProposalLoanAdd dtoOut) {

        DTOIntProposalLoanAdd dtoIntProposalLoan;
        DTOIntStatementDelivery dtoIntStatementDelivery = new DTOIntStatementDelivery();
        List<DTOIntStatementDelivery> statementDeliveries;

        if (dtoOut.getData() == null || dtoOut.getData().isEmpty()) {
            dtoIntProposalLoan = new DTOIntProposalLoanAdd();
        } else {
            dtoIntProposalLoan = dtoOut.getData().get(dtoOut.getData().size() - 1);
        }

        //AdditionalProducts
        if (dtoIntProposalLoan.getStatementDeliveries() == null) {
            statementDeliveries = new ArrayList<>();
        } else {
            statementDeliveries = dtoIntProposalLoan.getStatementDeliveries();
        }

        dtoIntStatementDelivery.setDeliveryType(formatOutput.getDetentr());
        if (formatOutput.getValestc() != null && formatOutput.getValdivs() != null) {
            dtoIntStatementDelivery.setShippingCost(new DTOIntAmount());
            dtoIntStatementDelivery.getShippingCost().setAmount(new NumberConverter().convert(formatOutput.getValestc()));
            dtoIntStatementDelivery.getShippingCost().setCurrency(formatOutput.getValdivs());
        }

        statementDeliveries.add(dtoIntStatementDelivery);
        dtoIntProposalLoan.setStatementDeliveries(statementDeliveries);

        if (dtoOut.getData() == null || dtoOut.getData().isEmpty()) {
            dtoOut.setData(new ArrayList<>());
            dtoOut.getData().add(dtoIntProposalLoan);
        }

        return dtoOut;
    }


    public String formatoStringCeros(String campo, Integer longitud) {
        if (campo.length() < longitud) {
            campo = String.format("%0" + (longitud - campo.length()) + "d%s", 0, campo);
        }
        return campo;
    }

    @Override
    public DTOIntDataListProposalLoanAdd mapOutCreateLoanProposalSimulateV1FormatoUGCESIS9(FormatoUGCESIS9 formatOutput,
                                                                                           DTOIntDataListProposalLoanAdd dtoOut) {

        DTOIntProposalLoanAdd dtoIntProposalLoan;
        DTOIntInstallmentPlanSimulate dtoIntInstallmentPlanSimulate;
        List<DTOIntScheduledPayment> scheduledPayments;
        DTOIntScheduledPayment dtoIntScheduledPayment;
        List<DTOIntItemizeInsurances> itemizedInsurances;
        DTOIntItemizeInsurances dtoIntItemizedInsurances = new DTOIntItemizeInsurances();

        if (dtoOut.getData() == null || dtoOut.getData().isEmpty()) {
            dtoIntProposalLoan = new DTOIntProposalLoanAdd();
        } else {
            dtoIntProposalLoan = dtoOut.getData().get(dtoOut.getData().size() - 1);
        }
        if (dtoIntProposalLoan.getInstallmentPlan() == null) {
            dtoIntInstallmentPlanSimulate = new DTOIntInstallmentPlanSimulate();
        } else {
            dtoIntInstallmentPlanSimulate = dtoIntProposalLoan.getInstallmentPlan();
        }
        if (dtoIntInstallmentPlanSimulate.getScheduledPayments() == null) {
            scheduledPayments = new ArrayList<>();
        } else {
            scheduledPayments = dtoIntInstallmentPlanSimulate.getScheduledPayments();
        }
        if (scheduledPayments.isEmpty()) {
            dtoIntScheduledPayment = new DTOIntScheduledPayment();
        } else {
            dtoIntScheduledPayment = scheduledPayments.get(scheduledPayments.size() - 1);
        }
        if (dtoIntScheduledPayment.getItemizedInsurances() == null) {
            itemizedInsurances = new ArrayList<>();
        } else {
            itemizedInsurances = dtoIntScheduledPayment.getItemizedInsurances();
        }

        dtoIntItemizedInsurances.setInsuranceId(formatOutput.getIdsegur());

        if (formatOutput.getSeguro() != null && formatOutput.getCurrenc() != null) {
            dtoIntItemizedInsurances.setAmount(new DTOIntAmount());
            dtoIntItemizedInsurances.getAmount().setAmount(formatOutput.getSeguro());
            dtoIntItemizedInsurances.getAmount().setCurrency(formatOutput.getCurrenc());
        }

        itemizedInsurances.add(dtoIntItemizedInsurances);//continuar

        dtoIntScheduledPayment.setItemizedInsurances(itemizedInsurances);
        scheduledPayments.add(dtoIntScheduledPayment);
        dtoIntInstallmentPlanSimulate.setScheduledPayments(scheduledPayments);
        dtoIntProposalLoan.setInstallmentPlan(dtoIntInstallmentPlanSimulate);

        if (dtoOut.getData() == null || dtoOut.getData().isEmpty()) {
            dtoOut.setData(new ArrayList<>());
            dtoOut.getData().add(dtoIntProposalLoan);
        }

        return dtoOut;

    }

    @Override
    public DTOIntDataListProposalLoanAdd mapOutCreateLoanProposalSimulateV1FormatoUGCESI10(FormatoUGCESI10 formatOutput,
                                                                                           DTOIntDataListProposalLoanAdd dtoOut) {
        log.debug("Formato salida " + formatOutput.toString());
        DTOIntProposalLoanAdd dtoIntProposalLoanAdd = new DTOIntProposalLoanAdd();
        DTOIntExpenses dtoIntExpenses = new DTOIntExpenses();
        List<DTOIntExpenses> expenses = new ArrayList<>();

        //Expenses
        dtoIntExpenses.setExpenseType(formatOutput.getTipogas());
        dtoIntExpenses.setExpensesPayer(formatOutput.getExpayer());
        dtoIntExpenses.setExpenseAmount(new DTOIntAmount());
        dtoIntExpenses.getExpenseAmount().setAmount(formatOutput.getGasto());
        dtoIntExpenses.getExpenseAmount().setCurrency(formatOutput.getCurren());
        expenses.add(dtoIntExpenses);
        dtoIntProposalLoanAdd.setExpenses(expenses);
        mapOutfees(formatOutput, dtoOut, dtoIntProposalLoanAdd);

        return dtoOut;
    }

    private void mapOutfees(FormatoUGCESI10 formatOutput, DTOIntDataListProposalLoanAdd dtoOut, DTOIntProposalLoanAdd dtoIntProposalLoan) {
        //Fees GRAP 9421 - Netcash objeto comisión
        //totalFees
        if (formatOutput.getComisio() != null && formatOutput.getDivcomi() != null) {
            DTOIntFee dtoIntFee = new DTOIntFee();
            DTOIntMoney totalFees = new DTOIntMoney();
            totalFees.setAmountMoney(formatOutput.getComisio());
            totalFees.setCurrencyMoney(formatOutput.getDivcomi());
            dtoIntFee.setTotalFees(totalFees);
            dtoIntProposalLoan.setFees(dtoIntFee);
        }
        if (formatOutput.getLabel() != null && formatOutput.getIvacomi() != null && formatOutput.getDiviva() != null) {
            DTOIntItemizeFees itemizeFees = new DTOIntItemizeFees();
            List<DTOIntItemizeFees> listItemizeFee = new ArrayList<>();
            itemizeFees.setName(formatOutput.getLabel());
            //itemizeFeeType
            DTOIntType fType = new DTOIntType();
            fType.setId(formatOutput.getLabel());
            fType.setName(formatOutput.getLabel());
            itemizeFees.setFeeType(fType);
            //feeAmount
            if (formatOutput.getIvacomi() != null) {
                DTOIntMoney feeAmount = new DTOIntMoney();
                feeAmount.setAmountMoney(formatOutput.getIvacomi());
                feeAmount.setCurrencyMoney(formatOutput.getDiviva());
                itemizeFees.setFeeAmount(feeAmount);
            }
            listItemizeFee.add(itemizeFees);
            if (dtoIntProposalLoan.getFees() != null) {
                dtoIntProposalLoan.getFees().setItemizeFees(listItemizeFee);
            } else {
                dtoIntProposalLoan.setFees(new DTOIntFee());
            }
        }
        if (dtoOut.getData() !=null) {
            dtoOut.setData(new ArrayList<>());
            dtoOut.getData().add(dtoIntProposalLoan);
        }
    }

}
