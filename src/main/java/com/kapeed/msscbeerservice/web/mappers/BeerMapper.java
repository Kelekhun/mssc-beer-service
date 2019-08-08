package com.kapeed.msscbeerservice.web.mappers;

import com.kapeed.msscbeerservice.domain.Beer;
import com.kapeed.msscbeerservice.web.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDTO BeerToBeerDTO(Beer beer);
    Beer BeerDTOToBeer(BeerDTO dto);

}
