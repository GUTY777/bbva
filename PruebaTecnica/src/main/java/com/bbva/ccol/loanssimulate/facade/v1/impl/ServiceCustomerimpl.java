package com.bbva.ccol.loanssimulate.facade.v1.impl;

import com.bbva.ccol.loanssimulate.facade.v1.IServiceCustomers;
import com.bbva.ccol.loanssimulate.facade.v1.dto.Customer;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;
import com.bbva.jee.arq.spring.core.servicing.annotations.SN;
import com.bbva.jee.arq.spring.core.servicing.annotations.VN;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/v2")
@SN(registryID = "SNCO12100015", logicalID = "customers")
@VN(vnn = "v2")
@Api(value = "/customers/vs", description = "SN customers")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
@Service(value = "serviceCustomerimpl")


public class ServiceCustomerimpl  implements IServiceCustomers {
    private static Log log = LogFactory.getLog(ServiceCustomerimpl.class);

    @Override
    @ApiOperation(value = "Crea una nuevo usuario y pide nombre apellido y telefono", notes = "Crea una nuevo usuario", response = ServiceResponse.class)
    @ApiResponses(value = {@ApiResponse(code = -1, message = "aliasGCE1"),
            @ApiResponse(code = -1, message = "aliasGCE2"),
            @ApiResponse(code = 200, message = "Found Sucessfully", response = ServiceResponse.class),
            @ApiResponse(code = 500, message = "Technical Error")})
    @POST
    @Path(/customers)
    public ServiceResponse CreateCustomer(Customer customer) {
        return null;
    }
}
