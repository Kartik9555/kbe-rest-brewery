package com.example.practice.kberestbrewery.services;

import com.example.practice.kberestbrewery.web.model.BeerDto;
import com.example.practice.kberestbrewery.web.model.BeerPagedList;
import com.example.practice.kberestbrewery.web.model.BeerStyleEnum;
import java.util.UUID;
import org.springframework.data.domain.PageRequest;

/**
 * Created by jt on 2019-04-20.
 */
public interface BeerService {
    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand);

    BeerDto getById(UUID beerId, Boolean showInventoryOnHand);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

    BeerDto getByUpc(String upc);

    void deleteBeerById(UUID beerId);
}
