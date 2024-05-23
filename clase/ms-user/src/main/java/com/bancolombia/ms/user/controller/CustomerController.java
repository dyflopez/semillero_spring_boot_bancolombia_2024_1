package com.bancolombia.ms.user.controller;

import com.bancolombia.ms.user.dto.CustomerDto;
import com.bancolombia.ms.user.model.CustomerEntity;
import com.bancolombia.ms.user.service.ICustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/customers")
    public List<CustomerEntity> getAllItems(){

        return this.iCustomerService.getAllItems();
    }
}
