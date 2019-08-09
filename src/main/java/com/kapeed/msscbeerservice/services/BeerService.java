package com.kapeed.msscbeerservice.services;


import com.kapeed.msscbeerservice.web.model.BeerDTO;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public interface BeerService {

    BeerDTO getBeerById(UUID beerId);

    BeerDTO saveNewBeer(BeerDTO beerDTO);

    BeerDTO updateBeer(UUID beerId, BeerDTO beerDTO);
}
