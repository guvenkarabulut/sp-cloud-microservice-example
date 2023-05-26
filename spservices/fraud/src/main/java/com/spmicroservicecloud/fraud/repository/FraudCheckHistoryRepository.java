package com.spmicroservicecloud.fraud.repository;

import com.spmicroservicecloud.fraud.entity.FraudCheckHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudCheckHistoryRepository extends JpaRepository<FraudCheckHistory,Integer> {

}
