package com.mc4.training.infraestructure.web.controllers;

import com.mc4.commons.base.infrastructure.web.controllers.BaseController;
import com.mc4.training.application.usecases.ListByFilterUseCase;
import com.mc4.training.application.usecases.PricesCrudUseCase;
import com.mc4.training.domain.model.PricesModel;
import com.mc4.training.infraestructure.web.controllers.dto.request.PricesRequestDto;
import com.mc4.training.infraestructure.web.controllers.dto.response.PricesResponseDto;
import com.mc4.training.infraestructure.web.controllers.dto.response.PricesResponseFilterDto;
import org.modelmapper.ModelMapper;
import org.springframework.context.MessageSource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

@RestController("api/v1/prices")
public class PricesController extends BaseController<Short, PricesModel, PricesRequestDto, PricesResponseDto> {

    private final ListByFilterUseCase listByFilterUseCase;
    public PricesController(PricesCrudUseCase pricesCrudUseCase, ModelMapper modelMapper, MessageSource messageSource, ListByFilterUseCase listByFilterUseCase) {
        super(pricesCrudUseCase, modelMapper, messageSource);
        this.listByFilterUseCase = listByFilterUseCase;
    }

    @GetMapping("/filter")
    public List<PricesResponseFilterDto> findByDateFilter(@RequestParam("startDate") @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX") ZonedDateTime startDate,
                                                          @RequestParam("productId") Short productId,
                                                          @RequestParam("curr") String curr){

        return listByFilterUseCase.execute(Date.from(startDate.toInstant()), productId, curr)
                .stream().map(prices -> modelMapper.map(prices, PricesResponseFilterDto.class)).toList();

    }
}
