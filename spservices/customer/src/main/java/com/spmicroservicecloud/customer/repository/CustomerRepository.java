package com.spmicroservicecloud.customer.repository;

import com.spmicroservicecloud.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
