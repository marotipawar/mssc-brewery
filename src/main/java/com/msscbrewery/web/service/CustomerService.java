package com.msscbrewery.web.service;

import com.msscbrewery.web.dto.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerByID(UUID customerId);

    CustomerDto saveCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId);

    void deleteCustomer(UUID customerId);
}
