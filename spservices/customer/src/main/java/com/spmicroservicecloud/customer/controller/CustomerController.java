package com.spmicroservicecloud.customer.controller;

import com.spmicroservicecloud.customer.request.CustomerRegistrationRequest;
import com.spmicroservicecloud.customer.service.CusttomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {
    private final CusttomerService customerService;
    @PostMapping
    public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest){
        log.info("new Customer reg {}",customerRegistrationRequest);
        customerService.registerCustomer(customerRegistrationRequest);
    }

}
