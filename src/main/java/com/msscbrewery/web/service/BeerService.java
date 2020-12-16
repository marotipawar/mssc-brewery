package com.msscbrewery.web.service;

import com.msscbrewery.web.dto.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID id);

    BeerDto savedNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId);

    void deleteBeer(UUID beerId);
}
