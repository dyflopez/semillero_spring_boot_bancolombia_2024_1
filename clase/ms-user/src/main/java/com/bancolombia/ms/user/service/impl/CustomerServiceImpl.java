package com.bancolombia.ms.user.service.impl;

import com.bancolombia.ms.user.dto.CustomerDto;
import com.bancolombia.ms.user.model.CustomerEntity;
import com.bancolombia.ms.user.repository.ICustomerRepository;
import com.bancolombia.ms.user.service.ICustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements ICustomerService {

    private  final ICustomerRepository iCustomerRepository;

    @Override
    public ResponseEntity create(CustomerDto customerDto) {

        //sacar los datos del CustomerDTO
        CustomerEntity customer = new CustomerEntity();

        customer.setActive(customerDto.isActive());
        customer.setName(customerDto.getName());
        customer.setGender(customerDto.getGender());
        customer.setEmail(customerDto.getEmail());
        customer.setLastname(customerDto.getLastname());
        customer.setAddress(customerDto.getAddress());
        customer.setPhoneNumber(customerDto.getPhoneNumber());
        customer.setBirthdate(LocalDateTime.now());

        var newCustomer =     this.iCustomerRepository.save(customer);


        /*return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(newCustomer);*/
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("creado correctamente");
    }
}
