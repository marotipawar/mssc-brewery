package com.msscbrewery.web.controller;

import com.msscbrewery.web.dto.CustomerDto;
import com.msscbrewery.web.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@Slf4j
@RestController
@RequestMapping({"/api/v1/customer"})
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping({"/{customerId}"})
    public ResponseEntity<CustomerDto> getCustomerId(@PathVariable("customerId") UUID customerId){
        log.info("Customer Controller : {}", customerId);
        return new ResponseEntity<>(customerService.getCustomerByID(customerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(CustomerDto customerDto){
        CustomerDto cDto =customerService.saveCustomer(customerDto);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping({"/{customerId}"})
    public ResponseEntity handlePut(@PathVariable("customerId") UUID customerId){
        customerService.updateCustomer(customerId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{customerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleDelete(@PathVariable("customerId") UUID customerId){
        customerService.deleteCustomer(customerId);
    }
}
