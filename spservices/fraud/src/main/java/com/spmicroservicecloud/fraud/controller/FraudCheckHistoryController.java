package com.spmicroservicecloud.fraud.controller;

import brave.sampler.Sampler;
import com.spmicroservicecloud.fraud.response.FraudCheckResponse;
import com.spmicroservicecloud.fraud.service.FraudCheckHistoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/fraud-check")
@Slf4j
public class FraudCheckHistoryController {
    private final FraudCheckHistoryService fraudCheckHistoryService;
    @Bean
    public Sampler alwaysSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
    @GetMapping ("/{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable Integer customerId){
        boolean isFraudulentCustomer= fraudCheckHistoryService.isFraudulentCustomer(customerId);
        log.info("fraud check request for customer {}",customerId);
        return new FraudCheckResponse(isFraudulentCustomer);
    }
}
