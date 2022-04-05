package com.bbva.ccol.loanssimulate.facade.v1;

import com.bbva.ccol.loanssimulate.facade.v1.dto.Customer;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;

public interface IServiceCustomers {

    ServiceResponse CreateCustomer(Customer customer);
}
