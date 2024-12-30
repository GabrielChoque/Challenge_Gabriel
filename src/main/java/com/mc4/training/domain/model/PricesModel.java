package com.mc4.training.domain.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PricesModel {
    private Short id;
    private Short brandId;
    private LocalDate startDate;
    private LocalDate endDate;
    private Integer priceList;
    private Short productId;
    private Integer priority;
    private Double price;
    private String curr;
}
