package com.bancolombia.ms.user.repository;

import com.bancolombia.ms.user.model.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<CustomerEntity,Long> {
}
