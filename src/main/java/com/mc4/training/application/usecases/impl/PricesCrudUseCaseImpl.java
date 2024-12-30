package com.mc4.training.application.usecases.impl;

import com.mc4.commons.base.application.usecases.impl.CrudUseCaseImpl;
import com.mc4.training.application.usecases.PricesCrudUseCase;
import com.mc4.training.domain.model.PricesModel;
import com.mc4.training.domain.services.PricesService;
import org.springframework.stereotype.Component;

@Component
public class PricesCrudUseCaseImpl extends CrudUseCaseImpl<Short,PricesModel> implements PricesCrudUseCase {

    public PricesCrudUseCaseImpl(PricesService pricesService) {
        super(pricesService);
    }
}
