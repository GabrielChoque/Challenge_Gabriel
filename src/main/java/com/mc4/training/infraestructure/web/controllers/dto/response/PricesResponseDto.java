package com.mc4.training.infraestructure.web.controllers.dto.response;

import com.mc4.commons.base.infrastructure.web.dto.response.ResponseDTO;
import lombok.Data;

import java.util.Date;

@Data
public class PricesResponseDto extends ResponseDTO<Short> {
    private Short brandId;
    private Date startDate;
    private Date endDate;
    private Integer priceList;
    private Short productId;
    private Integer priority;
    private Double price;
    private String curr;
}
