package com.mc4.training.domain.services.impl;

import com.mc4.commons.base.domain.service.impl.BaseServiceImpl;
import com.mc4.training.domain.model.PricesModel;
import com.mc4.training.domain.services.PricesService;
import com.mc4.training.infraestructure.persistence.entities.Prices;
import com.mc4.training.infraestructure.persistence.repositories.PricesRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class PricesServiceImpl extends BaseServiceImpl<Prices, Short, PricesModel> implements PricesService {

    public PricesServiceImpl(ModelMapper modelMapper, PricesRepository pricesRepository){
        super(modelMapper, pricesRepository);
    }
}
