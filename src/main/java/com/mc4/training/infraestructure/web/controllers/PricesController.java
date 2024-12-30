package com.mc4.training.infraestructure.web.controllers;

import com.mc4.commons.base.application.usecases.CrudUseCase;
import com.mc4.commons.base.infrastructure.web.controllers.BaseController;
import com.mc4.training.application.usecases.PricesCrudUseCase;
import com.mc4.training.domain.model.PricesModel;
import com.mc4.training.infraestructure.web.controllers.dto.request.PricesRequestDto;
import com.mc4.training.infraestructure.web.controllers.dto.response.PricesResponseDto;
import org.modelmapper.ModelMapper;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/v1/prices")
public class PricesController extends BaseController<Short, PricesModel, PricesRequestDto, PricesResponseDto> {
    public PricesController(PricesCrudUseCase pricesCrudUseCase, ModelMapper modelMapper, MessageSource messageSource) {
        super(pricesCrudUseCase, modelMapper, messageSource);
    }
}
