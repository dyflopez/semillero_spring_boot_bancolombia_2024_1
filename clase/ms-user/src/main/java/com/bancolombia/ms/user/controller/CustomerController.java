package com.bancolombia.ms.user.controller;

import com.bancolombia.ms.user.dto.CustomerDto;
import com.bancolombia.ms.user.model.CustomerEntity;
import com.bancolombia.ms.user.service.ICustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/customer/")
public class CustomerController {

    //Inyeccion de la dependencia
    private final ICustomerService iCustomerService;


    @PostMapping
    public ResponseEntity create(@RequestBody CustomerDto customerDto){


       var  response =  this.iCustomerService.create(customerDto);

        return response;
    }

    //TODO Listar todos los clientes

}
