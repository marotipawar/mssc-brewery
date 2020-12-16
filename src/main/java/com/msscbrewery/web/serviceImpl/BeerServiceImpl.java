package com.msscbrewery.web.serviceImpl;

import com.msscbrewery.web.dto.BeerDto;
import com.msscbrewery.web.service.BeerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID id) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("KingFisher")
                .beerType("Strong")
                .build();
    }

    @Override
    public BeerDto savedNewBeer(BeerDto beerDto) {

        return  beerDto;
    }

    @Override
    public void updateBeer(UUID beerId) {
      log.info("Updated BeerId:  {}", beerId);
    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.info("Delete Beer {}", beerId);
    }
}
