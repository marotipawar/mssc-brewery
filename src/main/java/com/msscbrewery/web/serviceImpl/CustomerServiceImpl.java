package com.msscbrewery.web.serviceImpl;

import com.msscbrewery.web.dto.CustomerDto;
import com.msscbrewery.web.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerByID(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Maroti Pawar")
                .build();
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        log.info("Cutomer Saved:  {}",customerDto.getName());
        return null;
    }

    @Override
    public void updateCustomer(UUID customerId) {
        log.info("Update Customer : {}", customerId);
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.info("Delete Customer : {}", customerId);
    }
}
