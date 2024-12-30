package com.mc4.training.infraestructure.web.controllers.dto.request;

import jakarta.persistence.Column;

import java.util.Date;

public class PricesRequestDto {
    private Short brandId;
    private Date startDate;
    private Date endDate;
    private Integer priceList;
    private Short productId;
    private Integer priority;
    private Double price;
    private String curr;
}
