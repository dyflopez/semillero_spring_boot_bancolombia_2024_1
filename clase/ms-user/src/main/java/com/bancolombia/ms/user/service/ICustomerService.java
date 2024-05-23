package com.bancolombia.ms.user.service;

import com.bancolombia.ms.user.dto.CustomerDto;
import com.bancolombia.ms.user.model.CustomerEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ICustomerService {

    ResponseEntity create(CustomerDto customerDto);

    List<CustomerEntity> getAllItems();

}
