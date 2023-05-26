package com.spmicroservicecloud.customer.request;

public record CustomerRegistrationRequest(
        String firstname,
        String lastname,
        String email) {
}
