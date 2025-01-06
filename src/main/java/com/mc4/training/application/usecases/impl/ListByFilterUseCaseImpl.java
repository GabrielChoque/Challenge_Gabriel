package com.mc4.training.application.usecases.impl;

import com.mc4.training.application.usecases.ListByFilterUseCase;
import com.mc4.training.domain.model.PricesModel;
import com.mc4.training.domain.services.PricesService;
import com.mc4.training.infraestructure.persistence.repositories.PricesRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
@Component
@RequiredArgsConstructor
public class ListByFilterUseCaseImpl implements ListByFilterUseCase {
    private final ModelMapper modelMapper;
    private final PricesRepository pricesRepository;
    @Override
    public List<PricesModel> execute(Date startDate, Short productId, String curr) {
        return pricesRepository.listByFilter(startDate, productId, curr)
                .stream().map( prices -> modelMapper.map(prices, PricesModel.class)).toList();
    }
}
