package com.bbva.ccol.loanssimulate.facade.v1.mapper.Impl;

import com.bbva.ccol.loanssimulate.business.dto.DTOIntCustomers;
import com.bbva.ccol.loanssimulate.facade.v1.dto.Customer;
import com.bbva.ccol.loanssimulate.facade.v1.mapper.IServiceMapper;
import org.springframework.stereotype.Service;

@Service
public class ServerMapperImpl implements IServiceMapper {

    @Override
    public DTOIntCustomers mapintCreateCustomer(Customer customer) {
        return null;
    }
}
