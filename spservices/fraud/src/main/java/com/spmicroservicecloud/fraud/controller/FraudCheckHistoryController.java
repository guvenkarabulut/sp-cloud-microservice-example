package com.spmicroservicecloud.fraud.controller;

import com.spmicroservicecloud.fraud.response.FraudCheckResponse;
import com.spmicroservicecloud.fraud.service.FraudCheckHistoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/fraud-check")
@Slf4j
public class FraudCheckHistoryController {
    private final FraudCheckHistoryService fraudCheckHistoryService;
    @GetMapping ("/{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable Integer customerId){
        boolean isFraudulentCustomer= fraudCheckHistoryService.isFraudulentCustomer(customerId);
        log.info("fraud check request for customer {}",customerId);
        return new FraudCheckResponse(isFraudulentCustomer);
    }
}
